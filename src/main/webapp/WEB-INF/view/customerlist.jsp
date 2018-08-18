<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.bank.entity.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>

<div id="reftran"><a href="/transferpage" methods="GET">Transfer money</a></div>

<div id="tablecust">
<table border=\"1\" cellspacing=\"0\" cellpadding=\"5\">
<tr>
    <td>First Name</td>
    <td>Last Name</td>
    <td>Account</td>
    <td>Birthday</td>
    <td>Amount</td>
</tr>
<%
    List<Customer> customers = (List<Customer>) request.getAttribute("customers");
    for (Customer customer : customers) {
        out.println("<tr>" + "<td>" +
                customer.getFirstname() + "</td><td>" +
                customer.getLastname() + "</td><td>" +
                customer.getAccount() + "</td><td>" +
                customer.getBirthday() + "</td><td>" +
                customer.getAmount() + " p.</td></tr>");
    }
%>
</table>
</div>
</body>
</html>
