<%--
  Created by IntelliJ IDEA.
  User: Harry
  Date: 1/30/17
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guestbook</title>
</head>
<body>
<h1>Welcome to the Guestbook</h1>
<%= request.getAttribute("lastPost")%>
<form action="/guestbook" method="post">
    <label for="comment">leave a comment</label>
    <textarea name="comment" id="comment" cols="30" rows="10"></textarea>
    <button type="submit">Comment!</button>
</form>
</body>
</html>
