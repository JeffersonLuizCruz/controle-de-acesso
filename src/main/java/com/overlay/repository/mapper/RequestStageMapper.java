package com.overlay.repository.mapper;

import java.util.List;

import com.overlay.model.RequestStage;
import com.overlay.model.UserOwner;

public interface RequestStageMapper {
	
	RequestStage findById(Long id);
	List<UserOwner> listAll();
	RequestStage save(RequestStage user);
	RequestStage update(RequestStage user);
	void delete(Long id);

}
