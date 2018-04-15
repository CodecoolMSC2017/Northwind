<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<body>
<h1>Query Results</h1>
<form method="post" action="result">
    <select name="column">
        <c:forEach var="head" items="${headers}">
            <option value="${headers.indexOf(head)}">${head}</option>
        </c:forEach>
    </select>
    <c:out value="  equals  "/>
    <input type="text" name="criteria">
    <input type="hidden" name="id" value="${task}">
    <input type="submit" value="Filter">
</form>
<table>
    <thead>
    <tr>
        <c:forEach var="head" items="${headers}">
            <th>${head}</th>
        </c:forEach>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="result" items="${results}">
        <tr>
            <c:forEach var="entry" items="${result}">
                <td>
                    <c:out value="${entry}"/>
                </td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br>
<form method="get" action="result">
    <input type="hidden" name="id" value="back">
    <input type="submit" value="Back to Main">
</form>
</body>
</html>
