package com.acn.learnopenfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.learnopenfeign.dto.UserDTO;
import com.acn.learnopenfeign.service.SomeBusinessService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@Autowired
	private SomeBusinessService someBusinessService;
	
	@GetMapping(path = "/do-action")
	public ResponseEntity<UserDTO> doAction(){
		log.info("doAction method - START");
		
		UserDTO userDTO =  someBusinessService.doStuff();
		userDTO.setFirstname(userDTO.getFirstname().toUpperCase());
		userDTO.setLastname(userDTO.getLastname().toUpperCase());
		return ResponseEntity.ok(userDTO);
	}
}