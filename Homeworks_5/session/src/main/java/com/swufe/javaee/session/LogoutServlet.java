package com.swufe.javaee.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value ="/log-out" )
public class LogoutServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();

        Cookie cookie = new Cookie("user", null);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        resp.addCookie(cookie);

        resp.sendRedirect("sign-in.html");
    }
}
