<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Client</title>
</head>
<body>

<table border="1" class="table table-striped">
    <tr>
        <td>Номер</td>
        <td>Имя</td>
        <td>День Рождение</td>
    </tr>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td>${client.id}</td>
            <td>${client.name}</td>
            <td>${client.birthday}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
