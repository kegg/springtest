package com.dreamsense.hello.pages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dreamsense.hello.pages.model.Book;

import java.net.URI;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

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
		
		String[] list = {"One","Two","Three"};
		model.put("list", list);
		
		List<Book> bookList = new ArrayList();
		bookList.add(Book.of("The Bible", "God"));
		bookList.add(Book.of("BofM", "Nephi"));
		
		model.put("books", bookList);
		
		return "welcome";
	}

}
