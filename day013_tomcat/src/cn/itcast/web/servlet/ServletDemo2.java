package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2 implements Servlet {

    /*
    * 初始化方法，
    * 在servlet创建的时候执行，且只执行一次
    *
    *
    * */


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");
    }
    /*
    * 获取servletConfig对象
    * servletConfig：servlet的配置对象
    * */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    /*提供服务的方法，每一次servlet被访问时执行，执行多次*/
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service....");
    }
    /*
    * 获取servlet的一些信息，版本作者等等
    * */
    @Override
    public String getServletInfo() {
        return null;
    }
    /*
    * 销毁方法，在服务器正常关闭是，执行，执行一次
    * */
    @Override
    public void destroy() {
        System.out.println("destory、、、");
    }
}
