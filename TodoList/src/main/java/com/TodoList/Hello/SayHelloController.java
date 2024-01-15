package com.TodoList.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   //This is a spring bean
public class SayHelloController {

	
	@RequestMapping("say-hello")
	@ResponseBody        // it will return the message as it is to the browser
	public String sayHello() {
		return "Hello! what are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody        // it will return the message as it is to the browser
	public String sayHelloHtml() {
		StringBuffer sb= new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first Html page</title>");
		sb.append("</head>");
		sb.append("My first html page with body-changed");
		sb.append("</body");
		sb.append("</html>");
		return sb.toString();
	}
	

	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// it will return the message as it is to the browser
	//we want to redirect to a view so remove @ResponseBody  
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
