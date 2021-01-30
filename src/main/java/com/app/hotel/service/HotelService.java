package com.app.hotel.service;

import java.util.List;
import java.util.Optional;

import com.app.hotel.model.Hotel;

public interface HotelService {
	
	public Integer saveHotel(Hotel hotel);
	public List<Hotel> getAllHotelData();
	public void deleteHotelData(Integer id);
	public Optional<Hotel> getOneHotelData(Integer id);
	

}
