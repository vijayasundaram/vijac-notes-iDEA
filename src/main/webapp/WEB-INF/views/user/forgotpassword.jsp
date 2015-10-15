<!DOCTYPE html>
<html>
<head>
    <title>Forgot Password | Notes</title>
    <link href="/resources/css/bootstrap.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/css/login.css">
</head>
<body>
<div class="container">

    <div class="card card-container">
        <form class="form-signin" action="/account/forgotmypassword/" method="post">
            <span id="reauth-email" class="reauth-email"></span>
            <input type="email" id="inputEmail" class="form-control" name="email" placeholder="Email address" required>
            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Send me a Password</button>
        </form><!-- /form -->
    </div><!-- /card-container -->
</div><!
</body>
</html>