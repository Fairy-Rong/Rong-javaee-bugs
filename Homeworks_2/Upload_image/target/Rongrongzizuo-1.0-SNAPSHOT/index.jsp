<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form enctype="multipart/form-data" action="RongServlet" method="Post">
    <input type="file" name="File">
    <button type="submit" >Post Submit</button>
</form>

</body>
</html>