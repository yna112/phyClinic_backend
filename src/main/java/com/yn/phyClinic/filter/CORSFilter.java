package com.yn.phyClinic.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class CORSFilter implements Filter {

    public CORSFilter() {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String origin = request.getHeader("Origin");
        if ("https://phy-clinic-frontend.vercel.app".equals(origin) ||
                "https://phyclinic-backend.onrender.com".equals(origin)) {
            response.addHeader("Access-Control-Allow-Origin", origin);
        } else {
            response.addHeader("Access-Control-Allow-Origin", "");
        }

        response.addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "authorization, Origin, Accept, x-auth-token, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        response.addHeader("Access-Control-Allow-Credentials", "true");

        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK); // שנה ל-200 OK
            return;
        }

        chain.doFilter(request, servletResponse);
    }

    public void init(FilterConfig fConfig) throws ServletException {
    }
}