package com.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

public class UserRegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email"); // Get email instead of username
        String password = request.getParameter("password");

        response.setContentType("text/html");
        response.getWriter().println("<h3>User Registered Successfully!</h3>");
        response.getWriter().println("<p>Email: " + email + "</p>");
    }
}
