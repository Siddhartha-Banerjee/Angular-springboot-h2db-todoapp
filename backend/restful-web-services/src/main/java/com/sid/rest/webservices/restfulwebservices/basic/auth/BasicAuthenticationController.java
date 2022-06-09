package com.sid.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean basicAuthBean()
	{
		//throw new RuntimeException("Some error occured contact with support team");
		return new AuthenticationBean("You are authenticated");
	}
	@GetMapping(path="/jpa/basicauth")
	public AuthenticationBean authBean()
	{
		//throw new RuntimeException("Some error occured contact with support team");
		return new AuthenticationBean("You are authenticated");
	}
	
}
