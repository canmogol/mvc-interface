# mvc-interface
MVC application with swing and javafx interfaces, same controller and model used for swing and javafx applications. Also there are two samples for application wiring; spring and hard coded.

### Application Startup
Check the [Main](https://github.com/canmogol/mvc-interface/blob/master/src/main/java/com/fererlab/app/Main.java) class for below methods
```java
startSpringSwing();
startSpringFX();
startNoSpringSwing();
```

### Spring
"ApplicationContext.xml", "JavaFX.xml" and "Swing.xml" configurations may be found under /src/main/resources/ folder.

Spring application with <b>Swing UI</b> starts as
```java
new ClassPathXmlApplicationContext("ApplicationContext.xml", "Swing.xml");
```

Spring application with <b>JavaFX UI</b> starts as
```java
new ClassPathXmlApplicationContext("ApplicationContext.xml", "JavaFX.xml");
```

### No Spring
Hardcoded dependencies and startup of same application may be found under [Main::startNoSpringSwing](https://github.com/canmogol/mvc-interface/blob/master/src/main/java/com/fererlab/app/Main.java#L36) method.
