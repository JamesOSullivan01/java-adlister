<%--
  Created by IntelliJ IDEA.
  User: jamesosullivan
  Date: 7/18/23
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>playground</title>
</head>
<body>
<%! String name = "Jimmy"; %>
<h1><% name = "Bill"; %></h1>
<h1>Hello <%= name%></h1>
</body>
</html>
