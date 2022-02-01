<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String string=(String) request.getAttribute("errMsg");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
</head>
<body>
 <%if(string!=null && !string.isEmpty()){ %>
<h1>
<%=string %>
</h1>
<%} %> 

<fieldset>
<legend>Long in form</legend>
<form action="./login" method="post" >

<table>
<tr>
<td><label>Enter your id:</label></td>
<td><input type="number" name="id" placeholder="Enter your id"></td>
</tr>

<tr>
<td><label>Enter your password:</label></td>
<td><input type="password" name="pass" placeholder="enter your password"></td>
</tr>
</table>
<input type="submit" value="LogIn">

</form>
</fieldset>

</body>
</html>