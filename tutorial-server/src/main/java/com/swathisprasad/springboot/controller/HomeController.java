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
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String home() {
		return "/Example_sample/index.html";
	}

}
