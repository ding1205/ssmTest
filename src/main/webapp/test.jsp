<%--
  Created by IntelliJ IDEA.
  User: 39517
  Date: 2020/5/20
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="updateGoods" method="post">
    <input type="hidden" name="sid" value="${goods.id}">
    <input type="text" name="goodsName" placeholder="用户名" value="${goods.goodsName}"><br>
    <input type="text" name="goodsPrice" placeholder="价格" value="${goods.goodsPrice}"><br>
    <input type="submit">
</form>
</body>
</html>
