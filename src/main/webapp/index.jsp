<%@ include file="partials/top.jsp"%>
<html>
<head>
    <%@include file="partials/header.jsp"%>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
<%@ include file="partials/footer.jsp" %>
</body>
</html>
