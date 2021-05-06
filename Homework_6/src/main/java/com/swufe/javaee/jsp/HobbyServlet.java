package com.swufe.javaee.jsp;

import com.sun.org.apache.xerces.internal.xs.StringList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, List<String>> userHobby;

    public List getList(String a){
        List<String> list = new ArrayList<>();
        list.add(a);
        return list;
    }
    @Override
    public void init() {
       userHobby = new HashMap<>();
       userHobby.put("Bob",getList("skiing"));
       userHobby.put("Jim", getList("skiing"));
       userHobby.put("James", getList("knitting"));
       userHobby.put("Tom", getList("knitting"));
       userHobby.put("Fei", getList("scuba"));
       userHobby.put("Jone", getList("scuba"));
       userHobby.put("Fred", getList("dating"));
       userHobby.put("Pradeep", getList("dating"));
       userHobby.put("Philippe", getList("dating"));
       userHobby.get("Bob").add("rap");
       userHobby.get("Jim").add("code");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           for (String h:v) {
               if (h.equals(hobby)){
                   names.add(k);
                   break;
               }
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }

}
