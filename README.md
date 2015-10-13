Oct 13, 2015 2:53:22 PM java.util.prefs.WindowsPreferences <init>
WARNING: Could not open/create prefs root node Software\JavaSoft\Prefs at root 0x80000002. Windows RegCreateKeyEx(...) returned error code 5.
Oct 13, 2015 2:53:23 PM com.google.apphosting.utils.config.AppEngineWebXmlReader readAppEngineWebXml
INFO: Successfully processed D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF/appengine-web.xml
Oct 13, 2015 2:53:23 PM com.google.apphosting.utils.config.AbstractConfigXmlReader readConfigXml
INFO: Successfully processed D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF/web.xml
Oct 13, 2015 2:53:23 PM com.google.appengine.tools.development.SystemPropertiesManager setSystemProperties
INFO: Overwriting system property key 'java.util.logging.config.file', value 'C:\Users\User\.m2\repository\com\google\appengine\appengine-java-sdk\1.9.25\appengine-java-sdk\appengine-java-sdk-1.9.25\config\sdk\logging.properties' with value 'WEB-INF/logging.properties' from 'D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\appengine-web.xml'
Oct 13, 2015 2:53:23 PM com.google.apphosting.utils.jetty.JettyLogger info
INFO: Logging to JettyLogger(null) via com.google.apphosting.utils.jetty.JettyLogger
Connected to server
Oct 13, 2015 2:53:24 PM com.google.apphosting.utils.jetty.JettyLogger info
INFO: jetty-6.1.x
Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\appengine-api-stubs-1.9.27.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\appengine-testing-1.9.27.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\datanucleus-api-jdo-3.2.0-release.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\hamcrest-core-1.3.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\jsp-api-2.1.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\junit-4.12.jar
java.util.zip.ZipException: invalid CEN header (bad signature)
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\mockito-all-2.0.2-beta.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.apphosting.utils.jetty.JettyLogger warn
WARNING: Failed to read file: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\lib\servlet-api-2.5.jar
java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:215)
	at java.util.zip.ZipFile.<init>(ZipFile.java:145)
	at java.util.jar.JarFile.<init>(JarFile.java:154)
	at java.util.jar.JarFile.<init>(JarFile.java:118)
	at org.mortbay.jetty.webapp.TagLibConfiguration.configureWebApp(TagLibConfiguration.java:174)
	at org.mortbay.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1247)
	at org.mortbay.jetty.handler.ContextHandler.doStart(ContextHandler.java:517)
	at org.mortbay.jetty.webapp.WebAppContext.doStart(WebAppContext.java:467)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at org.mortbay.jetty.handler.HandlerWrapper.doStart(HandlerWrapper.java:130)
	at org.mortbay.jetty.Server.doStart(Server.java:224)
	at org.mortbay.component.AbstractLifeCycle.start(AbstractLifeCycle.java:50)
	at com.google.appengine.tools.development.JettyContainerService.startContainer(JettyContainerService.java:265)
	at com.google.appengine.tools.development.AbstractContainerService.startup(AbstractContainerService.java:288)
	at com.google.appengine.tools.development.AutomaticInstanceHolder.startUp(AutomaticInstanceHolder.java:26)
	at com.google.appengine.tools.development.AbstractModule.startup(AbstractModule.java:87)
	at com.google.appengine.tools.development.Modules.startup(Modules.java:105)
	at com.google.appengine.tools.development.DevAppServerImpl.doStart(DevAppServerImpl.java:258)
	at com.google.appengine.tools.development.DevAppServerImpl.access$000(DevAppServerImpl.java:47)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:213)
	at com.google.appengine.tools.development.DevAppServerImpl$1.run(DevAppServerImpl.java:211)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.google.appengine.tools.development.DevAppServerImpl.start(DevAppServerImpl.java:211)
	at com.google.appengine.tools.development.DevAppServerMain$StartAction.apply(DevAppServerMain.java:270)
	at com.google.appengine.tools.util.Parser$ParseResult.applyArgs(Parser.java:48)
	at com.google.appengine.tools.development.DevAppServerMain.run(DevAppServerMain.java:218)
	at com.google.appengine.tools.development.DevAppServerMain.main(DevAppServerMain.java:209)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)

