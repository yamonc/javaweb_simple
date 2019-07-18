package cn.itcast.web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/servletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //servletContext的获取方式
        ServletContext context = this.getServletContext();
        //获取服务器路径
        String realPath = context.getRealPath("/b.txt");//web目录下资源换访问
        System.out.println(realPath);
        //File file=new File(realPath);
        String realPath1 = context.getRealPath("/WEB-INF/c.txt");//web-inf目录下的路径
        System.out.println(realPath1);
        String realPath2 = context.getRealPath("/WEB-INF/classes/a.txt");//src下的资源路径

        System.out.println(realPath2);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
