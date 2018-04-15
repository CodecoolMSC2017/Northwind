<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<body>
<h1>Query Results</h1>
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
</body>
</html>
