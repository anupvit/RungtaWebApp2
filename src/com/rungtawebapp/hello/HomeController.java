package com.rungtawebapp.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Neha Rungta
 * 
 */
@Controller
public class HomeController {
		@RequestMapping("/home")
		public ModelAndView homePage() {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>********** Rungta Android App Home Page, Spring MVC</h3>This message is coming from RungtaWebApp home controller **********</div><br><br>";
			return new ModelAndView("home", "message", message);
		}
		
		@RequestMapping("/page1")
		public ModelAndView page1() {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>********** Rungta Android App Page1</h3>This message is coming from RungtaWebApp page1 controller **********</div><br><br>";
			return new ModelAndView("page1", "message", message);
		}
		
		
}
