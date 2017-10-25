/**
 * 
 */
package com.samya.SpringBootFirst.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author SG05477
 *
 */

@Controller
public class LoginController {
	
	
	@RequestMapping("/login")
	//@ResponseBody If we put this annotation here it will return text directly to the browser 
	public String loginMessage() {
		
		//System.out.println("name is " +name);
		
		return "login";
		
	}

}
