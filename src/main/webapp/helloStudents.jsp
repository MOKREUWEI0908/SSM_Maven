<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 莫君炜
  Date: 2019/12/18
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>学生用户信息查询</title>
</head>

<body>
<table border="1">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>民族</th>
        <th>所在专业</th>
        <th>所在班级</th>
        <th>所在宿舍</th>
        <th>联系方式</th>
        <th>公寓信息</th>
    </tr>
    <c:forEach items="${sessionScope.students}" var="stu">
        <tr>
            <td><c:out value="${stu.s_number}"></c:out></td>
            <td><c:out value="${stu.s_name}"></c:out></td>
            <td><c:out value="${stu.s_sex}"></c:out></td>
            <td><c:out value="${stu.s_national}"></c:out></td>
            <td><c:out value="${stu.s_major}"></c:out></td>
            <td><c:out value="${stu.s_class}"></c:out></td>
            <td><c:out value="${stu.s_abnum}"></c:out></td>
            <td><c:out value="${stu.s_tel}"></c:out></td>
            <td><c:out value="${stu.s_adnum}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
