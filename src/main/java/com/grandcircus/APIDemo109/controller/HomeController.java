package com.grandcircus.APIDemo109.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.grandcircus.APIDemo109.entity.Quote;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		RestTemplate rt = new RestTemplate();
		
		/*
		 * It's a good idea to test the end point by assigning the response to a String first
		 * to make sure it's working
		 */
//		String test = rt.getForObject("https://gturnquist-quoters.cfapps.io/api/random", String.class);
//		System.out.println(test);
		
		Quote response = rt.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		return new ModelAndView("index", "quoteTest", response);
	}

}




