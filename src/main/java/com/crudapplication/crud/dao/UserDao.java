package com.crudapplication.crud.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crudapplication.crud.model.User;

public interface UserDao extends MongoRepository<User, String> {
    
}














//package com.crudapplication.crud.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.crudapplication.crud.model.User;
//
//public interface UserDao extends JpaRepository<User, Long> {
//	
//}
