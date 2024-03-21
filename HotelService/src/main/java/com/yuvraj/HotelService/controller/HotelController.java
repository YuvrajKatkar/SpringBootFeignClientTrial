package com.yuvraj.HotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuvraj.HotelService.model.Hotel;
import com.yuvraj.HotelService.model.User;
import com.yuvraj.HotelService.repo.HotelRepository;
import com.yuvraj.HotelService.service.UserCommunicationsService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelRepository repo;
	@Autowired
	private UserCommunicationsService userService;
	@PostMapping
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return repo.addHotel(hotel);
	}
	@GetMapping("/{id}")
	public Hotel findById(@PathVariable int id) {
		return repo.findById(id);
	}
	@GetMapping("/all")
	public List<Hotel> findAll(){
		List<Hotel> hotels = repo.findAll().stream().map(hotel->{
			List<User> users = userService.findByHotelId(hotel.getId());
			hotel.setUsers(users);
			return hotel;
		}).toList();
		return hotels;
	}
	@GetMapping("/user/{id}")
	public List<Hotel> findByUserId(@PathVariable int id){
		User user= userService.findById(id);
		List<Hotel> hotels = repo.findAll().stream().filter(f->f.getId()==user.getHotelid())
				.map(hotel->{
						hotel.getUsers().add(user);
						return hotel;
						}
					).toList();
		
		return hotels;
	}
	
}
