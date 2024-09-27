package com.sbigeneral.BTMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class CustomDate {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	 
	 private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CustomDate [id=" + id + ", date=" + date + "]";
	}
	
}
