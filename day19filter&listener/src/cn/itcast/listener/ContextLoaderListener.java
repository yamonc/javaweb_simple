package cn.itcast.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/29
 */
@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     * 监听ServletContext对象创建的ServletContext对象服务器启动后自动创建的
     * 在服务器启动后自动调用
     *
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //加载资源文件
        //获取ServletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();

        //加载资源文件
        String initParameter = servletContext.getInitParameter("contextConfigLocation");

        //获取真实路径
        String realPath = servletContext.getRealPath(initParameter);
        //加载进内存
        try {
            FileInputStream fileInputStream = new FileInputStream(realPath);
            System.out.println(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("SercletContext被创建了");
    }

    /**
     * 在服务器关闭后，ServletContext对象被销毁当服务器正常关闭后该方法被执行
     *
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("SercletContext被销毁了");

    }
}
