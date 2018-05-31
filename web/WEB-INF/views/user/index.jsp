<%--
  Created by IntelliJ IDEA.
  User: jinyugai
  Date: 2018/5/30
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--标签的前缀--%>
<%--后面的jsp页中就可使用
<c:out> <c:if>之类的标签--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,user-scable=no,initial-scale=1.0,
          maximum-scale=1.0,minimum-scale=1.0">
    <meta http-equiv="x-ua-compatible" ,content="ie=edge">
    <title>用户管理</title>
</head>
<body>
<h2>
    用户管理2youZncu
</h2>
<table width="100%" border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>地址</th>
        <th>电话</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.address}</td>
        <td>${user.phone}</td>
        <td>
            <a href="delete/${user.id}" class="del" >删除</a>|
            <a href="edit/${user.id}" >修改</a>
        </td>
    </tr>
    </c:forEach>
</table>

<%--定义段落的标记，<p>称为开始标记，</p>称为结束标记。
把一段话写在这两个标记中间
，在用浏览器浏览的时候，浏览器会把这一段话显示为一个段落--%>
<p>
    <a href="add">新增</a>
</p>
<script>
    var items = document.querySelectorAll(".del");
    for(var i = 0; i < items.length ;i++){
        items[i].onclick=function () {
            return confirm("ZnCu你确定删除吗 ？");
        }
    }
</script>

</body>

</html>
