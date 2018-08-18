<%@ page import="java.util.List" %>
<%@ page import="com.example.bank.entity.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Customer> customers = (List<Customer>) request.getAttribute("customers");
    for (Customer customer : customers) {
        out.println(customer.getFirstname() + " " +
                customer.getLastname() + " " +
                customer.getAccount() + " " +
                customer.getBirthday() + " " +
                customer.getAmount() + " " +
                "<p>");
    }
%>
<a href="/transferpage" methods="GET">Transfer money</a>
</body>
</html>
