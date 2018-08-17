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
<%--<form action="<c:url value='/transfer' />" method="POST">--%>
<%--<form action="#" th:action="@{/transfer}" th:object="${transfermodel}" method="post">--%>
    <%--From score--%>
    <%--<input name="scorefrom" type="text" th:field="*{fromAccaunt}"/><br/>--%>
    <%--<p>--%>
     <%--To score--%>
        <%--<input name="scoreto" type="text" th:field="*{toAccaunt}"/><br/>--%>
    <%--<p>--%>
    <%--Enter amount--%>
    <%--<input name="amount" type="text" th:field="*{amountTransfer}"/><br/>--%>
    <%--<p>--%>
     <%--<input type="submit" value="Transfer"/>--%>
<%--</form>--%>


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
