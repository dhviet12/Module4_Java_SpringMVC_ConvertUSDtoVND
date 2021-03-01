<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01-Mar-21
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<h1>Convert USD to VND</h1>

<form action="/convert" method="post">
    <input type="number" name="amount" id="amount" placeholder="enter USD">
    <input type="submit" value="Convert">
</form>
<h2>Result: ${result} vnd</h2>

</body>
</html>
