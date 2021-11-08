package com.overlay.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.overlay.model.Request;
import com.overlay.model.UserOwner;
@Mapper
public interface RequestRepository {
	
	Request getById(Long id);
	List<UserOwner> listAll();
	Request save(Request user);
	Request update(Request user);
	void delete(Long id);

}
