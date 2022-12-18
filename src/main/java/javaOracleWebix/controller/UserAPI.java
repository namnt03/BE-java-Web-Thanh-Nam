package javaOracleWebix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaOracleWebix.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/user")

public class UserAPI {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getAllUser")
	// day la 1 request , moi request la 1 method
	ResponseEntity<?> getAllKhachHang(){
		return ResponseEntity.ok(service.getAllUser());
	}
}
