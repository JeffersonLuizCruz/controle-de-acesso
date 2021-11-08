package com.overlay.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.overlay.model.Request;
import com.overlay.model.User;

@Mapper
public interface RequestMapper {
	
	Request getById(Long id);
	List<User> listAll();
	Request save(Request user);
	Request update(Request user);
	void delete(Long id);


}
