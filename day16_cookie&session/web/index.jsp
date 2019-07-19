<%--
  Created by IntelliJ IDEA.
  User: 陈亚萌
  Date: 2019/7/19
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <%
      response.getWriter().write("response111111");
    %>

  <%
    System.out.println("hello jsp");
    int i=5;
    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>
  <%!
    int i=3;
  %>
  <%= "hello"%>

   hi, jsp
  </body>
</html>