Oct 13, 2015 2:53:25 PM com.google.appengine.tools.development.ApiProxyLocalImpl log
INFO: javax.servlet.ServletContext log: Initializing Spring root WebApplicationContext
Oct 13, 2015 2:53:25 PM org.springframework.web.context.ContextLoader initWebApplicationContext
INFO: Root WebApplicationContext: initialization started
Oct 13, 2015 2:53:26 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing Root WebApplicationContext: startup date [Tue Oct 13 14:53:26 IST 2015]; root of context hierarchy
Oct 13, 2015 2:53:26 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from ServletContext resource [/WEB-INF/spring/root-context.xml]
Oct 13, 2015 2:53:26 PM org.springframework.web.context.ContextLoader initWebApplicationContext
INFO: Root WebApplicationContext: initialization completed in 833 ms
Oct 13, 2015 2:53:27 PM com.google.appengine.tools.development.ApiProxyLocalImpl log
INFO: javax.servlet.ServletContext log: Initializing Spring FrameworkServlet 'vijac-notes'
Oct 13, 2015 2:53:27 PM org.springframework.web.servlet.FrameworkServlet initServletBean
INFO: FrameworkServlet 'vijac-notes': initialization started
Oct 13, 2015 2:53:27 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing WebApplicationContext for namespace 'vijac-notes-servlet': startup date [Tue Oct 13 14:53:27 IST 2015]; parent: Root WebApplicationContext
Oct 13, 2015 2:53:27 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from ServletContext resource [/WEB-INF/spring/appServlet/servlet-context.xml]
Oct 13, 2015 2:53:28 PM org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor <init>
INFO: JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/account/register],methods=[GET]}" onto public java.lang.String com.vijac.notes.controller.AccountController.showRegisterView()
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/account/register],methods=[POST]}" onto public java.lang.String com.vijac.notes.controller.AccountController.sendConfirmationMail(java.lang.String,java.lang.String,org.springframework.ui.Model) throws java.lang.Exception
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/account/authenticate],methods=[POST]}" onto public org.springframework.web.servlet.ModelAndView com.vijac.notes.controller.AccountController.authenticateUser(java.lang.String,java.lang.String,javax.servlet.http.HttpSession,org.springframework.ui.Model) throws java.lang.Exception
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/logout/]}" onto public java.lang.String com.vijac.notes.controller.HomeController.logoutUser(javax.servlet.http.HttpSession,org.springframework.ui.Model)
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/login/],methods=[GET]}" onto public java.lang.String com.vijac.notes.controller.HomeController.showLoginPage()
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/oauth2callback/],methods=[GET]}" onto public org.springframework.web.servlet.ModelAndView com.vijac.notes.controller.HomeController.showHome(java.lang.String,javax.servlet.http.HttpSession) throws java.io.IOException
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/],methods=[GET]}" onto public java.lang.String com.vijac.notes.controller.HomeController.showNotes(javax.servlet.http.HttpSession,org.springframework.ui.Model)
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/note/],methods=[POST]}" onto public void com.vijac.notes.controller.NoteController.addNote(java.lang.String,java.lang.String,javax.servlet.http.HttpSession)
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/note/{key}/],methods=[DELETE]}" onto public void com.vijac.notes.controller.NoteController.deleteNote(java.lang.String,javax.servlet.http.HttpSession)
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/note/],methods=[GET]}" onto public java.util.List<com.vijac.notes.model.Note> com.vijac.notes.controller.NoteController.listUserNotes(javax.servlet.http.HttpSession)
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/note/{key}/],methods=[PUT]}" onto public void com.vijac.notes.controller.NoteController.editNote(java.lang.String,java.lang.String,java.lang.String)
Oct 13, 2015 2:53:28 PM org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$MappingRegistry register
INFO: Mapped "{[/note/{key}/],methods=[GET]}" onto public com.vijac.notes.model.Note com.vijac.notes.controller.NoteController.getNote(java.lang.String)
Oct 13, 2015 2:53:29 PM org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter initControllerAdviceCache
INFO: Looking for @ControllerAdvice: WebApplicationContext for namespace 'vijac-notes-servlet': startup date [Tue Oct 13 14:53:27 IST 2015]; parent: Root WebApplicationContext
Oct 13, 2015 2:53:29 PM org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter initControllerAdviceCache
INFO: Looking for @ControllerAdvice: WebApplicationContext for namespace 'vijac-notes-servlet': startup date [Tue Oct 13 14:53:27 IST 2015]; parent: Root WebApplicationContext
Oct 13, 2015 2:53:30 PM org.springframework.web.servlet.handler.AbstractUrlHandlerMapping registerHandler
INFO: Mapped URL path [/resources/**] onto handler 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0'
Oct 13, 2015 2:53:30 PM org.springframework.web.servlet.FrameworkServlet initServletBean
INFO: FrameworkServlet 'vijac-notes': initialization completed in 3021 ms
Oct 13, 2015 2:53:30 PM com.google.apphosting.utils.jetty.JettyLogger info
INFO: Started SelectChannelConnector@127.0.0.1:8888
Oct 13, 2015 2:53:30 PM com.google.appengine.tools.development.AbstractModule startup
INFO: Module instance default is running at http://localhost:8888/
Oct 13, 2015 2:53:30 PM com.google.appengine.tools.development.AbstractModule startup
INFO: The admin console is running at http://localhost:8888/_ah/admin
Oct 13, 2015 2:53:30 PM com.google.appengine.tools.development.DevAppServerImpl doStart
INFO: Dev App Server is now running
Oct 13, 2015 2:53:58 PM com.google.appengine.api.datastore.dev.LocalDatastoreService init
INFO: Local Datastore initialized: 
	Type: High Replication
	Storage: D:\iDEA-Workspace\Vijac-Notes.Idea\target\com.vijac.notes-1.0-SNAPSHOT\WEB-INF\appengine-generated\local_db.bin
Oct 13, 2015 2:53:58 PM com.google.appengine.api.datastore.dev.LocalDatastoreService load
INFO: Time to load datastore: 21 ms
Oct 13, 2015 2:54:28 PM com.google.appengine.api.datastore.dev.LocalDatastoreService$PersistDatastore persist
INFO: Time to persist datastore: 4 ms
Oct 13, 2015 2:54:58 PM com.google.appengine.api.datastore.dev.LocalDatastoreService$PersistDatastore persist
INFO: Time to persist datastore: 1 ms
Oct 13, 2015 2:57:28 PM com.google.appengine.api.datastore.dev.LocalDatastoreService$PersistDatastore persist
INFO: Time to persist datastore: 1 ms
Oct 13, 2015 4:05:28 PM com.google.appengine.api.datastore.dev.LocalDatastoreService$PersistDatastore persist
INFO: Time to persist datastore: 1 ms
Oct 13, 2015 4:56:58 PM com.google.appengine.api.datastore.dev.LocalDatastoreService$PersistDatastore persist
INFO: Time to persist datastore: 1 ms
Oct 13, 2015 4:57:28 PM com.google.appengine.api.datastore.dev.LocalDatastoreService$PersistDatastore persist
INFO: Time to persist datastore: 1 ms
