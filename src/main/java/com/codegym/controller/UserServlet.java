package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.user.IUserService;
import com.codegym.service.user.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    private IUserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "login": {

                break;
            }
            case "register": {

                break;
            }
            default: {
                showUserList(request, response);
                break;
            }
        }
    }


    private void showUserList(HttpServletRequest request, HttpServletResponse response) {
        String user_name = request.getParameter("q");
        List<User> users;
        if (user_name == null || user_name.equals("")) {
            users = userService.getAll();
        } else {
            users = userService.findUserByName(user_name);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        request.setAttribute("users", users);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {

                break;
            }
        }
    }
}
