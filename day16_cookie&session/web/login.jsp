<%--
  Created by IntelliJ IDEA.
  User: 陈亚萌
  Date: 2019/7/19
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload=function (ev) {
            document.getElementById("img").onclick=function (ev1) {

                this.src="/day16/checkCodeServlet?time="+new Date().getTime();
            }
        }
    </script>
    <style>
        div{

            color: red;
        }
    </style>
</head>
<body>
<form action="/day16/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkCode"></td>
        </tr>
        <tr>

            <td colspan="2"><img id="img" src="/day16/checkCodeServlet"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>



    <div>
        <%=request.getAttribute("cc_error")==null? "":request.getAttribute("cc_error")%>
    </div>
    <div>
        <%=request.getAttribute("login_error")==null? "":request.getAttribute("login_error")%>

    </div>
</form>
</body>
</html>
