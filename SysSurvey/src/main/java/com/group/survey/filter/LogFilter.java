/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.filter;

import com.group.survey.Constant.LinkConstant;
import com.group.survey.entity.UsersInFor;
import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author thienha
 */
public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
        System.out.println("LogFilter init!");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        String users = (String) session.getAttribute("usersName");
        String servletPath = request.getServletPath();
        if ((servletPath.equals(LinkConstant.LOGIN_PAGE)) || (servletPath.equals(LinkConstant.REGISTER_PAGE)) || (servletPath.equals(LinkConstant.SUBMIT_REGISTER))|| (servletPath.equals(LinkConstant.SUBMIT_LOGIN))) {
            chain.doFilter(request, response);
        } else if (users == null) {
            response.sendRedirect(request.getContextPath() + LinkConstant.LOGIN_PAGE);
        } else {
            chain.doFilter(request, response);
        }

        // Cho phép request được đi tiếp. (Vượt qua Filter này).
    }

    @Override
    public void destroy() {
        System.out.println("LogFilter destroy!");
    }

}
