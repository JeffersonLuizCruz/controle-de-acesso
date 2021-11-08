package com.overlay.repository;

import java.util.List;

import com.overlay.model.Request;
import com.overlay.model.User;

public interface RequestRepository {
	
	Request getById(Long id);
	List<User> listAll();
	Request save(Request user);
	Request update(Request user);
	void delete(Long id);

}
