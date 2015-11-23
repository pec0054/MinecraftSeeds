package org.pcsworld.minecraftseeds.service;

import org.pcsworld.minecraftseeds.model.User;
import org.pcsworld.minecraftseeds.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
	private UserDao userDao;

	@Autowired
	public void setUsersDao(UserDao userDao){
		this.userDao = userDao;
	}

	public void create(User user) {
		// TODO Auto-generated method stub
		userDao.create(user);
	}

}
