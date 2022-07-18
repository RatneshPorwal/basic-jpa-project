package com.ratnesh.learning.jpa.basicjpaproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ratnesh.learning.jpa.basicjpaproject.entity.MyUser;
import com.ratnesh.learning.jpa.basicjpaproject.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... arg0) throws Exception {
		MyUser user = new MyUser("Jack", "Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created : " + user);
	}
}
