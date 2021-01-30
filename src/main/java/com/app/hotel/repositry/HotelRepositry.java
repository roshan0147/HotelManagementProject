package com.app.hotel.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hotel.model.Hotel;

public interface HotelRepositry extends JpaRepository<Hotel,Integer>{

}
