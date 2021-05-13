package com.peterson.appagendamento.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peterson.appagendamento.domain.Cliente;
import com.peterson.appagendamento.domain.User;

@RestController
@RequestMapping("/app/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User peterson= new User(1L, "Peterson Alves", "peterson@gmail.com", 90876489L, "Rua do peterson, 001", 678908454L,"são Paulo");
		User karina  = new User(2L, "Karina Alves",   "karina@gmail.com",   90876489L, "Rua da karina, 002",   673730854L,"são Paulo");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(peterson,karina));
		return ResponseEntity.ok().body(list);
		
	}

}


