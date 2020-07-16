package com.mannix.springbootproject;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LcsController {

	@GetMapping("/bestofthebest")
	public String bestofthebest() {
		
		return "bestofthebest";
	}

}