<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h1><c:out value="${ad.title}" /></h1>
        <p><c:out value="v${ad.title}" /></p>
</body>
</html>
