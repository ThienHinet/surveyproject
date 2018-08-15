/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Controller;

import com.group.survey.Constant.LinkConstant;
import com.group.survey.Impl.UserInForImpl;
import com.group.survey.Service.UserInForServiceImpl;
import com.group.survey.entity.UsersInFor;
import static com.group.survey.util.EnCode.EncodePassWord;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author thienha
 */
@Controller
public class UsersManagerController {

    @Autowired
    UserInForServiceImpl userInForServiceImpl;

    @RequestMapping(LinkConstant.LOGIN_PAGE)
    public String LoginUsers() {
        return LinkConstant.LINK_LOGIN;
    }

    @RequestMapping(LinkConstant.REGISTER_PAGE)
    public String RegisterLogin() {
        return LinkConstant.LINK_REGISTER;
    }      
   
    
    @RequestMapping(value = LinkConstant.SUBMIT_LOGIN,method = RequestMethod.POST)
    public String LoginU(UsersInFor usersInFor,HttpServletRequest request,HttpServletResponse response,ModelMap mn) throws NoSuchAlgorithmException{
            String usersName = request.getParameter("usersname");
            String passowrd = EncodePassWord(request.getParameter("password"));
            UserInForImpl users = new UserInForImpl();
              usersInFor.setUserName(usersName);
              usersInFor.setPassWord(passowrd);
              List<UsersInFor> check = userInForServiceImpl.checkEmail(usersName,passowrd,0);
              if(check!=null){
                  HttpSession session = request.getSession();
            session.setAttribute("usersInFor", usersInFor);
            session.setAttribute("usersName", usersName);
              return LinkConstant.LINKHOME;
              }
              else{
                  mn.put("error","Tài kho?n ho?c m?t kh?u không dúng");
              return LinkConstant.LINK_LOGIN;
              }
    } 
    
    @RequestMapping(value = LinkConstant.SUBMIT_REGISTER, method = RequestMethod.POST)
    public String Register(UsersInFor usersInFor, HttpServletRequest request, HttpServletResponse response,ModelMap mn) throws NoSuchAlgorithmException {
        String usersName = request.getParameter("usersname");
        String fullName = request.getParameter("fullname");
        String email = request.getParameter("email");
        String numberPhone = request.getParameter("numberphone");
        UserInForImpl users = new UserInForImpl();
        String passowrd = EncodePassWord(request.getParameter("password"));
        usersInFor.setUserName(usersName);
        usersInFor.setFullName(fullName);
        usersInFor.setPassWord(passowrd);
        usersInFor.setStatus(1);
        usersInFor.setEmail(email);
        usersInFor.setNumberphone(numberPhone);
        usersInFor.setUsersType(LinkConstant.USER_STUDENT);
        List<UsersInFor> check = userInForServiceImpl.checkEmail(usersName, email,0);
        if (check != null) {
            mn.put("error","UsersName OR Email dã du?c s? d?ng cho m?t tài kho?n khác");
            return LinkConstant.REGISTER_PAGE;
        } else {
            userInForServiceImpl.insert(usersInFor);
            HttpSession session = request.getSession();
            session.setAttribute("usersInFor", usersInFor);
            session.setAttribute("usersName", usersName);
            return LinkConstant.LINKHOME;
        }

    }

    @RequestMapping(value = LinkConstant.LINK_LOGOUT)
    public void Logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
            userInForServiceImpl.LogOut(request, response);
        response.sendRedirect(LinkConstant.LINK_LOGIN);
    }
    @RequestMapping(value=LinkConstant.MANAGER_PAGE)
    public String ListUsersManager(ModelMap mn){
        mn.put("listUser",userInForServiceImpl.getAllListUsers());
    return LinkConstant.LINK_MANAGER_USER;
    }


    

}
