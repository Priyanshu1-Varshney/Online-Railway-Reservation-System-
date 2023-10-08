package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.enitity.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger,Long> {

	
	 Optional<Passenger> findByPaxId(Long paxId);
	 
	    List<Passenger> findByName(String name);
}
