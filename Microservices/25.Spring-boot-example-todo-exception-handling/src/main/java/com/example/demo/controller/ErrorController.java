package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {
	
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleException(HttpServletRequest httpServletRequest, Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", ex.getLocalizedMessage());
		mv.addObject("url", httpServletRequest.getRequestURL());
		mv.setViewName("error");
		return mv;
	}
	
}
