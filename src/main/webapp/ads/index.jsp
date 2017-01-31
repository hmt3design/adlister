<%--
  Created by IntelliJ IDEA.
  User: Harry
  Date: 1/31/17
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Ad catalog" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Complete ad listing</h1>

    <c:forEach var="ad" items="${ads}">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
    </c:forEach>
</div>

</body>
</html>