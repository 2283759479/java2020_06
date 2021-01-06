package com.qakj.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ctr {
	
	@RequestMapping("/aa")
	@ResponseBody
	public String cc(){
		return "哈哈";
	}
}
