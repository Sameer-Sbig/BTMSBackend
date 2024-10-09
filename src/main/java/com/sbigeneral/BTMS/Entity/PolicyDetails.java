package com.sbigeneral.BTMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyDetails {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	@Override
	public String toString() {
		return "PolicyDetails [id=" + id + ", OEM_POLICY_NUMBER=" + OEM_POLICY_NUMBER + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOEM_POLICY_NUMBER() {
		return OEM_POLICY_NUMBER;
	}
	public void setOEM_POLICY_NUMBER(String oEM_POLICY_NUMBER) {
		OEM_POLICY_NUMBER = oEM_POLICY_NUMBER;
	}
	private String OEM_POLICY_NUMBER;
}
