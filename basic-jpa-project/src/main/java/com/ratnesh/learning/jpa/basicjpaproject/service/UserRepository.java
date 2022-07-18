package com.ratnesh.learning.jpa.basicjpaproject.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnesh.learning.jpa.basicjpaproject.entity.MyUser;

public interface UserRepository extends JpaRepository<MyUser, Long>{

}
