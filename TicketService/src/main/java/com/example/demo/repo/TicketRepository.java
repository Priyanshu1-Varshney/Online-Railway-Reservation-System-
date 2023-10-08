package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket,Long>{
	
	 List<Ticket> findByPnrNo(String pnrNo);
	    List<Ticket> findByTrainCodeAndDateOfJourney(String trainCode, LocalDate dateOfJourney);
	}