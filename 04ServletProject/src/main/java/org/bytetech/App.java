package org.bytetech;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.Servlet;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            Tomcat tomcat = new Tomcat();
//            tomcat.setPort(8080);

            Context context = tomcat.addContext("", null);

            Tomcat.addServlet(context, "HomeServlet");
            
            tomcat.start();
            System.out.println("Tomcat started on port: " + tomcat.getServer().getPort());

            // Keep the server running
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace(); // Better error handling
        }
    }
}
