package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@RequestMapping( value="", method=RequestMethod.GET )
	public ModelAndView root( Model model ){
		
		model.addAttribute("name", "kim");
		System.out.println( "input test11" );
		
		return new ModelAndView("hello");
	}
	
	@RequestMapping( value="testing", method=RequestMethod.GET )
	public ModelAndView testing( Model model ){
		
		model.addAttribute("name", "lee");
		System.out.println( "input test22" );
		
		return new ModelAndView("hello");
	}
	
}
