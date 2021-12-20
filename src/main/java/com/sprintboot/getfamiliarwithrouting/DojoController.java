package com.sprintboot.getfamiliarwithrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping(value = "/dojo",method = RequestMethod.GET)
	public String dojoAwesome() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping(value = "/{dojo}",method= RequestMethod.GET)
	public String secondDojoPage(@PathVariable("dojo") String dojo_name) {
		return (dojo_name.equals("burbank")) ? "Burbank Dojo is located in Southern California": (dojo_name.equals("san-jose")) ? 
				"SJ Dojo is the HeadQuarters" : "Location not found";
	}
	
	
}
