package com.raj.cm.controller;

import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.*
import com.raj.cm.pojo.login;
import com.raj.cm.services.LoginService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/cm")
@CrossOrigin(origins="*")
public class LoginController {

	@Autowired
	LoginService ls;
	
	@PostMapping("/login")
	public login logincontr(@RequestBody login user) {
		login log = new login();
		System.out.println(user.getUsername());
		System.out.println(user.getPasswrd());
		List<login> userList = ls.loginServ(user);
		for(login usr: userList) {
			System.out.println("for loop"+ usr);
			if(usr.getUsername().equals(user.getUsername()) && usr.getPasswrd().equals(user.getPasswrd())) {
				System.out.println("True");
				log = new login();
				log = user;
			} else {
				System.out.println("false");
				System.out.println(usr.getUsername() + ": " +usr.getPasswrd());
			}
		}
	
		return log;
	}
	
	@GetMapping("/test")
	public String test() {
		return "Automated deployment is working";
	}
}
