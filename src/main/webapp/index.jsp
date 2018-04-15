<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Query Select</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">
</head>
<html lang="en">
<body>
<h1>Search Northwind!</h1>
<br>
<form method="post" action="index">
    <input type="hidden" name="id" value="task1">
    <input type="submit" value="Products by Supplier">
</form>
<br>
<form method="post" action="index">
    <input type="hidden" name="id" value="task2">
    <input type="submit" value="Number of Products by Supplier">
</form>
<br>
<form method="post" action="index">
    <input type="hidden" name="id" value="task3">
    <input type="submit" value="Suppliers with more than 3 Products">
</form>
<br>
<form method="post" action="index">
    <input type="hidden" name="id" value="task4">
    <input type="submit" value="Customers and Order Numbers">
</form>
<br>
<form method="post" action="index">
    <input type="hidden" name="id" value="task5">
    <input type="submit" value="Most Expensive Product by Supplier">
</form>
</body>
</html>