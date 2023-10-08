package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Train;

public interface TrainRepository extends MongoRepository<Train,String> {

}
