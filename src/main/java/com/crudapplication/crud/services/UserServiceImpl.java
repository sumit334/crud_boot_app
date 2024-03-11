package com.crudapplication.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.crud.dao.UserDao;
import com.crudapplication.crud.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(String userId) {
        Optional<User> user = userDao.findById(userId);
        return user.orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User deleteUser(String userId) {
        Optional<User> user = userDao.findById(userId);
        if (user.isPresent()) {
            userDao.delete(user.get());
            return user.get();
        }
        return null;
    }
}






























//package com.crudapplication.crud.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.crudapplication.crud.dao.UserDao;
//import com.crudapplication.crud.model.User;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//	@Autowired
//	private UserDao userDao;
//	
//	@Override
//	public User addUser(User user) {
//		userDao.save(user);
//		return user;
//	}
//	
//	@Override
//	public List<User> getUsers() {
//		return userDao.findAll();
//	}
//
//	@Override
//	public User getUser(long userId) {
//		return userDao.findById(userId).get();
//	}	
//
//	@Override
//	public User updateUser(User user) {
//		userDao.save(user);
//		return user;
//	}
//
//	@Override
//	public User deleteUser(long userId) {
//		User user=userDao.findById(userId).get();
//		userDao.delete(user);
//		return user;
//	}
//	
//}
