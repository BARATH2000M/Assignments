package com.myfirstmvc.jee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SimpleIntrest {
	
@RequestMapping("/coo")	
protected String doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		 
		return "simpleIntrest";
		
	}

@RequestMapping("/login")
protected String doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
	request.setAttribute("principal",request.getParameter("principal"));
	request.setAttribute("intrest",request.getParameter("intrest"));
	request.setAttribute("noOfYears",request.getParameter("noOfYears"));
	return "result";
	}
	
	

}
