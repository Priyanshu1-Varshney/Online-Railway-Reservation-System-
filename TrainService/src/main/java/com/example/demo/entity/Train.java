package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Train")
public class Train {
	    @Id
	    private String trainCode;
	    private String trainName;
	    private String frequency;
	    
	    
		public Train() {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getTrainCode() {
			return trainCode;
		}


		public void setTrainCode(String trainCode) {
			this.trainCode = trainCode;
		}


		public String getTrainName() {
			return trainName;
		}


		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}


		public String getFrequency() {
			return frequency;
		}


		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}


		public Train(String trainCode, String trainName, String frequency) {
			super();
			this.trainCode = trainCode;
			this.trainName = trainName;
			this.frequency = frequency;
		}

	    
	}

