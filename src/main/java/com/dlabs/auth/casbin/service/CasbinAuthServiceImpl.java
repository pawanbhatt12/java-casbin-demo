package com.dlabs.auth.casbin.service;

import org.casbin.jcasbin.main.Enforcer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CasbinAuthServiceImpl implements CasbinAuthService{

	@Autowired
    private Enforcer enforcer;

	@Override
	public Boolean isAuthorised(String user, String object, String action) {
		
		log.info("Check if authorised...");
		
		return enforcer.enforce(user, object, action);
	}
}
