package com.yuvraj.UserService.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yuvraj.UserService.model.User;

@Repository
public class UserRepo {
	private List<User> users = Arrays.asList(
			new User(1, "John", 25, 1),
            new User(2, "Alice", 30, 2),
            new User(3, "Bob", 28, 2),
            new User(4, "Emily", 35, 1),
            new User(5, "David", 40, 3)); 
	
	public User addUser(User user) {
		users.add(user);
		return user;
	}
	public List<User> findAll(){
		return users;
	}
	public User getById(int id) {
		return users.stream().filter(f->f.getId()== id).findFirst().get();
	}
	public List<User> getByHotelId(int id){
		return users.stream().filter(f->f.getHotelid()==id).toList();
	}
}
