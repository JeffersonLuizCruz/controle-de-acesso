package com.overlay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlay.model.UserOwner;
import com.overlay.repository.UserRepository;

@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired UserRepository userRepository;
	
	@GetMapping
	List<UserOwner> listAll() {
		List<UserOwner> findById = userRepository.listAll();
		return findById;
	}

}
