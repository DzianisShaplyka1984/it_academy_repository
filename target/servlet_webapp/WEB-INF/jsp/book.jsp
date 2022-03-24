<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
Test1
Test2
Test3
Test4
</p>

<c:if test="${user.age > 20}">
    Hi is adult
</c:if>

<c:choose>
    <c:when test="${user.age > 20}">
        Hi is adult
    </c:when>
    <c:otherwise>
        Hi is child
    </c:otherwise>
</c:choose>

<c:forEach items="${users}" var="oneUser">
    ${oneUser.name} <br>
</c:forEach>

<br>
Test
<br>
${users[0].name}
</body>
</html>
