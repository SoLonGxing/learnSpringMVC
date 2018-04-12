<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<%@page session="false"%>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
<h1>Register</h1>
<form method="POST">
    First Name: <input type="text"  name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Username： <input type="text" name="username"/><br/>
    Password: <input type="text" name="password"/><br/>

    <input type="submit" value="Register"/>
</form>
<sf:form method="post" commandName="spitter">
    <sf:label path="firstName" cssErrorClass="error">First Name:</sf:label>
    <sf:input path="firstName" cssErrorClass="error"/><br/>
    Last Name: <sf:input path="lastName"/><br/>
    Username： <sf:input path="username"/><br/>
    Password: <sf:password path="password"/><br/>
</sf:form>
</body>
</html>