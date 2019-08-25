package com.raj.cm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.cm.pojo.login;
import com.raj.cm.repo.LoginRepo;

@Service
public class LoginService {

	@Autowired
	private LoginRepo loginRepo;
	
	public List<login> loginServ(login user) {
		List<login> userList = loginRepo.findByUsername(user.getUsername());
		return userList;
	}
}
