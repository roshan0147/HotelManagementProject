package com.app.hotel.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.hotel.model.Hotel;
import com.app.hotel.repositry.HotelRepositry;
import com.app.hotel.service.HotelService;
@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepositry repo;
	@Override
	public Integer saveHotel(Hotel hotel) {
		Hotel id=repo.save(hotel);
		return id.getHotelId();
	}
	@Override
	public List<Hotel> getAllHotelData() {
		List<Hotel> list=repo.findAll();
		return list;
	}
	@Override
	public void deleteHotelData(Integer id) {
		repo.deleteById(id);
		
	}
	@Override
	public Optional<Hotel> getOneHotelData(Integer id) {
		Optional<Hotel> opt=repo.findById(id);
		return opt;
	}
	

}
