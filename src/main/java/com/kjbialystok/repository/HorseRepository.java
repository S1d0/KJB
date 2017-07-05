package com.kjbialystok.repository;

import org.springframework.data.repository.CrudRepository;

import com.kjbialystok.entity.Horse;

public interface HorseRepository extends CrudRepository<Horse, Long>{

	Horse findByName(String name);
	
}
