<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: 陈亚萌
  Date: 2019/7/19
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>itcast</title>
</head>
<body>
<%


    //1h获取所有的cookie
    Cookie[] cookies = request.getCookies();
    boolean flag=false;//没有cookie为lastTime

    //2遍历cookie数组
    if (cookies!=null&&cookies.length>0){
        for (Cookie cookie:cookies) {
            //获取名称
            String name = cookie.getName();
            //判断是否是lastTime
            if ("lastTime".equals(name)){
                flag=true;//存在lastTime
                //you,bushi diyici fangwen
                //设置cookie的value
                //获取当前时间的字符串，重新设置cookie的值重新发送cookie
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月DD日 HH:mm:ss");
                String str_date = sdf.format(date);
                System.out.println("编码前："+str_date);
                //url编码

                str_date = URLEncoder.encode(str_date, "utf-8");
                System.out.println("编码后："+str_date);

                cookie.setValue(str_date);

                //设置cookie的存活时间
                cookie.setMaxAge(60*60*24*30);
                response.addCookie(cookie);
                //响应数据
                //获取cookie的value
                String value = cookie.getValue();
                //
                System.out.println("解码前："+value);
                //url解码
                value= URLDecoder.decode(value,"utf-8");
                System.out.println("解码后"+value);
                out.write("欢迎回来，您上次访问的时间为："+value);

                break;
            }
        }
    }
    if (cookies==null||cookies.length==0||flag==false){
        //没有
        //you,bushi diyici fangwen
        //设置cookie的value
        //获取当前时间的字符串，重新设置cookie的值重新发送cookie
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月DD日 HH:mm:ss");
        String str_date = sdf.format(date);
        System.out.println("编码前："+str_date);
        //url编码

        str_date = URLEncoder.encode(str_date, "utf-8");
        System.out.println("编码后："+str_date);

        Cookie cookie=new Cookie("lastTime","str_date");


        //设置cookie的存活时间
        cookie.setMaxAge(60*60*24*30);
        response.addCookie(cookie);
        out.write("欢迎首次访问：");

    }


%>
<input>
</body>
</html>
