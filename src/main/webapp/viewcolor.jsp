<%--
  Created by IntelliJ IDEA.
  User: jamesosullivan
  Date: 7/20/23
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View your color</title>
</head>
<body>
  <style>

    body {
      background-color: <%= request.getParameter("color")%>;
    }

  </style>
</body>
</html>
