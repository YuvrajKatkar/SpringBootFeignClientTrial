package com.yuvraj.HotelService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yuvraj.HotelService.model.User;


@FeignClient(name="UserService",url="http://localhost:8080/user")
public interface UserCommunicationsService {
	@GetMapping("/hotel/{id}")
	public List<User> findByHotelId(@PathVariable("id") int id);
	@GetMapping("/{id}")
	public User findById(@PathVariable("id") int id);
}
