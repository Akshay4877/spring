package com.spring.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class HomeController
{ 		
		@RequestMapping("/home")
		public String showHomePage()
		{
			System.out.println("Welcome");
		     return "home";	
		}
}
