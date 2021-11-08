package com.overlay.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.overlay.model.RequestStage;
import com.overlay.model.User;

@Mapper
public interface RequestStageMapper {
	
	RequestStage findById(Long id);
	List<User> listAll();
	RequestStage save(RequestStage user);
	RequestStage update(RequestStage user);
	void delete(Long id);

}
