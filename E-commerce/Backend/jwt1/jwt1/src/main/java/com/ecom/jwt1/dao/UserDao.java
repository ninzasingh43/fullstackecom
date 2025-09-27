package com.ecom.jwt1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.jwt1.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
