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
import java.security.NoSuchAlgorithmException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author thienha
 */
@Controller
public class UsersManager {
     @RequestMapping(LinkConstant.LOGIN_PAGE)
        public String LoginUsers(){
            return  LinkConstant.LINK_LOGIN;
        }
        @RequestMapping(LinkConstant.REGISTER_PAGE)
        public String RegisterLogin(){
            return LinkConstant.LINK_REGISTER;
        }
        @Autowired
         UserInForServiceImpl userInForServiceImpl;
        @RequestMapping(value =LinkConstant.SUBMIT_REGISTER ,method = RequestMethod.POST)
        public String Register(UsersInFor usersInFor,HttpServletRequest request,HttpServletResponse response) throws NoSuchAlgorithmException{
             String usersName=request.getParameter("usersname");
             String fullName=request.getParameter("fullname");
             String email=request.getParameter("email");
             String numberPhone=request.getParameter("numberphone");
             UserInForImpl users=new UserInForImpl();
             String passowrd=EncodePassWord(request.getParameter("password"));
             usersInFor.setUserName(usersName);
             usersInFor.setFullName(fullName);
             usersInFor.setPassWord(passowrd);
             usersInFor.setStatus(1);
             usersInFor.setEmail(email);
             usersInFor.setNumberphone(numberPhone);
             usersInFor.setUsersType(LinkConstant.USER_STUDENT);
             userInForServiceImpl.insert(usersInFor);
              HttpSession session = request.getSession();
              session.setAttribute("usersInFor",usersInFor);
              session.setAttribute("usersName",usersName);
             return LinkConstant.LINKHOME;
        }
            
}
