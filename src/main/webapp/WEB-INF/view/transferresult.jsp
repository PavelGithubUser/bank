<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 17.08.2018
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> messages = (List<String>) request.getAttribute("messages");
    for (String message : messages) {
        out.println(message + "<p>");
    }
%>
</body>
</html>
