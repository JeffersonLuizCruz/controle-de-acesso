package com.overlay.repository;

import java.util.List;

import com.overlay.model.RequestStage;
import com.overlay.model.User;

public interface RequestStageRepository {
	
	RequestStage getById(Long id);
	List<User> listAll();
	RequestStage save(RequestStage user);
	RequestStage update(RequestStage user);
	void delete(Long id);

}
