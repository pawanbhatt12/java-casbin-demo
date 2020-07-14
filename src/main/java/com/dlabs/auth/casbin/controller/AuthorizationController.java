package com.dlabs.auth.casbin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dlabs.auth.casbin.service.CasbinAuthService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AuthorizationController {

	@Autowired
	CasbinAuthService casbinAuthService;
	
	@PostMapping(path = "/auth")
	public Boolean authorise(@RequestParam String user, @RequestParam String object, @RequestParam String action) {
		
		log.trace("Authorise request");
		Boolean authorised = casbinAuthService.isAuthorised(user, object, action);
		return authorised;
	}
}
