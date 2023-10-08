package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {
	
	 @Autowired
	private  TrainService trainService;

   


	    @GetMapping
	    public List<Train> getAllTrains() {
	        return trainService.getAllTrains();
	    }

	    @GetMapping("/{trainCode}")
	    public ResponseEntity<Train> getTrainByCode(@PathVariable String trainCode) {
	        Train train = trainService.getTrainByCode(trainCode);
	        if (train != null) {
	            return ResponseEntity.ok(train);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Train> createTrain(@RequestBody Train train) {
	        Train createdTrain = trainService.createTrain(train);
	        return new ResponseEntity<>(createdTrain, HttpStatus.CREATED);
	    }
	}
