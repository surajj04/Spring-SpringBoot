package org.bytetech;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("In service..");
    }
}
