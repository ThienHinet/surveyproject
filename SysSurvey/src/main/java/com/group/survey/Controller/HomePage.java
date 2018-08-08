package com.group.survey.Controller;

import com.group.survey.Constant.LinkConstant;
import com.group.survey.Impl.UserInForImpl;

import com.group.survey.Service.UserInForServiceImpl;
import com.group.survey.entity.UsersInFor;

import static com.group.survey.util.EnCode.EncodePassWord;
import java.security.NoSuchAlgorithmException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePage {
         
        
	@RequestMapping(LinkConstant.HOMEPAGE)
	public String index(){
            return LinkConstant.LINKHOME;
	}
       
	
}
