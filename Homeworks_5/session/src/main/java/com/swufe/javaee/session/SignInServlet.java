package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    private Map<String, String> users = new HashMap<>();

    @Override
    public void init() throws ServletException {
        String path = getServletContext().getRealPath("/") + "password.txt";
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()){
                String user = scanner.nextLine();
                String[] x =user.split(" ");
                users.put(x[0],x[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inputName");
        String password =req.getParameter("inputPassword");
        String[] remember_me = req.getParameterValues("remember-me");

        PrintWriter out = resp.getWriter();

        if (users.get(name)==null){
            out.println("<h1> Baby~Your username doesn't exist~Brother Pu,I can't understand javaee!</h1> ");
        }
        else if (!users.get(name).equals(password)){
            out.println( "<h1> Baby~Your password is incorrect~Brother Pu,I can't understand javaee!</h1> ");
        }
        else {
            if (remember_me != null) {
                Cookie cookie = new Cookie("user", name);
                cookie.setMaxAge(604800);
                cookie.setPath("/");
                resp.addCookie(cookie);
            }

            req.getSession().setAttribute("user", name);
            resp.sendRedirect("index");
        }
    }
}
