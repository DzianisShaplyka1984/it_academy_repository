package com.academy.controller;

import com.academy.model.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (("qwert".equals(login)) && ("password".equals(password))) {
            writer.println("Hello Qwert");

            HttpSession session = req.getSession();

            session.setAttribute("user", new User(login, password, 0));
        } else {
            writer.println("Authentication failed");
        }

        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
