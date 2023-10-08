package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Train;
import com.example.demo.repo.TrainRepository;

@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;

    
    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train getTrainByCode(String trainCode) {
        return trainRepository.findById(trainCode).orElse(null);
    }

    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }

}

