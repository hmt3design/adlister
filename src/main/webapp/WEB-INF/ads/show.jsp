<%--
  Created by IntelliJ IDEA.
  User: Harry
  Date: 2/2/17
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your new Ad" />
    </jsp:include>
</head>
<body>
<h1> ${ad.title}</h1>
<p>${ad.description}</p>
</body>
</html>
