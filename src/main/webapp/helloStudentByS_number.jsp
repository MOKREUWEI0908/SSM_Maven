<%--
  Created by IntelliJ IDEA.
  User: 莫君炜
  Date: 2019/12/20
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>更新</title>
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
        <tr>
            <td>${studentByS_number.s_number}</td>
            <td>${studentByS_number.s_name}</td>
            <td>${studentByS_number.s_sex}</td>
            <td>${studentByS_number.s_national}</td>
            <td>${studentByS_number.s_major}</td>
            <td>${studentByS_number.s_class}</td>
            <td>${studentByS_number.s_abnum}</td>
            <td>${studentByS_number.s_tel}</td>
            <td>${studentByS_number.s_adnum}</td>
        </tr>
</table>

</body>
</html>
