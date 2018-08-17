<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Transfer</h1>

<form:form method="POST" modelAttribute="transfermodel">
    <spring:bind path="fromAccaunt">
        <p>from <input type="text" name="fromAccaunt" id="fromAccaunt" class="field"/> <br/>
    </spring:bind>

    <spring:bind path="toAccaunt">
        <p>to <input type="text" name="toAccaunt" id="toAccaunt" class="field"/> <br/>
    </spring:bind>

    <spring:bind path="amountTransfer">
        <p>amount<input type="text" name="amountTransfer" id="amountTransfer" class="field"/> <br/>
    </spring:bind>

    <input type="submit" value="Transfer" id="submit" />
</form:form>

</body>
</html>
