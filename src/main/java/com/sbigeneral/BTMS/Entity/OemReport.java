package com.sbigeneral.BTMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OemReport {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	
	public String createdOn;
	public String totalPolicy;
	public String success;
	public String fail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getTotalPolicy() {
		return totalPolicy;
	}
	public void setTotalPolicy(String totalPolicy) {
		this.totalPolicy = totalPolicy;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getFail() {
		return fail;
	}
	public void setFail(String fail) {
		this.fail = fail;
	}
	@Override
	public String toString() {
		return "OemReport [id=" + id + ", createdOn=" + createdOn + ", totalPolicy=" + totalPolicy + ", success="
				+ success + ", fail=" + fail + "]";
	}
	

}
