package com.overlay.repository.mapper;

import java.util.List;

import com.overlay.model.Request;
import com.overlay.model.UserOwner;

public interface RequestMapper {
	
	Request findById(Long id);
	List<UserOwner> listAll();
	Request save(Request user);
	Request update(Request user);
	void delete(Long id);
}
