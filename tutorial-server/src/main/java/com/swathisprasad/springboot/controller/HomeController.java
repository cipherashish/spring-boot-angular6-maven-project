/**
 * 
 */
package com.swathisprasad.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Swathi
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "forward:/Example_sample/tutorial-web/src/main/web/src/index.html";
	}

}
