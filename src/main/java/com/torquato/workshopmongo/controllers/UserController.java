package com.torquato.workshopmongo.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torquato.workshopmongo.models.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User ruan = new User("1", "Ruan", "ruan.tor4@hotmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(ruan));
		return ResponseEntity.ok().body(list);
	}

}
