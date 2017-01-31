<%--
  Created by IntelliJ IDEA.
  User: Harry
  Date: 1/30/17
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="partials/top.jsp"%>

<html>
<head>
    <%@include file="partials/header.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<div class="container">
<h2>Please log in:</h2>
<form action="/login" method=post>
    <p><strong>Please enter your user name: </strong></p>
        <input type="text" name="username" size="25">
    <p><strong>Please enter your password: </strong></p>
    <input type="password" size="15" name="password">
    <input type="submit" value="Submit">
</form>
</div>
<%@include file="partials/footer.jsp"%>
</body>
</html>
