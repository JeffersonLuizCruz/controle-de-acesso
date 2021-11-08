package com.overlay.repository.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.overlay.model.RequestStage;
import com.overlay.model.UserOwner;
import com.overlay.repository.RequestStageRepository;
import com.overlay.repository.mapper.RequestStageMapper;

@Repository
public class RequestStageRepositoryImpl implements RequestStageRepository{
	
	@Autowired RequestStageMapper requestStageMapper;

	@Override
	public RequestStage findById(Long id) {
		RequestStage requestStage = requestStageMapper.findById(id);
		return requestStage;
	}

	@Override
	public List<UserOwner> listAll() {
		List<UserOwner> users = requestStageMapper.listAll();
		return users;
	}

	@Override
	public RequestStage save(RequestStage user) {
		RequestStage save = requestStageMapper.save(user);
		return save;
	}

	@Override
	public RequestStage update(RequestStage user) {
		RequestStage update = requestStageMapper.update(user);
		return update;
	}

	@Override
	public void delete(Long id) {
		requestStageMapper.delete(id);
		
	}

}
