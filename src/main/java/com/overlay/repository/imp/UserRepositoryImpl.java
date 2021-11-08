package com.overlay.repository.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.overlay.model.User;
import com.overlay.repository.UserRepository;
import com.overlay.repository.mapper.UserMapper;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired UserMapper userMapper;

	@Override
	public User getById(Long id) {
		User user = userMapper.findById(id);
		return user;
	}

	@Override
	public List<User> listAll() {
		List<User> users = userMapper.listAll();
		return users;
	}

	@Override
	public User save(User user) {
		User save = userMapper.save(user);
		return save;
	}

	@Override
	public User update(User user) {
		User update = userMapper.update(user);
		return update;
	}

	@Override
	public void delete(Long id) {
		userMapper.delete(id);
		
	}

}
