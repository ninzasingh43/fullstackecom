package com.ecom.jwt1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.jwt1.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role , String> {

}
