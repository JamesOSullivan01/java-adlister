<%--
  Created by IntelliJ IDEA.
  User: jamesosullivan
  Date: 7/19/23
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza form</title>
</head>
<body>

<form method="POST" action="pizza-order">


  <label for="Crust">Pick a crust!</label><br>
  <select name="crust" id="Crust">
    <option value="thin">Thin</option>
    <option value="Pan">Pan</option>
    <option value="deep">Deep</option>
    <option value="hand">Hand Tossed</option>
  </select>


<br>


  <label for="Sauce">Pick a sauce!</label><br>
  <select name="sauce" id="Sauce">
    <option value="Regular">Regular</option>
    <option value="White">White</option>
    <option value="garlic">garlic</option>
    <option value="housespecial">House Special</option>
  </select>


<br>


  <label for="size">Pick a size!</label><br>
  <select name="size" id="size">
    <option value="personal">Personal</option>
    <option value="Small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
  </select>


<br>


  <label>Pick your toppings!</label><br>
<%--  <input name="toppings" id="toppings" value="true">--%>
  Pepperoni <input type="radio" name="toppings" value="Pepperoni"><br>
  Sausage <input type="radio" name="toppings" value="Sausage"><br>
  Extra Cheese <input type="radio" name="toppings" value="Extra Cheese"><br>
  Veggies <input type="radio" name="toppings" value="Veggies"><br>



<br>

<button type="submit">Submit the form</button>

</form>


</body>
</html>
