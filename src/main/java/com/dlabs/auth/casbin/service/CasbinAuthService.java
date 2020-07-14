package com.dlabs.auth.casbin.service;

public interface CasbinAuthService {

	public Boolean isAuthorised(String user, String object, String action);
	
}
