package org.naveed;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller

public class SmartController {
	
	
	
@RequestMapping(value="/home", method=RequestMethod.GET)

	
	public String sayHello(ModelMap model){
		model.addAttribute("message", "Welcome to my Spring MVC");
		
		return "welcome";
	}
	
/** RequestMapping() is the Handler Mapping. All the requests with domain "/" will go the 
 * handler above and all domain requests with "/helloagain" will go to the handler BELOW
 *       2 HANDLER MAPPINGS 1= "/" AND 2="/helloagain"                     **/
		
	
	
	
		@RequestMapping(value="/home/{user}", method=RequestMethod.GET)

		
		public String sayHelloagain(@PathVariable("user") String user , ModelMap model){
			model.addAttribute("message", "Welcome again to my Spring MVC");
			model.addAttribute("userdata", user);
			
			return "welcome";

		}    
		
}
