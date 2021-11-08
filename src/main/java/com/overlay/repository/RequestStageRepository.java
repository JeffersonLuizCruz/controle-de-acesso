package com.overlay.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.overlay.model.RequestStage;
import com.overlay.model.UserOwner;
@Mapper
public interface RequestStageRepository {
	
	RequestStage findById(Long id);
	List<UserOwner> listAll();
	RequestStage save(RequestStage user);
	RequestStage update(RequestStage user);
	void delete(Long id);

}
