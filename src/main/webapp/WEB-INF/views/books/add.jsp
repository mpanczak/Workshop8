<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add</title>
</head>
<body>

<h3>Add book</h3>

<form:form method="post" modelAttribute="book">

    <div>Author: <form:input path="author"/></div><br>
    <div>ISBN: <form:input path="isbn"/></div><br>
    <div>Publisher: <form:input path="publisher"/></div><br>
    <div>Title: <form:input path="title"/></div><br>
    <div>Type: <form:input path="type"/></div><br>
    <input type="submit" value="Add book">
</form:form>

</body>
</html>
