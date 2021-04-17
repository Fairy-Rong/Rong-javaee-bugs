package com.example.homework_log;

import org.apache.log4j.Logger;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private Logger 普哥我听不懂课 =Logger.getLogger(HelloServlet.class);

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        普哥我听不懂课.fatal("普哥，我真的听不懂课啊！救命！");
        普哥我听不懂课.warn("普哥，我枯了，你呢？");
        普哥我听不懂课.error("普哥，讲点简单的吧！");
        普哥我听不懂课.info("融融顶不住了！");
        普哥我听不懂课.debug("普哥求过！");
    }

    public void destroy() {
    }
}