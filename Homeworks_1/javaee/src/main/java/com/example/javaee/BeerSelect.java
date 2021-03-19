package com.example.javaee;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(name = "Ch3 Beer",value ="/SelectBeer.do")
public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result =be.getBeer(c);

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        //out.println("Beer Selection Advice<br>");

        //Iterator it = result.iterator();
        //while (it.hasNext()){
            //out.println("<br>try:"+it.next());
        //}
        request.setAttribute("styles",result);

         RequestDispatcher view =
                 request.getRequestDispatcher("result.jsp");

         view.forward(request,response);
    }
}
