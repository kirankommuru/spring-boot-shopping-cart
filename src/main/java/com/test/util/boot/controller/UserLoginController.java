package com.test.util.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.user.domain.User;
import com.test.user.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class UserLoginController {
	
	 @Autowired
	    private UserRepository userRepository;
	 	

	    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
	    public User authenticateUser(@RequestBody UserForm userForm){
	         User user=userRepository.findByUserName(userForm.getUserName());
	         if(user.getUserName().equals(userForm.getUserName()) && user.getPassword().equals(userForm.getPassword())){
	        	 return user;
	         }
	         return null;
	    }
}
