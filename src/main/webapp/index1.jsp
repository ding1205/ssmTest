<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach items="${list}" var="row">
    ${row.goodsName}&nbsp;&nbsp;${row.goodsPrice}<br>
</c:forEach>
</body>
</html>
