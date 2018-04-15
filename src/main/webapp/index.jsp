<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<body>
<h1>Search Northwind</h1>
<form method="post" action="index">
    <input type="hidden" name="id" value="task1">
    <input type="submit" value="Products by Supplier">
</form>
<form method="post" action="index">
    <input type="hidden" name="id" value="task2">
    <input type="submit" value="Number of Products by Supplier">
</form>
<form method="post" action="index">
    <input type="hidden" name="id" value="task3">
    <input type="submit" value="Suppliers with more than 3 Products">
</form>
<form method="post" action="index">
    <input type="hidden" name="id" value="task4">
    <input type="submit" value="Customers and Order Numbers">
</form>
<form method="post" action="index">
    <input type="hidden" name="id" value="task5">
    <input type="submit" value="Most Expensive Product by Supplier">
</form>
</body>
</html>