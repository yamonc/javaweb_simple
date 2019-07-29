package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/29
 *//*浏览器直接请求资源时该过滤器会被执行*/
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//浏览器直接请求index或者转发访问index的时候都会执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo5---");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
