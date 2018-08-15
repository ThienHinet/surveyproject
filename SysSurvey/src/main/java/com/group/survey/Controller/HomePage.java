package com.group.survey.Controller;

import com.group.survey.Constant.LinkConstant;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePage {

	@RequestMapping(LinkConstant.HOMEPAGE)
	public String index(){
            return LinkConstant.LINKHOME;
	}
       
	
}
