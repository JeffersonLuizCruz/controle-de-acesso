package com.overlay.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overlay.model.User;

@Service
public class UserServiceImpl implements UserMapper{
	
	@Autowired
    private UserMapper userMapper;



    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUser(Long id, String userName, String  passWord) {
        userMapper.updateUser(id, userName, passWord);
    }

	@Override
	public List<User> getAll() {
		 List<User> list = userMapper.getAll();
		return list;
	}

	@Override
	public User findById(Long id) {
		
		return userMapper.findById(id);
	}

}
