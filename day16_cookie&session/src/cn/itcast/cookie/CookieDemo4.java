package cn.itcast.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/19
 */

/*
* Cookie的快速入门
*
* */
@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1创建Cookie对象
        Cookie c1=new Cookie("msg","setMaxAge");
        //设置cookie的存活时间
        //c1.setMaxAge(30);//将cookie持久化到硬盘，30s后会自动删除文件
       // c1.setMaxAge(-1);
        c1.setMaxAge(300);
        //发送Cookie
        response.addCookie(c1);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
