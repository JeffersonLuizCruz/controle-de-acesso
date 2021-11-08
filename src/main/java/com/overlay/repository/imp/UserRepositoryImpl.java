package com.overlay.repository.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.overlay.model.UserOwner;
import com.overlay.repository.UserRepository;
import com.overlay.repository.mapper.UserMapper;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired UserMapper userMapper;

	@Override
	public UserOwner findById(Long id) {
		UserOwner user = userMapper.findById(id);
		return user;
	}

	@Override
	public List<UserOwner> listAll() {
		List<UserOwner> users = userMapper.listAll();
		return users;
	}

	@Override
	public UserOwner save(UserOwner user) {
		UserOwner save = userMapper.save(user);
		return save;
	}

	@Override
	public UserOwner update(UserOwner user) {
		UserOwner update = userMapper.update(user);
		return update;
	}

	@Override
	public void delete(Long id) {
		userMapper.delete(id);
		
	}

}
