<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Transfer</h1>
<form action="<c:url value='/transfer' />" method="POST">
    From score
    <input name="scorefrom" type="text"/><br/>
    <p>
     To score
        <input name="scoreto" type="text"/><br/>
    <p>
    Enter amount
    <input name="amount" type="text"/><br/>
    <p>
     <input type="submit" value="Transfer"/>
</form>
</body>
</html>
