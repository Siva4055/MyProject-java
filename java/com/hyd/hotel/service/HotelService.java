package com.hyd.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyd.hotel.entity.Hotel;
import com.hyd.hotel.repo.Starters;

@Service
public class HotelService {
	@Autowired
	Starters hRepo;

	public void addNewHotel(Hotel hotel) {
		
		hRepo.save(hotel);
	}

	
	
	
}

	 