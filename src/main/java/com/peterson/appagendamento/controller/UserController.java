package com.peterson.appagendamento.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peterson.appagendamento.domain.User;

@RestController
@RequestMapping("/app/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User peterson = new User("1", "Peterson Alves", "peterson@gmail.com");
		User karina = new User("1", "karina Alves", "karina@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(peterson,karina));
		return ResponseEntity.ok().body(list);
		
	}

}

