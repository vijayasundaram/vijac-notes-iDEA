package com.vijac.notes.controller;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import com.vijac.notes.model.User;
import com.vijac.notes.utility.PMHelper;
import com.vijac.notes.utility.PasswordHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/account/")
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String showRegisterView(){
        return "user/register";
    }

	@RequestMapping(value = "/register",method = RequestMethod.POST)
    public String sendConfirmationMail(@RequestParam("email") String email,@RequestParam("name") String name,Model model) throws Exception {
        //Generate a random String
        SecureRandom random = new SecureRandom();
        String randPassword = new BigInteger(35, random).toString(32);
        String randId = new BigInteger(70,random).toString(10);
        logger.info("Generated password for "+email+" is "+randPassword);
        logger.info(randId);
        //Generate a password hash
        String hashedPassword = PasswordHelper.getSaltedHash(randPassword);



        //Check if user already exist
        PersistenceManager pm = PMHelper.get().getPersistenceManager();
        List<User> results = null;
        Query q = pm.newQuery(User.class);
        q.setFilter("email =='"+email+"'");
        try {
            results = (List<User>) q.execute();
            if (results.isEmpty()) {
                logger.info("Creating new User");
                User user = new User();
                //Adding default google profile pic for now
                user.setPicture("https://lh3.googleusercontent.com/-XdUIqdMkCWA/AAAAAAAAAAI/AAAAAAAAAAA/4252rscbv5M/photo.jpg");
                user.setId(randId);
                user.setName(name);
                user.setEmail(email);
                user.setHashedPassword(hashedPassword);
                user.setCreated(new Date());
                pm.makePersistent(user);


                //Send a welcome email
                String testEmail = "vijay.sundaram@a-cti.com";
                String msgBody = "Hi, "+name +"\r\n Your password is "+randPassword;
                Properties props = new Properties();
                Session sessionMail = Session.getDefaultInstance(props, null);
                try {
                    Message msg = new MimeMessage(sessionMail);
                    msg.setFrom(new InternetAddress("vijay.sundaram@a-cti.com", "Notes App"));
                    msg.addRecipient(Message.RecipientType.TO,
                            new InternetAddress(email, name));
                    msg.setSubject("Welcome to Notes: Account creation successful!");
                    msg.setText(msgBody);
                    Transport.send(msg);

                } catch (AddressException e) {
                    // ...
                } catch (MessagingException e) {
                    // ...
                }

                model.addAttribute("status","success");
                model.addAttribute("message","We have sent a password to your email address");

            }
            else{
                logger.info("User exist already:)");
                model.addAttribute("status","error");
                model.addAttribute("message","User "+email+" is already registered with us!");
            }

        } finally {
            q.closeAll();
            pm.close();
        }

        model.addAttribute("email",email);
        return "user/login";
    }

    @RequestMapping(value = "/authenticate",method = RequestMethod.POST)
    public ModelAndView authenticateUser(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session,Model model) throws Exception {
        //Retrieve the user with email specified
        PersistenceManager pm = PMHelper.get().getPersistenceManager();
        Query q = pm.newQuery(User.class, "email == value");
        q.declareParameters("String value");
        @SuppressWarnings("unchecked")
        List<User> results = (List<User>) q.execute(email);
        @SuppressWarnings("rawtypes")
        Iterator iter = results.iterator();
        User currentUser = null;
        while (iter.hasNext())
        {
            currentUser = (User)iter.next();
        }
        String stored = currentUser.getHashedPassword();
        boolean validAuth = PasswordHelper.check(password,stored);
        System.out.print(validAuth);
        if(validAuth) {
            session.setAttribute("name", currentUser.getName());
            session.setAttribute("email", email);
            session.setAttribute("picture", currentUser.getPicture());
            session.setAttribute("id", currentUser.getId());
            ModelAndView view=new ModelAndView("redirect:/");
            return view;
        }else {
            model.addAttribute("email", email);
            model.addAttribute("status","error");
            model.addAttribute("message","Incorrect email or password entered!");

            ModelAndView view = new ModelAndView("redirect:/login");
            return view;
        }

    }

}
