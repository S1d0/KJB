package com.kjbialystok.fake;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kjbialystok.entity.Horse;
import com.kjbialystok.repository.HorseRepository;

@Component
public class FakeData {

	private final HorseRepository horseRepository;
	
	@Autowired
	public FakeData(HorseRepository horseRepository){
		this.horseRepository = horseRepository;
	}
	
	@PostConstruct
	public void runAtStart(){
		
		horseRepository.save(new Horse("Boston","Spokojny koń dobry dla początkujących"));
		horseRepository.save(new Horse("Heros","Silny, młody koń z temperamentem, wymagający od jeźdzca opanowania i pewności siebie"));

	}
}
