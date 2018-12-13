package com.dreamsense.hello.pages;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:Hello World}")
	private String message;
	
	@Value("${service.url}")
	private String serviceUrl;

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		model.put("url", URI.create(this.serviceUrl));
		return "welcome";
	}

}
