package com.yuvraj.HotelService.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yuvraj.HotelService.model.Hotel;

@Repository
public class HotelRepository {
	private List<Hotel> hotels = Arrays.asList(
			new Hotel(1,"Hotel 1",new ArrayList<>()),
			new Hotel(2,"Hotel 2",new ArrayList<>()),
			new Hotel(3,"Hotel 3",new ArrayList<>()));
	
	public Hotel addHotel(Hotel hotel) {
		hotels.add(hotel);
		return hotel;
	}
	public Hotel findById(int id) {
		return hotels.stream().filter(f->f.getId()==id).findFirst().get();
	}
	public List<Hotel> findAll(){
		return hotels;
	}
}
