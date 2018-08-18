<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>

<div id="caption">Transfer</div>
<div id="transferBox">
<form:form method="POST" modelAttribute="transfermodel">
    <spring:bind path="fromAccaunt">
        <label>Sender's account</label> <input type="text" name="fromAccaunt" id="fromAccaunt" class="field"/> <br/><br/>
    </spring:bind>

    <spring:bind path="toAccaunt">
        <label>Rrecipient's account</label><input type="text" name="toAccaunt" id="toAccaunt" class="field"/> <br/><br/>
    </spring:bind>

    <spring:bind path="amountTransfer">
        <label>Transfer amount</label><input type="text" name="amountTransfer" id="amountTransfer" class="field"/> ₽
    </spring:bind>

    <input type="submit" value="Transfer" id="submit" />

</form:form>
</div>
<br/>
<a href="/customerlist" methods="GET" id="refcustomers">View all customers</a>

</body>
</html>
