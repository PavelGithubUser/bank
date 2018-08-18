<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
<div class="result">
    <%
        List<String> messages = (List<String>) request.getAttribute("messages");
        for (String message : messages) {
            out.println(message + "<p>");
        }
    %>
</div>

</body>
</html>