package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.enitity.Passenger;
import com.example.demo.repo.PassengerRepository;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/passengers")
//@Api(tags = "Passenger API")
public class PassengerController {

    @Autowired
    private PassengerRepository passengerRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    
    //EndPoint to get all passengers 
    
    @GetMapping
    public List<Passenger> getAll(){
    	return passengerRepository.findAll();
    	}

    // Endpoint for creating a new passenger
    
    @PostMapping
//    @ApiOperation(value = "Add Passenger")
    public ResponseEntity<Passenger> createPassenger(@RequestBody Passenger passenger) {
        Passenger savedPassenger = passengerRepository.save(passenger);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPassenger);
    }

    // Endpoint for retrieving a passenger by ID
    
    @GetMapping("/{paxId}")
//    @ApiOperation(value = "Search Passenger by ID")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long paxId) {
        Optional<Passenger> passenger = passengerRepository.findByPaxId(paxId);
        return passenger.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint for searching passengers by name
    
    @GetMapping("/search")
//    @ApiOperation(value = "Search Passenger by Name ")
    public List<Passenger> searchPassengersByName(@RequestParam String name) {
        return passengerRepository.findByName(name);
    }

    // Endpoint for modifying passenger details
    
    @PutMapping("/{paxId}")
//    @ApiOperation(value = "Update Details Passenger")
    public ResponseEntity<Passenger> updatePassengerDetails(@PathVariable Long paxId, @RequestBody Passenger updatedPassenger) {
        // Retrieve the existing passenger
        Optional<Passenger> existingPassenger = passengerRepository.findByPaxId(paxId);
        if (existingPassenger.isPresent()) {
            Passenger passenger = existingPassenger.get();
            // Update passenger details
            passenger.setName(updatedPassenger.getName());
            passenger.setAge(updatedPassenger.getAge());
            passenger.setSex(updatedPassenger.getSex());
            // Save the updated passenger
            Passenger savedPassenger = passengerRepository.save(passenger);
            return ResponseEntity.ok(savedPassenger);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
   
    

    
}





