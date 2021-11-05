package com.overlay.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.overlay.mapper.UserServiceImpl;
import com.overlay.model.User;

class UserMapperImplTest {
	
	@Autowired
	UserServiceImpl serviceImpl;
	
	@Test
	void test() {
		
		
		User user = new User();
		user.setId(1l);
		user.setId(500l);
		user.setName("Passaro do capeta");
		user.setEmail("email@email.com");
		user.setPassword("1234567sdf");
		
		serviceImpl.saveUser(user);
		
		User userResult = serviceImpl.findById(1l);
		
		assertEquals( user.getId(), userResult.getId());
		

	}

}
