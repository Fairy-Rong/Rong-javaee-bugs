package com.swufe.javaee.request_response;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SelectBeerServlet", value = "/SelectBeerServlet")
public class SelectBeerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String body = request.getParameter("body");
        if(body.equals("Select Beer Body")){
            RequestDispatcher rd = request.getRequestDispatcher("/error.html");
            rd.forward(request, response);
            return;
        }
        try {
            int amount = Integer.parseInt(request.getParameter("amount"));
            String[] sizes = request.getParameterValues("sizes");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>This is get response</h1>");
            out.println("<p>body: " + body + "</p>");
            out.println("<p>amount: " + amount + "</p>");
            for (String s : sizes) {
                out.println("<p>sizes: " + s + "</p>");
            }
            out.println("</body></html>");
        }catch (Exception e){
            RequestDispatcher rd = request.getRequestDispatcher("/error.html");
            rd.forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
        /*response.setContentType("text/html");
        String body = request.getParameter("body");
        int amount = Integer.parseInt(request.getParameter("amount")) + 1;
        String[] sizes = request.getParameterValues("sizes");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>This is post response</h1>");
        out.println("<p>body: " + body + "</p>");
        out.println("<p>amount: " + amount + "</p>");
        for (String s : sizes) {
            out.println("<p>sizes: " + s + "</p>");
        }
        out.println("</body></html>");*/
    }
}
