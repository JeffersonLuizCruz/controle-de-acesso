package com.overlay.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.overlay.model.UserOwner;

@Mapper
public interface UserMapper {
	
	UserOwner findById(Long id);
	List<UserOwner> listAll();
	UserOwner save(UserOwner user);
	UserOwner update(UserOwner user);
	void delete(Long id);

}
