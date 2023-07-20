<%--
  Created by IntelliJ IDEA.
  User: jamesosullivan
  Date: 7/20/23
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<h3>Pick a number between 1 and 3!</h3>

<form action="guess" method="post">
    <label for="number">Pick your number</label>
    <input type="text" name="number" id="number" placeholder="Pick your number"><br>
    <button type="submit">Submit the form</button>

</form>


</body>
</html>
