package com.sbigeneral.BTMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomMisReport {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String startDate;
	public String endDate;
	public String oemName;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getOemName() {
		return oemName;
	}
	public void setOemName(String oemName) {
		this.oemName = oemName;
	}
	@Override
	public String toString() {
		return "CustomMisReport [startDate=" + startDate + ", endDate=" + endDate + ", oemName=" + oemName + "]";
	}

}
