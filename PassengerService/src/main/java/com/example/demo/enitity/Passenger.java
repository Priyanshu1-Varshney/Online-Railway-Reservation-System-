package com.example.demo.enitity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Passenger")
public class Passenger {

	@Id
    private Long paxId;
    private String name;
    private int age;
    private String sex;
    private ArrayList<Train> 
    
    
	public Passenger(Long paxId, String name, int age, String sex) {
		super();
		this.paxId = paxId;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPaxId() {
		return paxId;
	}
	public void setPaxId(Long paxId) {
		this.paxId = paxId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
