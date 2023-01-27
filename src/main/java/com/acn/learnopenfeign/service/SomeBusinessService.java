package com.acn.learnopenfeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acn.learnopenfeign.dto.UserDTO;
import com.acn.learnopenfeign.service.external.UserServiceClient;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SomeBusinessService {

	@Autowired
	private UserServiceClient userClient1;
	
	public UserDTO doStuff() {
		log.info("doStuff method - START");
		UserDTO result = this.userClient1.getUserByUserId("11");
		log.info("result=%s", result);
		return result;
	}
}
