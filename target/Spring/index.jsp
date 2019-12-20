
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<body>

<form action="${pageContext.request.contextPath}/MyServlet.view" method="post">
    <input type="submit" value="查询学生信息"/>
</form>

<form action="${pageContext.request.contextPath}/UpdateServlet.view" method="post">
    更新学生姓名：<br>
    更新姓名：<input type="text" name="s_name"/>
    更新学生的学号<input type="text" name="s_number"/>
    <input type="submit" value="提交更新"/>
</form>

</body>
</html>
