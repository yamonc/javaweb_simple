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
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo2---");
        //放行

        chain.doFilter(req, resp);


        System.out.println("filterDemo2back");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
