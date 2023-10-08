package com.example.demo.enitity;

import java.time.LocalDate;

public class Ticket {
	
	 private Long id;
	 private Long paxId;
	    private String pnrNo;
	    private String status;
	    private String paymentType;
	    private String trainCode;
	    private LocalDate dateOfJourney;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getPaxId() {
			return paxId;
		}
		public void setPaxId(Long paxId) {
			this.paxId = paxId;
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
		public Ticket(Long id, Long paxId, String pnrNo, String status, String paymentType, String trainCode,
				LocalDate dateOfJourney) {
			super();
			this.id = id;
			this.paxId = paxId;
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
	    
	    
		

}
