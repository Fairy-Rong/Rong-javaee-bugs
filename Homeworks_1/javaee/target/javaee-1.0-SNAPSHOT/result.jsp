<%@ page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.javaee.Beer" %>
<%--
  Created by IntelliJ IDEA.
  User: rongrong
  Date: 2021/3/19
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>

<%
   ArrayList styles =(ArrayList)request.getAttribute("styles");

   for(Object s: styles){
       out.print("<br>try:"+((Beer)s).toString());
   }
%>
</body>
</html>
