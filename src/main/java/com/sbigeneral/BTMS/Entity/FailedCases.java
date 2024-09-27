package com.sbigeneral.BTMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FailedCases {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	  private String POLICY_NO;
	  
	  private String BANCS_POLICYID;
	  
	  private String POLICY_HOLDER;
	  
	  private String POLICY_HOLDER_NAME;
	  
	  private String REGISTRATIONNO;
	  
	  private String SUB_CHANNEL_NAME;
	  
	  private String DEALER_CODE;
	  
	  private String SUB_CHANNEL2;
	  
	  private String AGREEMENT_CODE;
	  
	  private String COL_TYPE;
	  
	  private String OEM_PREMIUM_AMOUNT;
	  
	  private String SOA_STATUS;
	  
	  private String ERROR;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPOLICY_NO() {
		return POLICY_NO;
	}

	public void setPOLICY_NO(String pOLICY_NO) {
		POLICY_NO = pOLICY_NO;
	}

	public String getBANCS_POLICYID() {
		return BANCS_POLICYID;
	}

	public void setBANCS_POLICYID(String bANCS_POLICYID) {
		BANCS_POLICYID = bANCS_POLICYID;
	}

	public String getPOLICY_HOLDER() {
		return POLICY_HOLDER;
	}

	public void setPOLICY_HOLDER(String pOLICY_HOLDER) {
		POLICY_HOLDER = pOLICY_HOLDER;
	}

	public String getPOLICY_HOLDER_NAME() {
		return POLICY_HOLDER_NAME;
	}

	public void setPOLICY_HOLDER_NAME(String pOLICY_HOLDER_NAME) {
		POLICY_HOLDER_NAME = pOLICY_HOLDER_NAME;
	}

	public String getREGISTRATIONNO() {
		return REGISTRATIONNO;
	}

	public void setREGISTRATIONNO(String rEGISTRATIONNO) {
		REGISTRATIONNO = rEGISTRATIONNO;
	}

	public String getSUB_CHANNEL_NAME() {
		return SUB_CHANNEL_NAME;
	}

	public void setSUB_CHANNEL_NAME(String sUB_CHANNEL_NAME) {
		SUB_CHANNEL_NAME = sUB_CHANNEL_NAME;
	}

	public String getDEALER_CODE() {
		return DEALER_CODE;
	}

	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
	}

	public String getSUB_CHANNEL2() {
		return SUB_CHANNEL2;
	}

	public void setSUB_CHANNEL2(String sUB_CHANNEL2) {
		SUB_CHANNEL2 = sUB_CHANNEL2;
	}

	public String getAGREEMENT_CODE() {
		return AGREEMENT_CODE;
	}

	public void setAGREEMENT_CODE(String aGREEMENT_CODE) {
		AGREEMENT_CODE = aGREEMENT_CODE;
	}

	public String getCOL_TYPE() {
		return COL_TYPE;
	}

	public void setCOL_TYPE(String cOL_TYPE) {
		COL_TYPE = cOL_TYPE;
	}

	public String getOEM_PREMIUM_AMOUNT() {
		return OEM_PREMIUM_AMOUNT;
	}

	public void setOEM_PREMIUM_AMOUNT(String oEM_PREMIUM_AMOUNT) {
		OEM_PREMIUM_AMOUNT = oEM_PREMIUM_AMOUNT;
	}

	public String getSOA_STATUS() {
		return SOA_STATUS;
	}

	public void setSOA_STATUS(String sOA_STATUS) {
		SOA_STATUS = sOA_STATUS;
	}

	public String getERROR() {
		return ERROR;
	}

	public void setERROR(String eRROR) {
		ERROR = eRROR;
	}

	@Override
	public String toString() {
		return "FailedCases [id=" + id + ", POLICY_NO=" + POLICY_NO + ", BANCS_POLICYID=" + BANCS_POLICYID
				+ ", POLICY_HOLDER=" + POLICY_HOLDER + ", POLICY_HOLDER_NAME=" + POLICY_HOLDER_NAME
				+ ", REGISTRATIONNO=" + REGISTRATIONNO + ", SUB_CHANNEL_NAME=" + SUB_CHANNEL_NAME + ", DEALER_CODE="
				+ DEALER_CODE + ", SUB_CHANNEL2=" + SUB_CHANNEL2 + ", AGREEMENT_CODE=" + AGREEMENT_CODE + ", COL_TYPE="
				+ COL_TYPE + ", OEM_PREMIUM_AMOUNT=" + OEM_PREMIUM_AMOUNT + ", SOA_STATUS=" + SOA_STATUS + ", ERROR="
				+ ERROR + "]";
	}
	  
	  
	  
	  
	  
	  

}
