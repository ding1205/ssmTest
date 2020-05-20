<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:formatDate value="${row.startTime}" pattern="yyyy-MM-dd"/>
<%--
  Created by IntelliJ IDEA.
  User: 39517
  Date: 2020/5/19
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="test.jsp">新增</a>
<form method="post" method="/selectName">
    <input placeholder="请输入姓名" name="goodsName">
    <input type="submit">
</form>
<table>
    <tr>
        <th>商品名</th>
        <th>价格</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${list}" var="row">
        <tr>
            <td>${row.goodsName}</td>
            <td>${row.goodsPrice}</td>
           <td><a href="./del?id=${row.id}">删除</a></td>
            <td><a href="selectGoods?id=${row.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
