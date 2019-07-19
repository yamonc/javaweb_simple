<%--
  Created by IntelliJ IDEA.
  User: 陈亚萌
  Date: 2019/7/19
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%=request.getSession().getAttribute("user")%>,欢迎你</h1>
</body>
</html>
