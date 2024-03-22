package com.yuvraj.HotelService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yuvraj.HotelService.model.User;


@FeignClient(name="USERSERVICE")//url="http://localhost:8080/user"
public interface UserCommunicationsService {
	@GetMapping("/user/hotel/{id}")
	public List<User> findByHotelId(@PathVariable("id") int id);
	@GetMapping("/user/{id}")
	public User findById(@PathVariable("id") int id);
}
