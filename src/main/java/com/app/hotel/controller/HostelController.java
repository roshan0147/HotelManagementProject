package com.app.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.hotel.model.Hotel;
import com.app.hotel.service.HotelService;

@Controller
@RequestMapping("/register")
public class HostelController {
	@Autowired
	private HotelService service;
	@RequestMapping("/show")
	public String showPage(Model model) {
		
		model.addAttribute("hotel",new Hotel());
		return "HotelRegistrationForm";
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveHotelData(@ModelAttribute Hotel hotel,Model model) {
		
		Integer id=service.saveHotel(hotel);
		String message="Hotel "+id+" Saved";
		model.addAttribute("message",message);
		model.addAttribute("hotel",new Hotel());
		return "HotelRegistrationForm";
	}
	@RequestMapping("/all")
	public String getAllData(Model model) {
		
		List<Hotel> list=service.getAllHotelData();
		model.addAttribute("list",list);
		return "ViewAllHotelData";
	}
	@RequestMapping("/delete/{id}")
	public String deleteHotelData(@PathVariable("id")Integer id) {
		service.deleteHotelData(id);
		return "redirect:../all";
	}
	@RequestMapping("/edit/{id}")
	public String editHotelData(@PathVariable("id")Integer id,Model model) {
		Optional<Hotel> opt=service.getOneHotelData(id);
		model.addAttribute("hotel",opt.get());
		return "EditHotelData";
	}
}
