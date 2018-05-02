package com.revature.kyubbs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.kyubbs.beans.User;
import com.revature.kyubbs.service.UserService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static UserService userService = new UserService();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getInputStream() != null) {
    		
			ObjectMapper map = new ObjectMapper();
    		User user = map.readValue(request.getInputStream(), User.class);
    		
    		user = userService.loginUser(user);
    		
    		if(user != null) {
    			user.setPassword(""); 
    			HttpSession session = request.getSession();
    			session.setAttribute("user", user);
    		}
    		
    		PrintWriter out = response.getWriter();
    		out.write(map.writeValueAsString(user));
    	}
	}
}
