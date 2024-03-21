package com.yuvraj.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuvraj.UserService.model.User;
import com.yuvraj.UserService.repo.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepo repo;
	@PostMapping
	public User addUser(@RequestBody User user) {
		return repo.addUser(user);
	}
	@GetMapping("/{id}")
	public User findById(@PathVariable int id) {
		return repo.getById(id);
	}
	@GetMapping("/all")
	public List<User> findAll(){
		return repo.findAll();
	}
	@GetMapping("/hotel/{id}")
	public List<User> findByHotelId(@PathVariable int id){
		return repo.getByHotelId(id);
	}
}
