package com.XYRAM.Crud_Operation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="Students")
//@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})

public class Student {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "catageory")
	private String catageory;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCatageory() {
		return catageory;
	}
	public void setCatageory(String catageory) {
		this.catageory = catageory;
	}
	
}
