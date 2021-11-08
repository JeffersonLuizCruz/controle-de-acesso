package com.overlay.repository.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.overlay.model.Request;
import com.overlay.model.User;
import com.overlay.repository.RequestRepository;
import com.overlay.repository.mapper.RequestMapper;

@Repository
public class RequestRepositoryImpl implements RequestRepository{
	
	@Autowired RequestMapper requestMapper;

	@Override
	public Request getById(Long id) {
		Request request = requestMapper.findById(id);
		return request;
	}

	@Override
	public List<User> listAll() {
		List<User> users = requestMapper.listAll();
		return users;
	}

	@Override
	public Request save(Request user) {
		Request save = requestMapper.save(user);
		return save;
	}

	@Override
	public Request update(Request user) {
		Request update = requestMapper.update(user);
		return update;
	}

	@Override
	public void delete(Long id) {
		requestMapper.delete(id);
		
	}

}
