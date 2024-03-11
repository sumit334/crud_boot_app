package com.crudapplication.crud.services;

import java.util.List;

import com.crudapplication.crud.model.User;

public interface UserService {

    public User addUser(User user);
    
    public List<User> getUsers();
    
    public User getUser(String userId); // Change the parameter type to String
    
    public User updateUser(User user);
    
    public User deleteUser(String userId); // Change the parameter type to String
}


















//package com.crudapplication.crud.services;
//
//import java.util.List;
//
//import com.crudapplication.crud.model.User;
//
//public interface UserService {
//
//	
//	public User addUser(User user);
//	
//	public List<User> getUsers();
//	
//	public User getUser(long userId);
//	
//	public User updateUser(User user);
//	
//	public User deleteUser(long userId);
//}
