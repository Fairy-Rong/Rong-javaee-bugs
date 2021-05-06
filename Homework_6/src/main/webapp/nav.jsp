<%--
  Created by IntelliJ IDEA.
  User: wuyerong
  Date: 2021/4/25
  Time: 1:45 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand navbar-dark bg-dark" aria-label="Second navbar example">
    <div class="container-fluid">
        <a class="navbar-brand" href="foo.jsp">Foo-Counter</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExample02">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="counter.jsp">Counter</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="sameHobby.html">Find friends</a>
                </li>
            </ul>
            <form>
                <input class="form-control" type="text" placeholder="Search" aria-label="Search">
            </form>
        </div>
    </div>
</nav>
<!--
    <ul class="nav nav-pills">
        <li role="presentation" class="active"><a href="foo.jsp">Foo-Counter</a></li>
        <li role="presentation"><a href="counter.jsp">Counter</a></li>
        <li role="presentation"><a href="sameHobby.html">Find friends</a></li>
    </ul>-->
</body>
</html>
