package com.overlay.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.overlay.model.User;

@Mapper
public interface UserMapper {
	
	User getById(Long id);
	List<User> listAll();
	User save(User user);
	User update(User user);
	void delete(Long id);

}
