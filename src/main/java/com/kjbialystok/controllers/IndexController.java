package com.kjbialystok.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kjbialystok.entity.Horse;
import com.kjbialystok.entity.Rider;
import com.kjbialystok.repository.HorseRepository;

@Controller
@RequestMapping("/")
public class IndexController {

	private HorseRepository horseRepository;
	
	@Autowired
	public IndexController(HorseRepository horseRepository) {
		this.horseRepository = horseRepository;
	}


	@RequestMapping(method=RequestMethod.GET)
	public String home(Map<String,Object> model){
		List<Horse> horses = (List<Horse>) horseRepository.findAll(); 
		model.put("horses", horses);
		return "index";
	}
	
}
