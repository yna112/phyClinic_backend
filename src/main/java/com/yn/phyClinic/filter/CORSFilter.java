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

        // שנה את הכתובת למקור של הלקוח ב-Vercel
        ((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Origin", "https://phy-clinic-frontend.vercel.app");
        ((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST, DELETE");
        ((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Headers", "authorization, Origin, Accept, x-auth-token, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        // הוסף תמיכה ב-credentials אם אתה צריך (למשל, עבור cookies או אימות)
        ((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Credentials", "true");

        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        // טפל בבקשת OPTIONS (חלק מתהליך ה-CORS preflight)
        if (request.getMethod().equals("OPTIONS")) {
            resp.setStatus(HttpServletResponse.SC_ACCEPTED);
            return;
        }

        // המשך בשרשרת הפילטרים
        chain.doFilter(request, servletResponse);
    }

    public void init(FilterConfig fConfig) throws ServletException {
    }
}