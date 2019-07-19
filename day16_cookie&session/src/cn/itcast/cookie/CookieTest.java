package cn.itcast.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/19
 */

/*
* 1. 可以采用cookie完成
			2. 在服务器的servlet判断是否有一个名为lastTime的cookie
				1. 有：不是第一次访问
					1. 响应数据：欢迎回来，您上次访问的时间 是：2019年7月19日11:19:43
					2. 写回Cookie：lastTime=2019年7月19日11:19:43
				2. 没有：是第一次访问
					1. 响应数据：您好，欢迎访问
					2. 写回cookie：lastTime=2019年7月19日11:19:43
*
* */
@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置消息体格式以及编码
        response.setContentType("text/html;charset=utf-8");
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
                    response.getWriter().write("欢迎回来，您上次访问的时间为："+value);

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
            response.getWriter().write("欢迎首次访问：");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
