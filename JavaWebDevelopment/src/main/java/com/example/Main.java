package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import com.example.UserRegistrationServlet; // Correct import

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        // Register the servlet at "/register"
        handler.addServletWithMapping(UserRegistrationServlet.class, "/register");

        System.out.println("Server started at http://localhost:8080/");
        server.start();
        server.join();
    }
}
