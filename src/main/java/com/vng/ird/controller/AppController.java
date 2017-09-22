package com.vng.ird.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vng.ird.configuration.AppConfiguration;

@Controller
public class AppController {
	@Autowired
	private AppConfiguration appConfig;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello " + appConfig.name;
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	String Hello() {
		return appConfig.helloMessage;
	}
	
	@RequestMapping("/roles")
	@ResponseBody
	String Roles() {
		return appConfig.roles;
	}
}
