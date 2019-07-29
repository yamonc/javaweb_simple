package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/29
 */
//@WebFilter("/*")
public class FilterDemo3 implements Filter {
    public void destroy() {
        System.out.println("destory");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("dofulter");
        chain.doFilter(req, resp);
    }

    //  一般用于加载资源
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init");
    }

}
