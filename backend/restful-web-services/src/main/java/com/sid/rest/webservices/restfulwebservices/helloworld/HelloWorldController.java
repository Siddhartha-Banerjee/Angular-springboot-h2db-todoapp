package com.sid.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello")
	public String helloworld()
	{
		return "hello world";
	}
	
	@GetMapping(path="/hello-bean")
	public HelloWorldBean helloworldBean()
	{
		//throw new RuntimeException("Some error occured contact with support team");
		return new HelloWorldBean("hello world bean");
	}
	
	@GetMapping(path="/hello/pv/{name}")
	public HelloWorldBean helloworldBean(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello , %s",name));
	}
}
