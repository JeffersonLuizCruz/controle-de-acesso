package com.overlay.repository;

import java.util.List;

import com.overlay.model.User;

public interface UserRepository {
	
	User getById(Long id);
	List<User> listAll();
	User save(User user);
	User update(User user);
	void delete(Long id);

}
