package com.spring.callapi;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@RestController
public class Controller {

	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello vishal";
	}
	
	
	@GetMapping("/callclienthello")
	public String getHelloClient()
	{
		RestTemplate restTemplate=new RestTemplate();
		String uri="https://jsonplaceholder.typicode.com/todos/1";
		String result=restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	
}
