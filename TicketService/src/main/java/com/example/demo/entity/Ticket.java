package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Ticket")
public class Ticket {
	
	
	@Id
    private Long id;
    private String pnrNo;
    private String status;
    private String paymentType;
    private String trainCode;
    private LocalDate dateOfJourney;
    
    
    
	    public Ticket(Long id, String pnrNo, String status, String paymentType, String trainCode, LocalDate dateOfJourney) {
		super();
		this.id = id;
		this.pnrNo = pnrNo;
		this.status = status;
		this.paymentType = paymentType;
		this.trainCode = trainCode;
		this.dateOfJourney = dateOfJourney;
	}
		public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTrainCode() {
		return trainCode;
	}
	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}
	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
		
}
