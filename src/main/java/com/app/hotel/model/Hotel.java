package com.app.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Hotel {
	
	@Id
	@GeneratedValue
	private Integer hotelId;
	private String hotelName;
	private String  ownerName;
	private Integer roomNumber;
	private Integer bedNumber;
	private String customerName;
	private String joiningDate;
	private String mobileNumber;
	private String customerAddress;
	private Double fees;

}
