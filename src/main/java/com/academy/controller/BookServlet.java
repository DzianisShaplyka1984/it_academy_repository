package com.academy.controller;

import com.academy.model.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("Ivan", "password", 25);
        req.setAttribute("user", user);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user);
        users.add(user);

        req.setAttribute("users", users);

        req.getRequestDispatcher("/WEB-INF/jsp/book.jsp").forward(req, resp);
    }
}
