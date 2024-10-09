package com.sbigeneral.BTMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OEM_CMD_ALL_TABLE", schema = "SOA_OEM")
public class UserPolicyDetails {
	
	@Column(name="ENHANCEPAPD")
	 private String ENHANCEPAPD;


//	@Id
//	  @GeneratedValue(strategy = GenerationType.IDENTITY)
//	  private Long id;
	 
	 
	 @Column(name = "PRODUCT_CODE")
	 private String PRODUCT_CODE;
	 
	 public String getTRANSFER_OF_NCB() {
		return TRANSFER_OF_NCB;
	}
	public void setTRANSFER_OF_NCB(String tRANSFER_OF_NCB) {
		TRANSFER_OF_NCB = tRANSFER_OF_NCB;
	}
	
	@Column(name = "POLICY_HOLDER")
	private String POLICY_HOLDER;
	@Column(name = "IS_CKYC_VERIFIED")
	 private String IS_CKYC_VERIFIED;
	@Column(name = "CKYC_NUMBER")
	 private String CKYC_NUMBER;
	@Column(name = "CKYC_DOCUMENT_UPLOAD")
	 private String CKYC_DOCUMENT_UPLOAD;
	@Column(name = "GENDER")
	 private String GENDER;
	@Column(name = "CKYC_UNIQUE_IDENTIFIER") 
	 private String CKYC_UNIQUE_IDENTIFIER;
	@Column(name = "CKYC_REMARKS") 
	 private String CKYC_REMARKS;
	@Column(name = "POLICY_HOLDER_NAME")
	 private String POLICY_HOLDER_NAME;
	@Column(name = "VEHICLE_TYPE")
	 private String VEHICLE_TYPE;
	@Column(name = "BUSINESS_TYPE")
	 private String BUSINESS_TYPE;
	@Column(name = "COMMERCIAL_TYPE")
	 private String COMMERCIAL_TYPE;
	@Column(name = "POLICY_TYPE")
	 private String POLICY_TYPE;
	@Column(name = "POLICY_PLAN")
	 private String POLICY_PLAN;
	@Column(name = "POLICY_TENURE")
	 private String POLICY_TENURE;
	@Column(name = "ENTRY_DATE")
	 private String ENTRY_DATE;
	@Column(name = "ENTRY_TIME")
	 private String ENTRY_TIME;
	@Column(name = "POLICY_INCEPTION_DATE")
	 private String POLICY_INCEPTION_DATE;
	@Column(name = "POLICY_INCEPTION_TIME")
	 private String POLICY_INCEPTION_TIME;
	@Column(name = "POLICY_DURATION")
	 private String POLICY_DURATION;
	@Column(name = "TERM_UNIT")
	 private String TERM_UNIT;
	@Column(name = "POLICY_EXPIRY_DATE")
	 private String POLICY_EXPIRY_DATE;
	@Column(name = "POLICY_EXPIRY_TIME")
	 private String POLICY_EXPIRY_TIME;
	@Column(name = "ODRED")
	 private String ODRED;
	@Column(name = "COUNTRY")
	 private String COUNTRY;
	@Column(name = "BRANCH_CODE") 
	 private String BRANCH_CODE;
	@Column(name = "USER_BRANCH_NAME")
	 private String USER_BRANCH_NAME;
	@Column(name = "HEAD_OFFICE")
	 private String HEAD_OFFICE;
	@Column(name = "EXEMPTION_CATEGORY")
	 private String EXEMPTION_CATEGORY;
	@Column(name = "ISSUANCE_SOURCE")
	 private String ISSUANCE_SOURCE;
	@Column(name = "OPTION_FOR_CALCULATION")
	 private String OPTION_FOR_CALCULATION;
	@Column(name = "SECTOR")
	 private String SECTOR;
	@Column(name = "CO_INSURANCE_APPLICABLE")
	 private String CO_INSURANCE_APPLICABLE;
	
	@Id
	@Column(name = "OEM_POLICY_NUMBER")
	 private String OEM_POLICY_NUMBER;
	@Column(name = "INWARD_NUMBER")
	 private String INWARD_NUMBER;
	@Column(name = "POLICY_ISSUED_DATE")
	 private String POLICY_ISSUED_DATE;
	@Column(name = "RENEWAL_APPLICABLE")
	 private String RENEWAL_APPLICABLE;
	@Column(name = "GO_GREEN")
	 private String GO_GREEN;
	@Column(name = "PROPOSAL_IDENTIFICATION_NUMBER")
	 private String PROPOSAL_IDENTIFICATION_NUMBER;
	@Column(name = "PREVIOUS_POLICY_AVAILABLE")
	 private String PREVIOUS_POLICY_AVAILABLE;
	@Column(name = "PREVIOUS_POLICY_NUMBER")
	 private String PREVIOUS_POLICY_NUMBER;
	@Column(name = "PREV_INSURANCE_COMPANY_NAME")
	 private String PREV_INSURANCE_COMPANY_NAME;
	@Column(name = "PREVIOUS_POLICY_INCEPTION_DATE")
	 private String PREVIOUS_POLICY_INCEPTION_DATE;
	@Column(name = "PREVIOUS_POLICY_EXPIRY_DATE")
	 private String PREVIOUS_POLICY_EXPIRY_DATE;
	@Column(name = "PREVIOUS_POLICY_TERM")
	 private String PREVIOUS_POLICY_TERM;
	@Column(name = "PREVIOUS_POLICY_TYPE")
	 private String PREVIOUS_POLICY_TYPE;
	@Column(name = "CLAIM_APPLICABLE")
	 private String CLAIM_APPLICABLE;
	@Column(name = "NUMBER_OF_CLAIM_ON_PREV_POLICY")
	 private String NUMBER_OF_CLAIM_ON_PREV_POLICY;
	@Column(name = "LEAD_NUMBER")
	 private String LEAD_NUMBER;
	@Column(name = "PREVIOUS_COMPANY_EMAIL_ID")
	 private String PREVIOUS_COMPANY_EMAIL_ID;
	@Column(name = "PROPOSAL_IS_BREAK_IN")
	 private String PROPOSAL_IS_BREAK_IN;
	@Column(name = "REINSTATE_REQUIRED")
	 private String REINSTATE_REQUIRED;
	@Column(name = "RENEWAL_NOTICE_TO_BE_GENERATED")
	 private String RENEWAL_NOTICE_TO_BE_GENERATED;
	@Column(name = "RENEWAL_STATUS")
	 private String RENEWAL_STATUS;
	@Column(name = "DEALER_CODE")
	 private String DEALER_CODE;
	@Column(name = "SUB_CHANNEL2")
	 private String SUB_CHANNEL2;
	@Column(name = "AGREEMENT_CODE")
	 private String AGREEMENT_CODE;
	@Column(name = "IS_CUST_ID_SAME_PAYER_ID")
	 private String IS_CUST_ID_SAME_PAYER_ID;
	@Column(name = "ACTIVE_TP_POLICY_NUMBER")
	 private String ACTIVE_TP_POLICY_NUMBER;
	@Column(name = "ACTIVE_TP_INS_COMPANY_NAME")
	 private String ACTIVE_TP_INS_COMPANY_NAME;
	@Column(name = "ACTIVE_TP_BRANCH_ADDRESS")
	 private String ACTIVE_TP_BRANCH_ADDRESS;
	@Column(name = "ACTIVE_TP_POLICY_INCEPT_DATE")
	 private String ACTIVE_TP_POLICY_INCEPT_DATE;
	@Column(name = "ACTIVE_TP_POLICY_EXPIRY_DATE")
	 private String ACTIVE_TP_POLICY_EXPIRY_DATE;
	@Column(name = "ACTIVE_TP_POLICY_TERM")
	 private String ACTIVE_TP_POLICY_TERM;
	@Column(name = "MISC_VEHICLE_SUB_TYPE")
	 private String MISC_VEHICLE_SUB_TYPE;
	@Column(name = "COMPUTATION_TYPE")
	 private String COMPUTATION_TYPE;
	@Column(name = "INSPECTION_WAIVER")
	 private String INSPECTION_WAIVER;
	@Column(name = "PIN_NUMBER")
	 private String PIN_NUMBER;
	@Column(name = "VEHICLE_INSPECTION_STATUS")
	 private String VEHICLE_INSPECTION_STATUS;
	@Column(name = "INSPECTION_DATE")
	 private String INSPECTION_DATE;
	@Column(name = "INSPECTION_AGENCY_NAME")
	 private String INSPECTION_AGENCY_NAME;
	@Column(name = "REMARKS")
	 private String REMARKS;
	@Column(name = "INSPECTION_REASON")
	 private String INSPECTION_REASON;
	@Column(name = "NCB_DISCOUNT_AMOUNT")
	 private String NCB_DISCOUNT_AMOUNT;
	@Column(name = "ARE_YOU_ENTITLED_TO_NCB")
	 private String ARE_YOU_ENTITLED_TO_NCB;
	@Column(name = "HAS_ANY_INSURANCE_COMPANY_EVER")
	 private String HAS_ANY_INSURANCE_COMPANY_EVER;
	@Column(name = "DOES_DRIVER_SUFFER_DEFECTIVE")
	 private String DOES_DRIVER_SUFFER_DEFECTIVE;
	@Column(name = "DRIVER_BEEN_INVOL_CONVICTED")
	 private String DRIVER_BEEN_INVOL_CONVICTED;
	@Column(name = "IS_VEHICLE_IN_GOOD_CONDITION")
	 private String IS_VEHICLE_IN_GOOD_CONDITION;
	@Column(name = "ROAD_TYPE")
	 private String ROAD_TYPE;
	@Column(name = "USE_OF_VEHICLE")
	 private String USE_OF_VEHICLE;
	@Column(name = "AVERAGE_DAILY_USE_OF_VEHICLE")
	 private String AVERAGE_DAILY_USE_OF_VEHICLE;
	@Column(name = "LOCATION_FOR_PARK_DURING_DAY")
	 private String LOCATION_FOR_PARK_DURING_DAY;
	@Column(name = "LOCATION_FOR_PARK_DURING_NIGHT")
	 private String LOCATION_FOR_PARK_DURING_NIGHT;
	@Column(name = "DRIVING_EXPERIENCE_IN_YEARS")
	 private String DRIVING_EXPERIENCE_IN_YEARS;
	@Column(name = "AGE_OF_THE_DRIVER")
	 private String AGE_OF_THE_DRIVER;
	@Column(name = "TYRE_SERIAL_NUMBER")
	 private String TYRE_SERIAL_NUMBER;
	@Column(name = "TRANSFER_OF_NCB")
	 private String TRANSFER_OF_NCB;
	@Column(name = "NCB_ON_PREVIOUS_POLICY")
	 private String NCB_ON_PREVIOUS_POLICY;
	@Column(name = "PROOF_PROVIDED_FOR_NCB")
	 private String PROOF_PROVIDED_FOR_NCB;
	@Column(name = "APPLICABLE_NCB_PERCENT")
	 private String APPLICABLE_NCB_PERCENT;
	 
	 
	 
	@Column(name = "NCB_STATUS")                   
	 private String NCB_STATUS;
	@Column(name = "NCB_RECOVERY_REASON")
	 private String NCB_RECOVERY_REASON;
	@Column(name = "REGISTRATION_NUMBER")
	 private String REGISTRATION_NUMBER;
	@Column(name = "REGISTRATION_NUMBER_FORMAT")
	 private String REGISTRATION_NUMBER_FORMAT;
	@Column(name = "REGISTRATION_NO_BOX_1")
	 private String REGISTRATION_NO_BOX_1;
	@Column(name = "REGISTRATION_NO_BOX_2")
	 private String REGISTRATION_NO_BOX_2;
	@Column(name = "REGISTRATION_NO_BOX_3")
	 private String REGISTRATION_NO_BOX_3;
	@Column(name = "REGISTRATION_NO_BOX_4")
	 private String REGISTRATION_NO_BOX_4;
	@Column(name = "ENGINE_NUMBER")
	 private String ENGINE_NUMBER;
	@Column(name = "CHASIS_NUMBER")
	 private String CHASIS_NUMBER;
	@Column(name = "MODEL_YEAR")
	 private String MODEL_YEAR;
	@Column(name = "VEHICLE_MAKE")
	 private String VEHICLE_MAKE;
	@Column(name = "VEHICLE_MODEL")
	 private String VEHICLE_MODEL;
	@Column(name = "VEHICLE_SPECIFICATION")
	 private String VEHICLE_SPECIFICATION;
	@Column(name = "TYPE_OF_FUEL")
	 private String TYPE_OF_FUEL;
	@Column(name = "DATE_OF_REGISTRATION")
	 private String DATE_OF_REGISTRATION;
	@Column(name = "TYPE_OF_MODIFICATION")
	 private String TYPE_OF_MODIFICATION; ;
	 @Column(name = "RTA_CODE")
	 private String RTA_CODE;
	 @Column(name ="INCONVENIENCE_ALLOWANCE")
	 private String INCONVENIENCE_ALLOWANCE;
	 @Column(name = "EMI_PROTECTOR")
	 private String EMI_PROTECTOR;
	 @Column(name = "EMI_AMOUNT")
	 private String EMI_AMOUNT;
	 @Column(name = "EMI_DEDUCTIBLE_AMOUNT")
	 private String EMI_DEDUCTIBLE_AMOUNT;
	 @Column(name = "ENHANCED_PA_OWNER_DRIVER_SI")
	 private String ENHANCED_PA_OWNER_DRIVER_SI;
	 @Column(name = "ENHANCED_PA__PAID_DRIVER_SI")
	 private String ENHANCED_PA__PAID_DRIVER_SI;
	 @Column(name = "ENHANCED_PA_UN_NAMED_PASS_SI")
	 private String ENHANCED_PA_UN_NAMED_PASS_SI;
	 @Column(name = "ZONE")
	 private String ZONE;
	 @Column(name = "EMERGENCY_MEDICAL_EXPENSE")
	 private String EMERGENCY_MEDICAL_EXPENSE;
	 @Column(name = "PRESENCE_OF_AIRBAGS")
	 private String PRESENCE_OF_AIRBAGS;
	 @Column(name = "TYRE_AND_RIM_GUARD")
	 private String TYRE_AND_RIM_GUARD;
	 @Column(name = "TYRE_AND_RIM_GUARD_DED_AMOUNT")
	 private String TYRE_AND_RIM_GUARD_DED_AMOUNT;
	 @Column(name = "HOSPITAL_CASH_UN_NAMED_PASS_SI")
	 private String HOSPITAL_CASH_UN_NAMED_PASS_SI;
	 @Column(name = "HOSPITAL_CASH_PAID_DRIVER_SI")
	 private String HOSPITAL_CASH_PAID_DRIVER_SI;
	 @Column(name = "HOSPITAL_CASH_OWNER_DRIVER_SI")
	 private String HOSPITAL_CASH_OWNER_DRIVER_SI;
	 @Column(name = "DEPRECIATION_REIMBURSEMENT")
	 private String DEPRECIATION_REIMBURSEMENT;
	 @Column(name = "RETURN_TO_INVOICE")
	 private String RETURN_TO_INVOICE;
	 @Column(name = "COVER_FOR_CONSUMABLES")
	 private String COVER_FOR_CONSUMABLES;
	 @Column(name = "ENGINE_GUARD")
	 private String ENGINE_GUARD;
	 @Column(name = "KEY_REPLACEMENT_COVER")
	 private String KEY_REPLACEMENT_COVER;
	 @Column(name = "PROTECTION_OF_NCB")
	 private String PROTECTION_OF_NCB;
	 @Column(name = "BASIC_ROAD_SIDE_ASSISTANCE")
	 private String BASIC_ROAD_SIDE_ASSISTANCE;
	 @Column(name = "ADDITIONAL_ROADSIDE_ASSISTANCE")
	 private String ADDITIONAL_ROADSIDE_ASSISTANCE;
	 @Column(name = "LOSS_OF_PERSONAL_BELONGINGS")
	 private String LOSS_OF_PERSONAL_BELONGINGS;
	 @Column(name = "LOSS_OF_PERSONAL_BELONGINGS_SI")
	 private String LOSS_OF_PERSONAL_BELONGINGS_SI;
	 @Column(name = "RSA_VENDOR_NAME")
	 private String RSA_VENDOR_NAME;
	 @Column(name = "CPA_COVER_WAIVER_REQUIRED")
	 private String CPA_COVER_WAIVER_REQUIRED;
	 @Column(name = "REASON_FOR_WAIVER")
	 private String REASON_FOR_WAIVER;
	 @Column(name = "YEAR_OF_COVERAGE")
	 private String YEAR_OF_COVERAGE;
	 @Column(name = "PARED")
	 private String PARED;
	 @Column(name = "NOMINEE_NAME")
	 private String NOMINEE_NAME;
	 @Column(name = "AGE")
	 private String AGE;
	 @Column(name = "RELATIONSHIP_WITH_OWNER")
	 private String RELATIONSHIP_WITH_OWNER;
	 @Column(name = "NAME_OF_APPOINTEE")
	 private String NAME_OF_APPOINTEE;
	 @Column(name = "APPOINTEE_RELATIONSHIP")
	 private String APPOINTEE_RELATIONSHIP;
	 @Column(name = "RISK_INCEPTION_DATE")
	 private String RISK_INCEPTION_DATE;
	 @Column(name = "RISK_EXPIRY_DATE")
	 private String RISK_EXPIRY_DATE;
	 @Column(name = "RISK_INCEPTION_TIME")
	 private String	 RISK_INCEPTION_TIME;
	 @Column(name = "RISK_EXPIRY_TIME")
	 private String	 RISK_EXPIRY_TIME;
	 @Column(name = "VEHICLE_COLOR")
	 private String VEHICLE_COLOR;
	 @Column(name = "VEHICLE_AGE")
	 private String	 VEHICLE_AGE;
	 @Column(name = "VEHICLE_IDV")
	 private String VEHICLE_IDV;
	 @Column(name = "ORIGINAL_IDV")
	 private String ORIGINAL_IDV;
	 @Column(name = "IS_CNGLPG_EXTRA_FITTED")
	 private String IS_CNGLPG_EXTRA_FITTED;
	 @Column(name = "CNGLPG_KIT_IDV")
	 private String CNGLPG_KIT_IDV;

	 @Column(name = "MULTIPLE_ACCESSORIES_PRESENT")
	 private String MULTIPLE_ACCESSORIES_PRESENT;

	 @Column(name = "VALUE_OF_EXTRA_ELECTR_ELECTRON")
	 private String VALUE_OF_EXTRA_ELECTR_ELECTRON;

	 @Column(name = "VALUE_OF_EXTRA_NON_ELECTRICAL")
	 private String VALUE_OF_EXTRA_NON_ELECTRICAL;

	 @Column(name = "IDV_OF_ACCESSORIES")
	 private String IDV_OF_ACCESSORIES;

	 @Column(name = "TOTAL_IDV")
	 private String TOTAL_IDV;

	 @Column(name = "IS_CAR_USED_DEMONSTRATION_PURP")
	 private String IS_CAR_USED_DEMONSTRATION_PURP;

	 @Column(name = "IS_CAR_USED_DRIVING_TUITION_PU")
	 private String IS_CAR_USED_DRIVING_TUITION_PU;

	 @Column(name = "ROAD_TAX_AMOUNT")
	 private String ROAD_TAX_AMOUNT;

	 @Column(name = "ADDITIONAL_TOWING_CHARGES")
	 private String ADDITIONAL_TOWING_CHARGES;

	 @Column(name = "EXTENSION_OF_GEOGRAPHICAL_IMT1")
	 private String EXTENSION_OF_GEOGRAPHICAL_IMT1;

	 @Column(name = "WHETHER_VINTAGE_CAR_IMT2")
	 private String WHETHER_VINTAGE_CAR_IMT2;

	 @Column(name = "MEMBER_AUTOMOBILE_ASSO_IMT8")
	 private String MEMBER_AUTOMOBILE_ASSO_IMT8;

	 @Column(name = "NAME_OF_ASSOCIATION")
	 private String NAME_OF_ASSOCIATION;

	 @Column(name = "MEMBERSHIP_NO")
	 private String MEMBERSHIP_NO;

	 @Column(name = "IS_LIFE_MEMBER")
	 private String IS_LIFE_MEMBER;

	 @Column(name = "DATE_OF_MEMBERSHIP_EXPIRY")
	 private String DATE_OF_MEMBERSHIP_EXPIRY;

	 @Column(name = "VEH_FIT_ANTITHEFT_DEVICE_IMT10")
	 private String VEH_FIT_ANTITHEFT_DEVICE_IMT10;

	 @Column(name = "DESIGNED_BLIND_HANDICAP_IMT12")
	 private String DESIGNED_BLIND_HANDICAP_IMT12;

	 @Column(name = "USE_LIMIT_TO_OWN_PREMISE_IMT13")
	 private String USE_LIMIT_TO_OWN_PREMISE_IMT13;

	 @Column(name = "PREMISE_ADDRESS")
	 private String PREMISE_ADDRESS;

	 @Column(name = "PA_COVER_TO_NAMED_PERSON_IMT15")
	 private String PA_COVER_TO_NAMED_PERSON_IMT15;

	 @Column(name = "INDIVIDUAL_SI_FOR_IMT_15")
	 private String INDIVIDUAL_SI_FOR_IMT_15;

	 @Column(name = "NUMBER_OF_NAMED_PERSONS")
	 private String NUMBER_OF_NAMED_PERSONS;

	 @Column(name = "PA_COVER_UNNAMED_PERSON_IMT16")
	 private String PA_COVER_UNNAMED_PERSON_IMT16;

	 @Column(name = "NO_OF_UNNAMED_PERSONS")
	 private String NO_OF_UNNAMED_PERSONS;

	 @Column(name = "INDIVIDUAL_SI_FOR_IMT_16")
	 private String INDIVIDUAL_SI_FOR_IMT_16;

	 @Column(name = "PA_COVER_TO_PAID_DRIVERS_IMT17")
	 private String PA_COVER_TO_PAID_DRIVERS_IMT17;

	 @Column(name = "NO_OF_PAID_DRIVER_CLEA_CONDUCT")
	 private String NO_OF_PAID_DRIVER_CLEA_CONDUCT;

	 @Column(name = "INDIVIDUAL_SI")
	 private String INDIVIDUAL_SI;

	 @Column(name = "IMPORTED_WITHOUT_CUSTOM_IMT19")
	 private String IMPORTED_WITHOUT_CUSTOM_IMT19;

	 @Column(name = "TPPD_COVER_TO_THE_LIMIT_IMT20")
	 private String TPPD_COVER_TO_THE_LIMIT_IMT20;

	 @Column(name = "COMPULSARY_DEDUCTABLE_IMT22")
	 private String COMPULSARY_DEDUCTABLE_IMT22;

	 @Column(name = "VOLUNTARY_DEDUCTABLE_IMT22A")
	 private String VOLUNTARY_DEDUCTABLE_IMT22A;

	 @Column(name = "IMPOSED_EXCESS")
	 private String IMPOSED_EXCESS;

	 @Column(name = "NO_OF_LL_TO_PAID_DRIVERIMT28")
	 private String NO_OF_LL_TO_PAID_DRIVERIMT28;

	 @Column(name = "NO_OF_LL_TO_EMPLOYEES_IMT29")
	 private String NO_OF_LL_TO_EMPLOYEES_IMT29;

	 @Column(name = "RALLY_TYPE_IMT31")
	 private String RALLY_TYPE_IMT31;

	 @Column(name = "ASSOCIATION_NAME")
	 private String ASSOCIATION_NAME;

	 @Column(name = "NO_OF_DAYS_FOR_RALLY_IMT31")
	 private String NO_OF_DAYS_FOR_RALLY_IMT31;

	 @Column(name = "START_DATE_OF_RALLY_IMT31")
	 private String START_DATE_OF_RALLY_IMT31;

	 @Column(name = "END_DATE_OF_RALLY_IMT31")
	 private String END_DATE_OF_RALLY_IMT31;

	 @Column(name = "RALLY_ADDITIONAL_EXCESS")
	 private String RALLY_ADDITIONAL_EXCESS;

	 @Column(name = "ACCIDENT_SOLDIER_SAILOR_IMT32")
	 private String ACCIDENT_SOLDIER_SAILOR_IMT32;

	 @Column(name = "NO_OF_PERSONS_FOR_IMT_32")
	 private String NO_OF_PERSONS_FOR_IMT_32;

	 @Column(name = "TRAILERS_IDV")
	 private String TRAILERS_IDV;

	 @Column(name = "ATTACHED_TRAILER_SI")
	 private String ATTACHED_TRAILER_SI;

	 @Column(name = "NUMBER_OF_TRAILERS")
	 private String NUMBER_OF_TRAILERS;

	 @Column(name = "GO_SMART_FLEXI_APPLICABLE")
	 private String GO_SMART_FLEXI_APPLICABLE;

	 @Column(name = "KILOMETER_BAND")
	 private String KILOMETER_BAND;

	 @Column(name = "ACTUAL_KILOMETER")
	 private String ACTUAL_KILOMETER;

	 @Column(name = "INSUREDINTEREST")
	 private String INSUREDINTEREST;

	 @Column(name = "HELMET_PROTECTION_SI")
	 private String HELMET_PROTECTION_SI;

	 @Column(name = "HELMET_PROTECTIONS")
	 private String HELMET_PROTECTIONS;

	 @Column(name = "SIDE_CAR")
	 private String SIDE_CAR;

	 @Column(name = "SIDE_CAR_SUM_INSURED")
	 private String SIDE_CAR_SUM_INSURED;

	 @Column(name = "BODY_STYLE_DESCRIPTION")
	 private String BODY_STYLE_DESCRIPTION;

	 @Column(name = "BUILT_IN_LPG_KIT_IMT23")
	 private String BUILT_IN_LPG_KIT_IMT23;

	 @Column(name = "USED_PRIVATE_PURPOSE_IMT34")
	 private String USED_PRIVATE_PURPOSE_IMT34;

	 @Column(name = "PA_COVER_PILLION_RIDER_IMT16")
	 private String PA_COVER_PILLION_RIDER_IMT16;

	 @Column(name = "DRIVER_GENDER")
	 private String DRIVER_GENDER;

	 @Column(name = "DRIVING_LICENCE_NUMBER")
	 private String DRIVING_LICENCE_NUMBER;

	 @Column(name = "FIBRE_GLASS_TANK_UNIT")
	 private String FIBRE_GLASS_TANK_UNIT;

	 @Column(name = "HORSE_POWER")
	 private String HORSE_POWER;

	 @Column(name = "IMT_46_LL_TO_PASSENGERS")
	 private String IMT_46_LL_TO_PASSENGERS;

	 @Column(name = "IMT44")
	 private String IMT44;

	 @Column(name = "IMT48")
	 private String IMT48;

	 @Column(name = "IMT49")
	 private String IMT49;

	 @Column(name = "IMT50")
	 private String IMT50;

	 @Column(name = "IMT51")
	 private String IMT51;

	 @Column(name = "IMT52")
	 private String IMT52;

	 @Column(name = "IMT53")
	 private String IMT53;

	 @Column(name = "IMT54")
	 private String IMT54;

	 @Column(name = "IMT55")
	 private String IMT55;

	 @Column(name = "INDEMNITY_TO_HIRER")
	 private String INDEMNITY_TO_HIRER;

	 @Column(name = "VEHICLE_USED_DRIVING_TUITION")
	 private String VEHICLE_USED_DRIVING_TUITION;

	 @Column(name = "LL_TO_NFPP_EMP_OUTSIDEWC_IMT37")
	 private String LL_TO_NFPP_EMP_OUTSIDEWC_IMT37;

	 @Column(name = "LL_TO_NFPP_NOT_EMPLOYEE_IMT37A")
	 private String LL_TO_NFPP_NOT_EMPLOYEE_IMT37A;

	 @Column(name = "LOSS_OF_ACCESSORIES_IMT33")
	 private String LOSS_OF_ACCESSORIES_IMT33;

	 @Column(name = "SI_FOR_LOSS_OF_ACCESSORIES")
	 private String SI_FOR_LOSS_OF_ACCESSORIES;

	 @Column(name = "NO_OF_LL_PD_CLEAN_CONDUC_IMT40")
	 private String NO_OF_LL_PD_CLEAN_CONDUC_IMT40;

	 @Column(name = "NO_OF_PERSON_EMPL_IMT39_IMT39A")
	 private String NO_OF_PERSON_EMPL_IMT39_IMT39A;

	 @Column(name = "PER_DAY_BENEFIT_LOSS_OF_INCOME")
	 private String PER_DAY_BENEFIT_LOSS_OF_INCOME;

	 @Column(name = "NUMBER_OF_DAY_F_LOSS_OF_INCOME")
	 private String NUMBER_OF_DAY_F_LOSS_OF_INCOME;

	 @Column(name = "LOSS_OF_INCOME_DEDUCTIBLE")
	 private String LOSS_OF_INCOME_DEDUCTIBLE;

	 @Column(name = "TYPE_OF_PERMIT")
	 private String TYPE_OF_PERMIT;

	 @Column(name = "THEFT_AND_CONVERSION_IMT43")
	 private String THEFT_AND_CONVERSION_IMT43;

	 @Column(name = "OVER_TURNING_COVER")
	 private String OVER_TURNING_COVER;

	 @Column(name = "PROPOSED_USAGE")
	 private String PROPOSED_USAGE;

	 @Column(name = "DRIVING_LICENSE_EXPIRY_DATE")
	 private String DRIVING_LICENSE_EXPIRY_DATE;

	 @Column(name = "GEO_EXT_BANGLADESH")
	 private String GEO_EXT_BANGLADESH;

	 @Column(name = "GEO_EXT_BHUTAN")
	 private String GEO_EXT_BHUTAN;

	 @Column(name = "GEO_EXT_MALDIVES")
	 private String GEO_EXT_MALDIVES;

	 @Column(name = "GEO_EXT_NEPAL")
	 private String GEO_EXT_NEPAL;

	 @Column(name = "GEO_EXT_PAKISTAN")
	 private String GEO_EXT_PAKISTAN;

	 @Column(name = "GEO_EXT_SRILANKA")
	 private String GEO_EXT_SRILANKA;

	 @Column(name = "TRGCOVER_TYRE1_MFYR")
	 private String TRGCOVER_TYRE1_MFYR;

	 @Column(name = "TRGCOVER_TYRE1_SRNO")
	 private String TRGCOVER_TYRE1_SRNO;

	 @Column(name = "TRGCOVER_TYRE2_MFYR")
	 private String TRGCOVER_TYRE2_MFYR;

	 @Column(name = "TRGCOVER_TYRE2_SRNO")
	 private String TRGCOVER_TYRE2_SRNO;

	 @Column(name = "TRGCOVER_TYRE3_MFYR")
	 private String TRGCOVER_TYRE3_MFYR;

	 @Column(name = "TRGCOVER_TYRE3_SRNO")
	 private String TRGCOVER_TYRE3_SRNO;

	 @Column(name = "TRGCOVER_TYRE4_MFYR")
	 private String TRGCOVER_TYRE4_MFYR;

	 @Column(name = "TRGCOVER_TYRE4_SRNO")
	 private String TRGCOVER_TYRE4_SRNO;

	 @Column(name = "TRAILER_REG_NO")
	 private String TRAILER_REG_NO;

	 @Column(name = "TRAILER_CHASSIS_NO")
	 private String TRAILER_CHASSIS_NO;

	 @Column(name = "TRAILER_YEAR_OF_MANF")
	 private String TRAILER_YEAR_OF_MANF;

	 @Column(name = "MULTI_ELE_ITEM_DESC")
	 private String MULTI_ELE_ITEM_DESC;

	 @Column(name = "MULTI_ELE_IDV")
	 private String MULTI_ELE_IDV;

	 @Column(name = "MULTI_ELE_ACCESS_DESC")
	 private String MULTI_ELE_ACCESS_DESC;

	 @Column(name = "MULTI_NON_ELE_ITEM_DESC")
	 private String MULTI_NON_ELE_ITEM_DESC;

	 @Column(name = "MULTI_NON_ELE_IDV")
	 private String MULTI_NON_ELE_IDV;

	 @Column(name = "MULTI_NON_ELE_ACCESS_DESC")
	 private String MULTI_NON_ELE_ACCESS_DESC;

	 @Column(name = "ELCTRICELECTRNICACCS")
	 private String ELCTRICELECTRNICACCS;

	 @Column(name = "TOWINGCHARG")
	 private String TOWINGCHARG;

	 @Column(name = "HOSPODCOVER")
	 private String HOSPODCOVER;

	 @Column(name = "ENGINEGUARD")
	 private String ENGINEGUARD;

	 @Column(name = "INCONVENIENCECOVER")
	 private String INCONVENIENCECOVER;

	 @Column(name = "NMDPAPRACPDDRVCL")
	 private String NMDPAPRACPDDRVCL;

	 @Column(name = "PASOLDRSSAILORSAIRMN")
	 private String PASOLDRSSAILORSAIRMN;

	 @Column(name = "ENHANCEDPAOD")
	 private String ENHANCEDPAOD;

	 @Column(name = "BASICROADSIDE")
	 private String BASICROADSIDE;

	 @Column(name = "BASICOD")
	 private String BASICOD;

	 @Column(name = "MEDICALEXPENSES")
	 private String MEDICALEXPENSES;

	 @Column(name = "LLTOEMPLOYEE")
	 private String LLTOEMPLOYEE;

	 @Column(name = "UNPAPRACPDDRVCLN")
	 private String UNPAPRACPDDRVCLN;

	 @Column(name = "VEXTENSIONRCSPTP")
	 private String VEXTENSIONRCSPTP;

	 @Column(name = "EMIPROTECTIONCOVER")
	 private String EMIPROTECTIONCOVER;

	 @Column(name = "ENHANCEDUNNAMED")
	 private String ENHANCEDUNNAMED;

	 @Column(name = "CPACOVER")
	 private String CPACOVER;

	 @Column(name = "VKEYREPLACEMENTCOV")
	 private String VKEYREPLACEMENTCOV;

	 @Column(name = "TRAILERSOD")
	 private String TRAILERSOD;

	 @Column(name = "RETINVOCOVER")
	 private String RETINVOCOVER;

	 @Column(name = "RTRODCOVER")
	 private String RTRODCOVER;

	 @Column(name = "TRGCOVER")
	 private String TRGCOVER;

	 @Column(name = "EXTENSIONGEOTP")
	 private String EXTENSIONGEOTP;

	 @Column(name = "NONELECTRICALACSRYOD")
	 private String NONELECTRICALACSRYOD;

	 @Column(name = "BASICTP")
	 private String BASICTP;

	 @Column(name = "EXTERNALLYLPGCNG")
	 private String EXTERNALLYLPGCNG;

	 @Column(name = "GEOAREAOD")
	 private String GEOAREAOD;

	 @Column(name = "VEXTENSIONOD")
	 private String VEXTENSIONOD;

	 @Column(name = "CONSUMABLECOV")
	 private String CONSUMABLECOV;

	 @Column(name = "CNGLPGBIFUELTP")
	 private String CNGLPGBIFUELTP;

	 @Column(name = "LLTOPAIDDRIVER")
	 private String LLTOPAIDDRIVER;

	 @Column(name = "VEHICLESIMPORTED")
	 private String VEHICLESIMPORTED;

	 @Column(name = "PRSNLACDNCVPDDRVCLN")
	 private String PRSNLACDNCVPDDRVCLN;

	 @Column(name = "INBUILTCNGLPG")
	 private String INBUILTCNGLPG;

	 @Column(name = "ADDROADSIDE")
	 private String ADDROADSIDE;

	 @Column(name = "VVNCBCOVER")
	 private String VVNCBCOVER;

	 @Column(name = "LOSSOFPERSONAL")
	 private String LOSSOFPERSONAL;

	 @Column(name = "VDRIVINGTUITIONS")
	 private String VDRIVINGTUITIONS;

	 @Column(name = "HOSPUPCOVER")
	 private String HOSPUPCOVER;

	 @Column(name = "TRAILERSTP")
	 private String TRAILERSTP;

	 @Column(name = "FIBREGLASSFUELTANK")
	 private String FIBREGLASSFUELTANK;
	 @Column(name = "ENHANCEDPAPD")
	 private String ENHANCEDPAPD;

	 @Column(name = "DEPRECIATIONREIM")
	 private String DEPRECIATIONREIM;

	 @Column(name = "RTRTPCOVER")
	 private String RTRTPCOVER;

	 @Column(name = "HOSPPDCOVER")
	 private String HOSPPDCOVER;

	 @Column(name = "GEOGRAPHICALTP")
	 private String GEOGRAPHICALTP;

	 @Column(name = "RTRCOVER")
	 private String RTRCOVER;

	 @Column(name = "CONSUMABLESCOVER")
	 private String CONSUMABLESCOVER;

	 @Column(name = "HELMETPROT")
	 private String HELMETPROT;

	 @Column(name = "PRONCBCOVER")
	 private String PRONCBCOVER;

	 @Column(name = "MEDICALEXPENSE")
	 private String MEDICALEXPENSE;

	 @Column(name = "INSUREDPA")
	 private String INSUREDPA;

	 @Column(name = "UNNAMEDPA")
	 private String UNNAMEDPA;

	 @Column(name = "LLPAIDDRIVER")
	 private String LLPAIDDRIVER;

	 @Column(name = "LLEMPLOYEES")
	 private String LLEMPLOYEES;

	 @Column(name = "RTRTPCOVERMASTER")
	 private String RTRTPCOVERMASTER;

	 @Column(name = "TYRERIMCOVER")
	 private String TYRERIMCOVER;

	 @Column(name = "INCONVENIENCEMASTER")
	 private String INCONVENIENCEMASTER;

	 @Column(name = "SCCOVER")
	 private String SCCOVER;

	 @Column(name = "EXTERNALLYCNGLPG")
	 private String EXTERNALLYCNGLPG;

	 @Column(name = "DRIVINGTUTIONS")
	 private String DRIVINGTUTIONS;

	 @Column(name = "EXTENSIONOD")
	 private String EXTENSIONOD;

	 @Column(name = "EXTENSTIONTP")
	 private String EXTENSTIONTP;

	 @Column(name = "ACCESSORIESLOSS")
	 private String ACCESSORIESLOSS;

	 @Column(name = "CNGLPGTP")
	 private String CNGLPGTP;

	 @Column(name = "FIBREGLASS")
	 private String FIBREGLASS;

	 @Column(name = "IMT44OD")
	 private String IMT44OD;

	 @Column(name = "IMT37A")
	 private String IMT37A;

	 @Column(name = "IMT43")
	 private String IMT43;

	 @Column(name = "IMT44TP")
	 private String IMT44TP;

	 @Column(name = "YPCOMMERCIALPVT")
	 private String YPCOMMERCIALPVT;

	 @Column(name = "PATOPAIDCLNCON")
	 private String PATOPAIDCLNCON;

	 @Column(name = "HOSPITALCASHOD")
	 private String HOSPITALCASHOD;

	 @Column(name = "IMT37")
	 private String IMT37;

	 @Column(name = "ENHANCEPAOD")
	 private String ENHANCEPAOD;

	 @Column(name = "RETURNTOINVOICE")
	 private String RETURNTOINVOICE;

	 @Column(name = "LOSSOFINCOME")
	 private String LOSSOFINCOME;

	 @Column(name = "ADDTOWINGCHARGE")
	 private String ADDTOWINGCHARGE;

	 @Column(name = "IMT23")
	 private String IMT23;

	 @Column(name = "EMIPROTECTOR")
	 private String EMIPROTECTOR;

	 @Column(name = "ODCOMMERCIALPRIVATE")
	 private String ODCOMMERCIALPRIVATE;

	 @Column(name = "IMT40")
	 private String IMT40;

	 @Column(name = "HOSPITALCASHPD")
	 private String HOSPITALCASHPD;

	 @Column(name = "NONELECTRICALACCES")
	 private String NONELECTRICALACCES;

	 @Column(name = "FIBREGLASSTANK")
	 private String FIBREGLASSTANK;

	 @Column(name = "VEHICLEIMPORT")
	 private String VEHICLEIMPORT;

	 @Column(name = "EXTNGEOOD")
	 private String EXTNGEOOD;

	 @Column(name = "BIFUELCNGLPGOD")
	 private String BIFUELCNGLPGOD;

	 @Column(name = "INBUILTCNGLPGOD")
	 private String INBUILTCNGLPGOD;

	 @Column(name = "DEPREIMBURSEMENT")
	 private String DEPREIMBURSEMENT;

	 @Column(name = "ZDRIVINGTUITIONS")
	 private String ZDRIVINGTUITIONS;

	 @Column(name = "PROTECTIONOFNCB")
	 private String PROTECTIONOFNCB;

	 @Column(name = "KEYREPLACEMENTCOV")
	 private String KEYREPLACEMENTCOV;

	 @Column(name = "IMT39A")
	 private String IMT39A;

	 @Column(name = "LLTOEMPLOYED")
	 private String LLTOEMPLOYED;

	 @Column(name = "IMT39")
	 private String IMT39;

	 @Column(name = "ODIMT23")
	 private String ODIMT23;

	 @Column(name = "IMT47")
	 private String IMT47;

	 @Column(name = "IMT46")
	 private String IMT46;

	 @Column(name = "PARTY_TYPE")
	 private String PARTY_TYPE;

	 @Column(name = "FIRST_NAME")
	 private String FIRST_NAME;

	 @Column(name = "MIDDLE_NAME")
	 private String MIDDLE_NAME;

	 @Column(name = "LAST_NAME")
	 private String LAST_NAME;

	 @Column(name = "SEX")
	 private String SEX;

	 @Column(name = "NATIONALITY")
	 private String NATIONALITY;

	 @Column(name = "OCCUPATION")
	 private String OCCUPATION;

	 @Column(name = "COMPANY_NAME")
	 private String COMPANY_NAME;

	 @Column(name = "DATE_OF_BIRTH")
	 private String DATE_OF_BIRTH;

	 @Column(name = "SALUTATION")
	 private String SALUTATION;

	 @Column(name = "PROPOSER_PAN")
	 private String PROPOSER_PAN;

	 @Column(name = "PROPOSER_CKYC_NO")
	 private String PROPOSER_CKYC_NO;

	 @Column(name = "ADDRESS1")
	 private String ADDRESS1;

	 @Column(name = "ADDRESS2")
	 private String ADDRESS2;

	 @Column(name = "ADDRESS3")
	 private String ADDRESS3;

	 @Column(name = "PINCODE")
	 private String PINCODE;

	 @Column(name = "TELEPHONE_NO")
	 private String TELEPHONE_NO;

	 @Column(name = "MOBILE_NO")
	 private String MOBILE_NO;

	 @Column(name = "WHATSAPP_NO")
	 private String WHATSAPP_NO;

	 @Column(name = "EMAIL")
	 private String EMAIL;

	 @Column(name = "EMAIL1")
	 private String EMAIL1;

	 @Column(name = "COL_BANK_BRANCH")
	 private String COL_BANK_BRANCH;

	 @Column(name = "COL_BANK_NAME")
	 private String COL_BANK_NAME;

	 @Column(name = "AMOUNT")
	 private String AMOUNT;

	 @Column(name = "COL_TYPE")
	 private String COL_TYPE;

	 @Column(name = "RECIEPT_NUM")
	 private String RECIEPT_NUM;

	 @Column(name = "CD_ACCOUNT_NO")
	 private String CD_ACCOUNT_NO;

	 @Column(name = "SOA_TRANSACTIONID")
	 private String SOA_TRANSACTIONID;

	 @Column(name = "PAYER_TYPE")
	 private String PAYER_TYPE;

	 @Column(name = "CHANNEL_NAME")
	 private String CHANNEL_NAME;

	 @Column(name = "SUB_CHANNEL_NAME")
	 private String SUB_CHANNEL_NAME;

	 @Column(name = "INSTRUMENTNUMBER")
	 private String INSTRUMENTNUMBER;

	 @Column(name = "COL_DATE")
	 private String COL_DATE;

	 @Column(name = "COL_RECIEVED_DATE")
	 private String COL_RECIEVED_DATE;

	 @Column(name = "OEM_PREMIUM_AMOUNT")
	 private String OEM_PREMIUM_AMOUNT;

	 @Column(name = "FINANCIER_NAME")
	 private String FINANCIER_NAME;

	 @Column(name = "FINANCIER_BRANCH")
	 private String FINANCIER_BRANCH;

	 @Column(name = "FINANCIER_AGGREMENT_TYPE")
	 private String FINANCIER_AGGREMENT_TYPE;

	 @Column(name = "FINANCER_LOAN_ACC_NO")
	 private String FINANCER_LOAN_ACC_NO;

	 @Column(name = "PREV_INSURANCE_COMPANY_ADDRESS")
	 private String PREV_INSURANCE_COMPANY_ADDRESS;

	 @Column(name = "CLAIM1_YEAR")
	 private String CLAIM1_YEAR;

	 @Column(name = "CLAIM1_LOSS_DATE")
	 private String CLAIM1_LOSS_DATE;

	 @Column(name = "CLAIM1_AMOUNT")
	 private String CLAIM1_AMOUNT;

	 @Column(name = "CLAIM1_TYPE")
	 private String CLAIM1_TYPE;

	 @Column(name = "DATE_OF_INCORPORATION")
	 private String DATE_OF_INCORPORATION;

	 @Column(name = "GSTN_NUMBER")
	 private String GSTN_NUMBER;

	 @Column(name = "GSTN_STATE_CODE")
	 private String GSTN_STATE_CODE;

	 @Column(name = "MISC_1")
	 private String MISC_1;

	 @Column(name = "MISC_2")
	 private String MISC_2;

	 @Column(name = "MISC_3")
	 private String MISC_3;

	 @Column(name = "MISC_4")
	 private String MISC_4;

	 @Column(name = "MISC_5")
	 private String MISC_5;

	 @Column(name = "MISC_6")
	 private String MISC_6;

	 @Column(name = "MISC_7")
	 private String MISC_7;

	 @Column(name = "MISC_8")
	 private String MISC_8;

	 @Column(name = "MISC_9")
	 private String MISC_9;

	 @Column(name = "MISC_10")
	 private String MISC_10;

	 
	 
	
	public String getPRODUCT_CODE() {
		return PRODUCT_CODE;
	}
	public void setPRODUCT_CODE(String pRODUCT_CODE) {
		PRODUCT_CODE = pRODUCT_CODE;
	}
	public String getPOLICY_HOLDER() {
		return POLICY_HOLDER;
	}
	public void setPOLICY_HOLDER(String pOLICY_HOLDER) {
		POLICY_HOLDER = pOLICY_HOLDER;
	}
	public String getIS_CKYC_VERIFIED() {
		return IS_CKYC_VERIFIED;
	}
	public void setIS_CKYC_VERIFIED(String iS_CKYC_VERIFIED) {
		IS_CKYC_VERIFIED = iS_CKYC_VERIFIED;
	}
	public String getCKYC_NUMBER() {
		return CKYC_NUMBER;
	}
	public void setCKYC_NUMBER(String cKYC_NUMBER) {
		CKYC_NUMBER = cKYC_NUMBER;
	}
	public String getCKYC_DOCUMENT_UPLOAD() {
		return CKYC_DOCUMENT_UPLOAD;
	}
	public void setCKYC_DOCUMENT_UPLOAD(String cKYC_DOCUMENT_UPLOAD) {
		CKYC_DOCUMENT_UPLOAD = cKYC_DOCUMENT_UPLOAD;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getCKYC_UNIQUE_IDENTIFIER() {
		return CKYC_UNIQUE_IDENTIFIER;
	}
	public void setCKYC_UNIQUE_IDENTIFIER(String cKYC_UNIQUE_IDENTIFIER) {
		CKYC_UNIQUE_IDENTIFIER = cKYC_UNIQUE_IDENTIFIER;
	}
	public String getCKYC_REMARKS() {
		return CKYC_REMARKS;
	}
	public void setCKYC_REMARKS(String cKYC_REMARKS) {
		CKYC_REMARKS = cKYC_REMARKS;
	}
	public String getPOLICY_HOLDER_NAME() {
		return POLICY_HOLDER_NAME;
	}
	public void setPOLICY_HOLDER_NAME(String pOLICY_HOLDER_NAME) {
		POLICY_HOLDER_NAME = pOLICY_HOLDER_NAME;
	}
	public String getVEHICLE_TYPE() {
		return VEHICLE_TYPE;
	}
	public void setVEHICLE_TYPE(String vEHICLE_TYPE) {
		VEHICLE_TYPE = vEHICLE_TYPE;
	}
	public String getBUSINESS_TYPE() {
		return BUSINESS_TYPE;
	}
	public void setBUSINESS_TYPE(String bUSINESS_TYPE) {
		BUSINESS_TYPE = bUSINESS_TYPE;
	}
	public String getCOMMERCIAL_TYPE() {
		return COMMERCIAL_TYPE;
	}
	public void setCOMMERCIAL_TYPE(String cOMMERCIAL_TYPE) {
		COMMERCIAL_TYPE = cOMMERCIAL_TYPE;
	}
	public String getPOLICY_TYPE() {
		return POLICY_TYPE;
	}
	public void setPOLICY_TYPE(String pOLICY_TYPE) {
		POLICY_TYPE = pOLICY_TYPE;
	}
	public String getPOLICY_PLAN() {
		return POLICY_PLAN;
	}
	public void setPOLICY_PLAN(String pOLICY_PLAN) {
		POLICY_PLAN = pOLICY_PLAN;
	}
	public String getPOLICY_TENURE() {
		return POLICY_TENURE;
	}
	public void setPOLICY_TENURE(String pOLICY_TENURE) {
		POLICY_TENURE = pOLICY_TENURE;
	}
	public String getENTRY_DATE() {
		return ENTRY_DATE;
	}
	public void setENTRY_DATE(String eNTRY_DATE) {
		ENTRY_DATE = eNTRY_DATE;
	}
	public String getENTRY_TIME() {
		return ENTRY_TIME;
	}
	public void setENTRY_TIME(String eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}
	public String getPOLICY_INCEPTION_DATE() {
		return POLICY_INCEPTION_DATE;
	}
	public void setPOLICY_INCEPTION_DATE(String pOLICY_INCEPTION_DATE) {
		POLICY_INCEPTION_DATE = pOLICY_INCEPTION_DATE;
	}
	public String getPOLICY_INCEPTION_TIME() {
		return POLICY_INCEPTION_TIME;
	}
	public void setPOLICY_INCEPTION_TIME(String pOLICY_INCEPTION_TIME) {
		POLICY_INCEPTION_TIME = pOLICY_INCEPTION_TIME;
	}
	public String getPOLICY_DURATION() {
		return POLICY_DURATION;
	}
	public void setPOLICY_DURATION(String pOLICY_DURATION) {
		POLICY_DURATION = pOLICY_DURATION;
	}
	public String getTERM_UNIT() {
		return TERM_UNIT;
	}
	public void setTERM_UNIT(String tERM_UNIT) {
		TERM_UNIT = tERM_UNIT;
	}
	public String getPOLICY_EXPIRY_DATE() {
		return POLICY_EXPIRY_DATE;
	}
	public void setPOLICY_EXPIRY_DATE(String pOLICY_EXPIRY_DATE) {
		POLICY_EXPIRY_DATE = pOLICY_EXPIRY_DATE;
	}
	public String getPOLICY_EXPIRY_TIME() {
		return POLICY_EXPIRY_TIME;
	}
	public void setPOLICY_EXPIRY_TIME(String pOLICY_EXPIRY_TIME) {
		POLICY_EXPIRY_TIME = pOLICY_EXPIRY_TIME;
	}
	public String getODRED() {
		return ODRED;
	}
	public void setODRED(String oDRED) {
		ODRED = oDRED;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getBRANCH_CODE() {
		return BRANCH_CODE;
	}
	public void setBRANCH_CODE(String bRANCH_CODE) {
		BRANCH_CODE = bRANCH_CODE;
	}
	public String getUSER_BRANCH_NAME() {
		return USER_BRANCH_NAME;
	}
	public void setUSER_BRANCH_NAME(String uSER_BRANCH_NAME) {
		USER_BRANCH_NAME = uSER_BRANCH_NAME;
	}
	public String getHEAD_OFFICE() {
		return HEAD_OFFICE;
	}
	public void setHEAD_OFFICE(String hEAD_OFFICE) {
		HEAD_OFFICE = hEAD_OFFICE;
	}
	public String getEXEMPTION_CATEGORY() {
		return EXEMPTION_CATEGORY;
	}
	public void setEXEMPTION_CATEGORY(String eXEMPTION_CATEGORY) {
		EXEMPTION_CATEGORY = eXEMPTION_CATEGORY;
	}
	public String getISSUANCE_SOURCE() {
		return ISSUANCE_SOURCE;
	}
	public void setISSUANCE_SOURCE(String iSSUANCE_SOURCE) {
		ISSUANCE_SOURCE = iSSUANCE_SOURCE;
	}
	public String getOPTION_FOR_CALCULATION() {
		return OPTION_FOR_CALCULATION;
	}
	public void setOPTION_FOR_CALCULATION(String oPTION_FOR_CALCULATION) {
		OPTION_FOR_CALCULATION = oPTION_FOR_CALCULATION;
	}
	public String getSECTOR() {
		return SECTOR;
	}
	public void setSECTOR(String sECTOR) {
		SECTOR = sECTOR;
	}
	public String getCO_INSURANCE_APPLICABLE() {
		return CO_INSURANCE_APPLICABLE;
	}
	public void setCO_INSURANCE_APPLICABLE(String cO_INSURANCE_APPLICABLE) {
		CO_INSURANCE_APPLICABLE = cO_INSURANCE_APPLICABLE;
	}
	public String getOEM_POLICY_NUMBER() {
		return OEM_POLICY_NUMBER;
	}
	public void setOEM_POLICY_NUMBER(String oEM_POLICY_NUMBER) {
		OEM_POLICY_NUMBER = oEM_POLICY_NUMBER;
	}
	public String getINWARD_NUMBER() {
		return INWARD_NUMBER;
	}
	public void setINWARD_NUMBER(String iNWARD_NUMBER) {
		INWARD_NUMBER = iNWARD_NUMBER;
	}
	public String getPOLICY_ISSUED_DATE() {
		return POLICY_ISSUED_DATE;
	}
	public void setPOLICY_ISSUED_DATE(String pOLICY_ISSUED_DATE) {
		POLICY_ISSUED_DATE = pOLICY_ISSUED_DATE;
	}
	public String getRENEWAL_APPLICABLE() {
		return RENEWAL_APPLICABLE;
	}
	public void setRENEWAL_APPLICABLE(String rENEWAL_APPLICABLE) {
		RENEWAL_APPLICABLE = rENEWAL_APPLICABLE;
	}
	public String getGO_GREEN() {
		return GO_GREEN;
	}
	public void setGO_GREEN(String gO_GREEN) {
		GO_GREEN = gO_GREEN;
	}
	public String getPROPOSAL_IDENTIFICATION_NUMBER() {
		return PROPOSAL_IDENTIFICATION_NUMBER;
	}
	public void setPROPOSAL_IDENTIFICATION_NUMBER(String pROPOSAL_IDENTIFICATION_NUMBER) {
		PROPOSAL_IDENTIFICATION_NUMBER = pROPOSAL_IDENTIFICATION_NUMBER;
	}
	public String getPREVIOUS_POLICY_AVAILABLE() {
		return PREVIOUS_POLICY_AVAILABLE;
	}
	public void setPREVIOUS_POLICY_AVAILABLE(String pREVIOUS_POLICY_AVAILABLE) {
		PREVIOUS_POLICY_AVAILABLE = pREVIOUS_POLICY_AVAILABLE;
	}
	public String getPREVIOUS_POLICY_NUMBER() {
		return PREVIOUS_POLICY_NUMBER;
	}
	public void setPREVIOUS_POLICY_NUMBER(String pREVIOUS_POLICY_NUMBER) {
		PREVIOUS_POLICY_NUMBER = pREVIOUS_POLICY_NUMBER;
	}
	public String getPREV_INSURANCE_COMPANY_NAME() {
		return PREV_INSURANCE_COMPANY_NAME;
	}
	public void setPREV_INSURANCE_COMPANY_NAME(String pREV_INSURANCE_COMPANY_NAME) {
		PREV_INSURANCE_COMPANY_NAME = pREV_INSURANCE_COMPANY_NAME;
	}
	public String getPREVIOUS_POLICY_INCEPTION_DATE() {
		return PREVIOUS_POLICY_INCEPTION_DATE;
	}
	public void setPREVIOUS_POLICY_INCEPTION_DATE(String pREVIOUS_POLICY_INCEPTION_DATE) {
		PREVIOUS_POLICY_INCEPTION_DATE = pREVIOUS_POLICY_INCEPTION_DATE;
	}
	public String getPREVIOUS_POLICY_EXPIRY_DATE() {
		return PREVIOUS_POLICY_EXPIRY_DATE;
	}
	public void setPREVIOUS_POLICY_EXPIRY_DATE(String pREVIOUS_POLICY_EXPIRY_DATE) {
		PREVIOUS_POLICY_EXPIRY_DATE = pREVIOUS_POLICY_EXPIRY_DATE;
	}
	public String getPREVIOUS_POLICY_TERM() {
		return PREVIOUS_POLICY_TERM;
	}
	public void setPREVIOUS_POLICY_TERM(String pREVIOUS_POLICY_TERM) {
		PREVIOUS_POLICY_TERM = pREVIOUS_POLICY_TERM;
	}
	public String getPREVIOUS_POLICY_TYPE() {
		return PREVIOUS_POLICY_TYPE;
	}
	public void setPREVIOUS_POLICY_TYPE(String pREVIOUS_POLICY_TYPE) {
		PREVIOUS_POLICY_TYPE = pREVIOUS_POLICY_TYPE;
	}
	public String getCLAIM_APPLICABLE() {
		return CLAIM_APPLICABLE;
	}
	public void setCLAIM_APPLICABLE(String cLAIM_APPLICABLE) {
		CLAIM_APPLICABLE = cLAIM_APPLICABLE;
	}
	public String getNUMBER_OF_CLAIM_ON_PREV_POLICY() {
		return NUMBER_OF_CLAIM_ON_PREV_POLICY;
	}
	public void setNUMBER_OF_CLAIM_ON_PREV_POLICY(String nUMBER_OF_CLAIM_ON_PREV_POLICY) {
		NUMBER_OF_CLAIM_ON_PREV_POLICY = nUMBER_OF_CLAIM_ON_PREV_POLICY;
	}
	public String getLEAD_NUMBER() {
		return LEAD_NUMBER;
	}
	public void setLEAD_NUMBER(String lEAD_NUMBER) {
		LEAD_NUMBER = lEAD_NUMBER;
	}
	public String getPREVIOUS_COMPANY_EMAIL_ID() {
		return PREVIOUS_COMPANY_EMAIL_ID;
	}
	public void setPREVIOUS_COMPANY_EMAIL_ID(String pREVIOUS_COMPANY_EMAIL_ID) {
		PREVIOUS_COMPANY_EMAIL_ID = pREVIOUS_COMPANY_EMAIL_ID;
	}
	public String getPROPOSAL_IS_BREAK_IN() {
		return PROPOSAL_IS_BREAK_IN;
	}
	public void setPROPOSAL_IS_BREAK_IN(String pROPOSAL_IS_BREAK_IN) {
		PROPOSAL_IS_BREAK_IN = pROPOSAL_IS_BREAK_IN;
	}
	public String getREINSTATE_REQUIRED() {
		return REINSTATE_REQUIRED;
	}
	public void setREINSTATE_REQUIRED(String rEINSTATE_REQUIRED) {
		REINSTATE_REQUIRED = rEINSTATE_REQUIRED;
	}
	public String getRENEWAL_NOTICE_TO_BE_GENERATED() {
		return RENEWAL_NOTICE_TO_BE_GENERATED;
	}
	public void setRENEWAL_NOTICE_TO_BE_GENERATED(String rENEWAL_NOTICE_TO_BE_GENERATED) {
		RENEWAL_NOTICE_TO_BE_GENERATED = rENEWAL_NOTICE_TO_BE_GENERATED;
	}
	public String getRENEWAL_STATUS() {
		return RENEWAL_STATUS;
	}
	public void setRENEWAL_STATUS(String rENEWAL_STATUS) {
		RENEWAL_STATUS = rENEWAL_STATUS;
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
	public void setSUB_CHANNEL_2(String sUB_CHANNEL2) {
		SUB_CHANNEL2 = sUB_CHANNEL2;
	}
	public String getAGREEMENT_CODE() {
		return AGREEMENT_CODE;
	}
	public void setAGREEMENT_CODE(String aGREEMENT_CODE) {
		AGREEMENT_CODE = aGREEMENT_CODE;
	}
	public String getIS_CUST_ID_SAME_PAYER_ID() {
		return IS_CUST_ID_SAME_PAYER_ID;
	}
	public void setIS_CUST_ID_SAME_PAYER_ID(String iS_CUST_ID_SAME_PAYER_ID) {
		IS_CUST_ID_SAME_PAYER_ID = iS_CUST_ID_SAME_PAYER_ID;
	}
	public String getACTIVE_TP_POLICY_NUMBER() {
		return ACTIVE_TP_POLICY_NUMBER;
	}
	public void setACTIVE_TP_POLICY_NUMBER(String aCTIVE_TP_POLICY_NUMBER) {
		ACTIVE_TP_POLICY_NUMBER = aCTIVE_TP_POLICY_NUMBER;
	}
	public String getACTIVE_TP_INS_COMPANY_NAME() {
		return ACTIVE_TP_INS_COMPANY_NAME;
	}
	public void setACTIVE_TP_INS_COMPANY_NAME(String aCTIVE_TP_INS_COMPANY_NAME) {
		ACTIVE_TP_INS_COMPANY_NAME = aCTIVE_TP_INS_COMPANY_NAME;
	}
	public String getACTIVE_TP_BRANCH_ADDRESS() {
		return ACTIVE_TP_BRANCH_ADDRESS;
	}
	public void setACTIVE_TP_BRANCH_ADDRESS(String aCTIVE_TP_BRANCH_ADDRESS) {
		ACTIVE_TP_BRANCH_ADDRESS = aCTIVE_TP_BRANCH_ADDRESS;
	}
	public String getACTIVE_TP_POLICY_INCEPT_DATE() {
		return ACTIVE_TP_POLICY_INCEPT_DATE;
	}
	public void setACTIVE_TP_POLICY_INCEPT_DATE(String aCTIVE_TP_POLICY_INCEPT_DATE) {
		 ACTIVE_TP_POLICY_INCEPT_DATE = aCTIVE_TP_POLICY_INCEPT_DATE;
	}
	public String getACTIVE_TP_POLICY_EXPIRY_DATE() {
		return ACTIVE_TP_POLICY_EXPIRY_DATE;
	}
	public void setACTIVE_TP_POLICY_EXPIRY_DATE(String aCTIVE_TP_POLICY_EXPIRY_DATE) {
		ACTIVE_TP_POLICY_EXPIRY_DATE = aCTIVE_TP_POLICY_EXPIRY_DATE;
	}
	public String getACTIVE_TP_POLICY_TERM() {
		return ACTIVE_TP_POLICY_TERM;
	}
	public void setACTIVE_TP_POLICY_TERM(String aCTIVE_TP_POLICY_TERM) {
		ACTIVE_TP_POLICY_TERM = aCTIVE_TP_POLICY_TERM;
	}
	public String getMISC_VEHICLE_SUB_TYPE() {
		return MISC_VEHICLE_SUB_TYPE;
	}
	public void setMISC_VEHICLE_SUB_TYPE(String mISC_VEHICLE_SUB_TYPE) {
		MISC_VEHICLE_SUB_TYPE = mISC_VEHICLE_SUB_TYPE;
	}
	public String getCOMPUTATION_TYPE() {
		return COMPUTATION_TYPE;
	}
	public void setCOMPUTATION_TYPE(String cOMPUTATION_TYPE) {
		COMPUTATION_TYPE = cOMPUTATION_TYPE;
	}
	public String getINSPECTION_WAIVER() {
		return INSPECTION_WAIVER;
	}
	public void setINSPECTION_WAIVER(String iNSPECTION_WAIVER) {
		INSPECTION_WAIVER = iNSPECTION_WAIVER;
	}
	public String getPIN_NUMBER() {
		return PIN_NUMBER;
	}
	public void setPIN_NUMBER(String pIN_NUMBER) {
		PIN_NUMBER = pIN_NUMBER;
	}
	public String getVEHICLE_INSPECTION_STATUS() {
		return VEHICLE_INSPECTION_STATUS;
	}
	public void setVEHICLE_INSPECTION_STATUS(String vEHICLE_INSPECTION_STATUS) {
		VEHICLE_INSPECTION_STATUS = vEHICLE_INSPECTION_STATUS;
	}
	public String getINSPECTION_DATE() {
		return INSPECTION_DATE;
	}
	public void setINSPECTION_DATE(String iNSPECTION_DATE) {
		INSPECTION_DATE = iNSPECTION_DATE;
	}
	public String getINSPECTION_AGENCY_NAME() {
		return INSPECTION_AGENCY_NAME;
	}
	public void setINSPECTION_AGENCY_NAME(String iNSPECTION_AGENCY_NAME) {
		INSPECTION_AGENCY_NAME = iNSPECTION_AGENCY_NAME;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getINSPECTION_REASON() {
		return INSPECTION_REASON;
	}
	public void setINSPECTION_REASON(String iNSPECTION_REASON) {
		INSPECTION_REASON = iNSPECTION_REASON;
	}
	public String getNCB_DISCOUNT_AMOUNT() {
		return NCB_DISCOUNT_AMOUNT;
	}
	public void setNCB_DISCOUNT_AMOUNT(String nCB_DISCOUNT_AMOUNT) {
		NCB_DISCOUNT_AMOUNT = nCB_DISCOUNT_AMOUNT;
	}
	public String getARE_YOU_ENTITLED_TO_NCB() {
		return ARE_YOU_ENTITLED_TO_NCB;
	}
	public void setARE_YOU_ENTITLED_TO_NCB(String aRE_YOU_ENTITLED_TO_NCB) {
		ARE_YOU_ENTITLED_TO_NCB = aRE_YOU_ENTITLED_TO_NCB;
	}
	public String getHAS_ANY_INSURANCE_COMPANY_EVER() {
		return HAS_ANY_INSURANCE_COMPANY_EVER;
	}
	public void setHAS_ANY_INSURANCE_COMPANY_EVER(String hAS_ANY_INSURANCE_COMPANY_EVER) {
		HAS_ANY_INSURANCE_COMPANY_EVER = hAS_ANY_INSURANCE_COMPANY_EVER;
	}
	public String getDOES_DRIVER_SUFFER_DEFECTIVE() {
		return DOES_DRIVER_SUFFER_DEFECTIVE;
	}
	public void setDOES_DRIVER_SUFFER_DEFECTIVE(String dOES_DRIVER_SUFFER_DEFECTIVE) {
		DOES_DRIVER_SUFFER_DEFECTIVE = dOES_DRIVER_SUFFER_DEFECTIVE;
	}
	public String getDRIVER_BEEN_INVOL_CONVICTED() {
		return DRIVER_BEEN_INVOL_CONVICTED;
	}
	public void setDRIVER_BEEN_INVOL_CONVICTED(String dRIVER_BEEN_INVOL_CONVICTED) {
		DRIVER_BEEN_INVOL_CONVICTED = dRIVER_BEEN_INVOL_CONVICTED;
	}
	public String getIS_VEHICLE_IN_GOOD_CONDITION() {
		return IS_VEHICLE_IN_GOOD_CONDITION;
	}
	public void setIS_VEHICLE_IN_GOOD_CONDITION(String iS_VEHICLE_IN_GOOD_CONDITION) {
		IS_VEHICLE_IN_GOOD_CONDITION = iS_VEHICLE_IN_GOOD_CONDITION;
	}
	public String getROAD_TYPE() {
		return ROAD_TYPE;
	}
	public void setROAD_TYPE(String rOAD_TYPE) {
		ROAD_TYPE = rOAD_TYPE;
	}
	public String getUSE_OF_VEHICLE() {
		return USE_OF_VEHICLE;
	}
	public void setUSE_OF_VEHICLE(String uSE_OF_VEHICLE) {
		USE_OF_VEHICLE = uSE_OF_VEHICLE;
	}
	public String getAVERAGE_DAILY_USE_OF_VEHICLE() {
		return AVERAGE_DAILY_USE_OF_VEHICLE;
	}
	public void setAVERAGE_DAILY_USE_OF_VEHICLE(String aVERAGE_DAILY_USE_OF_VEHICLE) {
		AVERAGE_DAILY_USE_OF_VEHICLE = aVERAGE_DAILY_USE_OF_VEHICLE;
	}
	public String getLOCATION_FOR_PARK_DURING_DAY() {
		return LOCATION_FOR_PARK_DURING_DAY;
	}
	public void setLOCATION_FOR_PARK_DURING_DAY(String lOCATION_FOR_PARK_DURING_DAY) {
		LOCATION_FOR_PARK_DURING_DAY = lOCATION_FOR_PARK_DURING_DAY;
	}
	public String getLOCATION_FOR_PARK_DURING_NIGHT() {
		return LOCATION_FOR_PARK_DURING_NIGHT;
	}
	public void setLOCATION_FOR_PARK_DURING_NIGHT(String lOCATION_FOR_PARK_DURING_NIGHT) {
		LOCATION_FOR_PARK_DURING_NIGHT = lOCATION_FOR_PARK_DURING_NIGHT;
	}
	public String getDRIVING_EXPERIENCE_IN_YEARS() {
		return DRIVING_EXPERIENCE_IN_YEARS;
	}
	public void setDRIVING_EXPERIENCE_IN_YEARS(String dRIVING_EXPERIENCE_IN_YEARS) {
		DRIVING_EXPERIENCE_IN_YEARS = dRIVING_EXPERIENCE_IN_YEARS;
	}
	public String getAGE_OF_DRIVER() {
		return AGE_OF_THE_DRIVER;
	}
	public void setAGE_OF_DRIVER(String aGE_OF_THE_DRIVER) {
		AGE_OF_THE_DRIVER = aGE_OF_THE_DRIVER;
	}
	public String getTYRE_SERIAL_NUMBER() {
		return TYRE_SERIAL_NUMBER;
	}
	public void setTYRE_SERIAL_NUMBER(String tYRE_SERIAL_NUMBER) {
		TYRE_SERIAL_NUMBER = tYRE_SERIAL_NUMBER;
	}

	public String getNCB_ON_PREVIOUS_POLICY() {
		return NCB_ON_PREVIOUS_POLICY;
	}
	public void setNCB_ON_PREVIOUS_POLICY(String nCB_ON_PREVIOUS_POLICY) {
		NCB_ON_PREVIOUS_POLICY = nCB_ON_PREVIOUS_POLICY;
	}
	public String getPROOF_PROVIDED_FOR_NCB() {
		return PROOF_PROVIDED_FOR_NCB;
	}
	public void setPROOF_PROVIDED_FOR_NCB(String pROOF_PROVIDED_FOR_NCB) {
		PROOF_PROVIDED_FOR_NCB = pROOF_PROVIDED_FOR_NCB;
	}
	public String getAPPLICABLE_NCB_PERCENT() {
		return APPLICABLE_NCB_PERCENT;
	}
	public void setAPPLICABLE_NCB_PERCENT(String aPPLICABLE_NCB_PERCENT) {
		APPLICABLE_NCB_PERCENT = aPPLICABLE_NCB_PERCENT;
	}
	public String getNCB_STATUS() {
		return NCB_STATUS;
	}
	public void setNCB_STATUS(String nCB_STATUS) {
		NCB_STATUS = nCB_STATUS;
	}
	public String getNCB_RECOVERY_REASON() {
		return NCB_RECOVERY_REASON;
	}
	public void setNCB_RECOVERY_REASON(String nCB_RECOVERY_REASON) {
		NCB_RECOVERY_REASON = nCB_RECOVERY_REASON;
	}
	public String getREGISTRATION_NUMBER() {
		return REGISTRATION_NUMBER;
	}
	public void setREGISTRATION_NUMBER(String rEGISTRATION_NUMBER) {
		REGISTRATION_NUMBER = rEGISTRATION_NUMBER;
	}
	public String getREGISTRATION_NUMBER_FORMAT() {
		return REGISTRATION_NUMBER_FORMAT;
	}
	public void setREGISTRATION_NUMBER_FORMAT(String rEGISTRATION_NUMBER_FORMAT) {
		REGISTRATION_NUMBER_FORMAT = rEGISTRATION_NUMBER_FORMAT;
	}
	public String getREGISTRATION_NO_BOX_1() {
		return REGISTRATION_NO_BOX_1;
	}
	public void setREGISTRATION_NO_BOX_1(String rEGISTRATION_NO_BOX_1) {
		REGISTRATION_NO_BOX_1 = rEGISTRATION_NO_BOX_1;
	}
	public String getREGISTRATION_NO_BOX_2() {
		return REGISTRATION_NO_BOX_2;
	}
	public void setREGISTRATION_NO_BOX_2(String rEGISTRATION_NO_BOX_2) {
		REGISTRATION_NO_BOX_2 = rEGISTRATION_NO_BOX_2;
	}
	public String getREGISTRATION_NO_BOX_3() {
		return REGISTRATION_NO_BOX_3;
	}
	public void setREGISTRATION_NO_BOX_3(String rEGISTRATION_NO_BOX_3) {
		REGISTRATION_NO_BOX_3 = rEGISTRATION_NO_BOX_3;
	}
	public String getREGISTRATION_NO_BOX_4() {
		return REGISTRATION_NO_BOX_4;
	}
	public void setREGISTRATION_NO_BOX_4(String rEGISTRATION_NO_BOX_4) {
		REGISTRATION_NO_BOX_4 = rEGISTRATION_NO_BOX_4;
	}
	public String getENGINE_NUMBER() {
		return ENGINE_NUMBER;
	}
	public void setENGINE_NUMBER(String eNGINE_NUMBER) {
		ENGINE_NUMBER = eNGINE_NUMBER;
	}
	public String getCHASIS_NUMBER() {
		return CHASIS_NUMBER;
	}
	public void setCHASIS_NUMBER(String cHASIS_NUMBER) {
		CHASIS_NUMBER = cHASIS_NUMBER;
	}
	public String getMODEL_YEAR() {
		return MODEL_YEAR;
	}
	public void setMODEL_YEAR(String mODEL_YEAR) {
		MODEL_YEAR = mODEL_YEAR;
	}
	public String getVEHICLE_MAKE() {
		return VEHICLE_MAKE;
	}
	public void setVEHICLE_MAKE(String vEHICLE_MAKE) {
		VEHICLE_MAKE = vEHICLE_MAKE;
	}
	public String getVEHICLE_MODEL() {
		return VEHICLE_MODEL;
	}
	public void setVEHICLE_MODEL(String vEHICLE_MODEL) {
		VEHICLE_MODEL = vEHICLE_MODEL;
	}
	public String getVEHICLE_SPECIFICATION() {
		return VEHICLE_SPECIFICATION;
	}
	public void setVEHICLE_SPECIFICATION(String vEHICLE_SPECIFICATION) {
		VEHICLE_SPECIFICATION = vEHICLE_SPECIFICATION;
	}
	public String getTYPE_OF_FUEL() {
		return TYPE_OF_FUEL;
	}
	public void setTYPE_OF_FUEL(String tYPE_OF_FUEL) {
		TYPE_OF_FUEL = tYPE_OF_FUEL;
	}
	public String getDATE_OF_REGISTRATION() {
		return DATE_OF_REGISTRATION;
	}
	public void setDATE_OF_REGISTRATION(String dATE_OF_REGISTRATION) {
		DATE_OF_REGISTRATION = dATE_OF_REGISTRATION;
	}
	public String getTYPE_OF_MODIFICATION() {
		return TYPE_OF_MODIFICATION;
	}
	public void setTYPE_OF_MODIFICATION(String tYPE_OF_MODIFICATION) {
		TYPE_OF_MODIFICATION = tYPE_OF_MODIFICATION;
	}
	public String getRTA_CODE() {
		return RTA_CODE;
	}
	public void setRTA_CODE(String rTA_CODE) {
		RTA_CODE = rTA_CODE;
	}
	public String getINCONVENIENCE_ALLOWANCE() {
		return INCONVENIENCE_ALLOWANCE;
	}
	public void setINCONVENIENCE_ALLOWANCE(String iNCONVENIENCE_ALLOWANCE) {
		INCONVENIENCE_ALLOWANCE = iNCONVENIENCE_ALLOWANCE;
	}
	public String getEMI_PROTECTOR() {
		return EMI_PROTECTOR;
	}
	public void setEMI_PROTECTOR(String eMI_PROTECTOR) {
		EMI_PROTECTOR = eMI_PROTECTOR;
	}
	public String getEMI_AMOUNT() {
		return EMI_AMOUNT;
	}
	public void setEMI_AMOUNT(String eMI_AMOUNT) {
		EMI_AMOUNT = eMI_AMOUNT;
	}
	public String getEMI_DEDUCTIBLE_AMOUNT() {
		return EMI_DEDUCTIBLE_AMOUNT;
	}
	public void setEMI_DEDUCTIBLE_AMOUNT(String eMI_DEDUCTIBLE_AMOUNT) {
		EMI_DEDUCTIBLE_AMOUNT = eMI_DEDUCTIBLE_AMOUNT;
	}
	public String getENHANCED_PA_OWNER_DRIVER_SI() {
		return ENHANCED_PA_OWNER_DRIVER_SI;
	}
	public void setENHANCED_PA_OWNER_DRIVER_SI(String eNHANCED_PA_OWNER_DRIVER_SI) {
		ENHANCED_PA_OWNER_DRIVER_SI = eNHANCED_PA_OWNER_DRIVER_SI;
	}
	public String getENHANCED_PA__PAID_DRIVER_SI() {
		return ENHANCED_PA__PAID_DRIVER_SI;
	}
	public void setENHANCED_PA__PAID_DRIVER_SI(String eNHANCED_PA__PAID_DRIVER_SI) {
		ENHANCED_PA__PAID_DRIVER_SI = eNHANCED_PA__PAID_DRIVER_SI;
	}
	public String getENHANCED_PA_UN_NAMED_PASS_SI() {
		return ENHANCED_PA_UN_NAMED_PASS_SI;
	}
	public void setENHANCED_PA_UN_NAMED_PASS_SI(String eNHANCED_PA_UN_NAMED_PASS_SI) {
		ENHANCED_PA_UN_NAMED_PASS_SI = eNHANCED_PA_UN_NAMED_PASS_SI;
	}
	public String getZONE() {
		return ZONE;
	}
	public void setZONE(String zONE) {
		ZONE = zONE;
	}
	public String getEMERGENCY_MEDICAL_EXPENSE() {
		return EMERGENCY_MEDICAL_EXPENSE;
	}
	public void setEMERGENCY_MEDICAL_EXPENSE(String eMERGENCY_MEDICAL_EXPENSE) {
		EMERGENCY_MEDICAL_EXPENSE = eMERGENCY_MEDICAL_EXPENSE;
	}
	public String getPRESENCE_OF_AIRBAGS() {
		return PRESENCE_OF_AIRBAGS;
	}
	public void setPRESENCE_OF_AIRBAGS(String pRESENCE_OF_AIRBAGS) {
		PRESENCE_OF_AIRBAGS = pRESENCE_OF_AIRBAGS;
	}
	public String getTYRE_AND_RIM_GUARD() {
		return TYRE_AND_RIM_GUARD;
	}
	public void setTYRE_AND_RIM_GUARD(String tYRE_AND_RIM_GUARD) {
		TYRE_AND_RIM_GUARD = tYRE_AND_RIM_GUARD;
	}
	public String getTYRE_AND_RIM_GUARD_DED_AMOUNT() {
		return TYRE_AND_RIM_GUARD_DED_AMOUNT;
	}
	public void setTYRE_AND_RIM_GUARD_DED_AMOUNT(String tYRE_AND_RIM_GUARD_DED_AMOUNT) {
		TYRE_AND_RIM_GUARD_DED_AMOUNT = tYRE_AND_RIM_GUARD_DED_AMOUNT;
	}
	public String getHOSPITAL_CASH_UN_NAMED_PASS_SI() {
		return HOSPITAL_CASH_UN_NAMED_PASS_SI;
	}
	public void setHOSPITAL_CASH_UN_NAMED_PASS_SI(String hOSPITAL_CASH_UN_NAMED_PASS_SI) {
		HOSPITAL_CASH_UN_NAMED_PASS_SI = hOSPITAL_CASH_UN_NAMED_PASS_SI;
	}
	public String getHOSPITAL_CASH_PAID_DRIVER_SI() {
		return HOSPITAL_CASH_PAID_DRIVER_SI;
	}
	public void setHOSPITAL_CASH_PAID_DRIVER_SI(String hOSPITAL_CASH_PAID_DRIVER_SI) {
		HOSPITAL_CASH_PAID_DRIVER_SI = hOSPITAL_CASH_PAID_DRIVER_SI;
	}
	public String getHOSPITAL_CASH_OWNER_DRIVER_SI() {
		return HOSPITAL_CASH_OWNER_DRIVER_SI;
	}
	public void setHOSPITAL_CASH_OWNER_DRIVER_SI(String hOSPITAL_CASH_OWNER_DRIVER_SI) {
		HOSPITAL_CASH_OWNER_DRIVER_SI = hOSPITAL_CASH_OWNER_DRIVER_SI;
	}
	public String getDEPRECIATION_REIMBURSEMENT() {
		return DEPRECIATION_REIMBURSEMENT;
	}
	public void setDEPRECIATION_REIMBURSEMENT(String dEPRECIATION_REIMBURSEMENT) {
		DEPRECIATION_REIMBURSEMENT = dEPRECIATION_REIMBURSEMENT;
	}
	public String getRETURN_TO_INVOICE() {
		return RETURN_TO_INVOICE;
	}
	public void setRETURN_TO_INVOICE(String rETURN_TO_INVOICE) {
		RETURN_TO_INVOICE = rETURN_TO_INVOICE;
	}
	public String getCOVER_FOR_CONSUMABLES() {
		return COVER_FOR_CONSUMABLES;
	}
	public void setCOVER_FOR_CONSUMABLES(String cOVER_FOR_CONSUMABLES) {
		COVER_FOR_CONSUMABLES = cOVER_FOR_CONSUMABLES;
	}
	public String getENGINE_GUARD() {
		return ENGINE_GUARD;
	}
	public void setENGINE_GUARD(String eNGINE_GUARD) {
		ENGINE_GUARD = eNGINE_GUARD;
	}
	public String getKEY_REPLACEMENT_COVER() {
		return KEY_REPLACEMENT_COVER;
	}
	public void setKEY_REPLACEMENT_COVER(String kEY_REPLACEMENT_COVER) {
		KEY_REPLACEMENT_COVER = kEY_REPLACEMENT_COVER;
	}
	public String getPROTECTION_OF_NCB() {
		return PROTECTION_OF_NCB;
	}
	public void setPROTECTION_OF_NCB(String pROTECTION_OF_NCB) {
		PROTECTION_OF_NCB = pROTECTION_OF_NCB;
	}
	public String getBASIC_ROAD_SIDE_ASSISTANCE() {
		return BASIC_ROAD_SIDE_ASSISTANCE;
	}
	public void setBASIC_ROAD_SIDE_ASSISTANCE(String bASIC_ROAD_SIDE_ASSISTANCE) {
		BASIC_ROAD_SIDE_ASSISTANCE = bASIC_ROAD_SIDE_ASSISTANCE;
	}
	public String getADDITIONAL_ROADSIDE_ASSISTANCE() {
		return ADDITIONAL_ROADSIDE_ASSISTANCE;
	}
	public void setADDITIONAL_ROADSIDE_ASSISTANCE(String aDDITIONAL_ROADSIDE_ASSISTANCE) {
		ADDITIONAL_ROADSIDE_ASSISTANCE = aDDITIONAL_ROADSIDE_ASSISTANCE;
	}
	public String getLOSS_OF_PERSONAL_BELONGINGS() {
		return LOSS_OF_PERSONAL_BELONGINGS;
	}
	public void setLOSS_OF_PERSONAL_BELONGINGS(String lOSS_OF_PERSONAL_BELONGINGS) {
		LOSS_OF_PERSONAL_BELONGINGS = lOSS_OF_PERSONAL_BELONGINGS;
	}
	public String getLOSS_OF_PERSONAL_BELONGINGS_SI() {
		return LOSS_OF_PERSONAL_BELONGINGS_SI;
	}
	public void setLOSS_OF_PERSONAL_BELONGINGS_SI(String lOSS_OF_PERSONAL_BELONGINGS_SI) {
		LOSS_OF_PERSONAL_BELONGINGS_SI = lOSS_OF_PERSONAL_BELONGINGS_SI;
	}
	public String getRSA_VENDOR_NAME() {
		return RSA_VENDOR_NAME;
	}
	public void setRSA_VENDOR_NAME(String rSA_VENDOR_NAME) {
		RSA_VENDOR_NAME = rSA_VENDOR_NAME;
	}
	public String getCPA_COVER_WAIVER_REQUIRED() {
		return CPA_COVER_WAIVER_REQUIRED;
	}
	public void setCPA_COVER_WAIVER_REQUIRED(String cPA_COVER_WAIVER_REQUIRED) {
		CPA_COVER_WAIVER_REQUIRED = cPA_COVER_WAIVER_REQUIRED;
	}
	public String getREASON_FOR_WAIVER() {
		return REASON_FOR_WAIVER;
	}
	public void setREASON_FOR_WAIVER(String rEASON_FOR_WAIVER) {
		REASON_FOR_WAIVER = rEASON_FOR_WAIVER;
	}
	public String getYEAR_OF_COVERAGE() {
		return YEAR_OF_COVERAGE;
	}
	public void setYEAR_OF_COVERAGE(String yEAR_OF_COVERAGE) {
		YEAR_OF_COVERAGE = yEAR_OF_COVERAGE;
	}
	public String getPARED() {
		return PARED;
	}
	public void setPARED(String pARED) {
		PARED = pARED;
	}
	public String getNOMINEE_NAME() {
		return NOMINEE_NAME;
	}
	public void setNOMINEE_NAME(String nOMINEE_NAME) {
		NOMINEE_NAME = nOMINEE_NAME;
	}
	public String getAGE() {
		return AGE;
	}
	public void setAGE(String aGE) {
		AGE = aGE;
	}
	public String getRELATIONSHIP_WITH_OWNER() {
		return RELATIONSHIP_WITH_OWNER;
	}
	public void setRELATIONSHIP_WITH_OWNER(String rELATIONSHIP_WITH_OWNER) {
		RELATIONSHIP_WITH_OWNER = rELATIONSHIP_WITH_OWNER;
	}
	public String getNAME_OF_APPOINTEE() {
		return NAME_OF_APPOINTEE;
	}
	public void setNAME_OF_APPOINTEE(String nAME_OF_APPOINTEE) {
		NAME_OF_APPOINTEE = nAME_OF_APPOINTEE;
	}
	public String getAPPOINTEE_RELATIONSHIP() {
		return APPOINTEE_RELATIONSHIP;
	}
	public void setAPPOINTEE_RELATIONSHIP(String aPPOINTEE_RELATIONSHIP) {
		APPOINTEE_RELATIONSHIP = aPPOINTEE_RELATIONSHIP;
	}
	public String getRISK_INCEPTION_DATE() {
		return RISK_INCEPTION_DATE;
	}
	public void setRISK_INCEPTION_DATE(String rISK_INCEPTION_DATE) {
		RISK_INCEPTION_DATE = rISK_INCEPTION_DATE;
	}
	public String getRISK_EXPIRY_DATE() {
		return RISK_EXPIRY_DATE;
	}
	public void setRISK_EXPIRY_DATE(String rISK_EXPIRY_DATE) {
		RISK_EXPIRY_DATE = rISK_EXPIRY_DATE;
	}
	public String getRISK_INCEPTION_TIME() {
		return RISK_INCEPTION_TIME;
	}
	public void setRISK_INCEPTION_TIME(String rISK_INCEPTION_TIME) {
		RISK_INCEPTION_TIME = rISK_INCEPTION_TIME;
	}
	public String getRISK_EXPIRY_TIME() {
		return RISK_EXPIRY_TIME;
	}
	public void setRISK_EXPIRY_TIME(String rISK_EXPIRY_TIME) {
		RISK_EXPIRY_TIME = rISK_EXPIRY_TIME;
	}
	public String getVEHICLE_COLOR() {
		return VEHICLE_COLOR;
	}
	public void setVEHICLE_COLOR(String vEHICLE_COLOR) {
		VEHICLE_COLOR = vEHICLE_COLOR;
	}
	public String getVEHICLE_AGE() {
		return VEHICLE_AGE;
	}
	public void setVEHICLE_AGE(String vEHICLE_AGE) {
		VEHICLE_AGE = vEHICLE_AGE;
	}
	public String getVEHICLE_IDV() {
		return VEHICLE_IDV;
	}
	public void setVEHICLE_IDV(String vEHICLE_IDV) {
		VEHICLE_IDV = vEHICLE_IDV;
	}
	public String getORIGINAL_IDV() {
		return ORIGINAL_IDV;
	}
	public void setORIGINAL_IDV(String oRIGINAL_IDV) {
		ORIGINAL_IDV = oRIGINAL_IDV;
	}
	public String getIS_CNGLPG_EXTRA_FITTED() {
		return IS_CNGLPG_EXTRA_FITTED;
	}
	public void setIS_CNGLPG_EXTRA_FITTED(String iS_CNGLPG_EXTRA_FITTED) {
		IS_CNGLPG_EXTRA_FITTED = iS_CNGLPG_EXTRA_FITTED;
	}
	public String getCNGLPG_KIT_IDV() {
		return CNGLPG_KIT_IDV;
	}
	public void setCNGLPG_KIT_IDV(String cNGLPG_KIT_IDV) {
		CNGLPG_KIT_IDV = cNGLPG_KIT_IDV;
	}
	public String getMULTIPLE_ACCESSORIES_PRESENT() {
		return MULTIPLE_ACCESSORIES_PRESENT;
	}
	public void setMULTIPLE_ACCESSORIES_PRESENT(String mULTIPLE_ACCESSORIES_PRESENT) {
		MULTIPLE_ACCESSORIES_PRESENT = mULTIPLE_ACCESSORIES_PRESENT;
	}
	public String getVALUE_OF_EXTRA_ELECTR_ELECTRON() {
		return VALUE_OF_EXTRA_ELECTR_ELECTRON;
	}
	public void setVALUE_OF_EXTRA_ELECTR_ELECTRON(String vALUE_OF_EXTRA_ELECTR_ELECTRON) {
		VALUE_OF_EXTRA_ELECTR_ELECTRON = vALUE_OF_EXTRA_ELECTR_ELECTRON;
	}
	public String getVALUE_OF_EXTRA_NON_ELECTRICAL() {
		return VALUE_OF_EXTRA_NON_ELECTRICAL;
	}
	public void setVALUE_OF_EXTRA_NON_ELECTRICAL(String vALUE_OF_EXTRA_NON_ELECTRICAL) {
		VALUE_OF_EXTRA_NON_ELECTRICAL = vALUE_OF_EXTRA_NON_ELECTRICAL;
	}
	public String getIDV_OF_ACCESSORIES() {
		return IDV_OF_ACCESSORIES;
	}
	public void setIDV_OF_ACCESSORIES(String iDV_OF_ACCESSORIES) {
		IDV_OF_ACCESSORIES = iDV_OF_ACCESSORIES;
	}
	public String getTOTAL_IDV() {
		return TOTAL_IDV;
	}
	public void setTOTAL_IDV(String tOTAL_IDV) {
		TOTAL_IDV = tOTAL_IDV;
	}
	public String getIS_CAR_USED_DEMONSTRATION_PURP() {
		return IS_CAR_USED_DEMONSTRATION_PURP;
	}
	public void setIS_CAR_USED_DEMONSTRATION_PURP(String iS_CAR_USED_DEMONSTRATION_PURP) {
		IS_CAR_USED_DEMONSTRATION_PURP = iS_CAR_USED_DEMONSTRATION_PURP;
	}
	public String getIS_CAR_USED_DRIVING_TUITION_PU() {
		return IS_CAR_USED_DRIVING_TUITION_PU;
	}
	public void setIS_CAR_USED_DRIVING_TUITION_PU(String iS_CAR_USED_DRIVING_TUITION_PU) {
		IS_CAR_USED_DRIVING_TUITION_PU = iS_CAR_USED_DRIVING_TUITION_PU;
	}
	public String getROAD_TAX_AMOUNT() {
		return ROAD_TAX_AMOUNT;
	}
	public void setROAD_TAX_AMOUNT(String rOAD_TAX_AMOUNT) {
		ROAD_TAX_AMOUNT = rOAD_TAX_AMOUNT;
	}
	public String getADDITIONAL_TOWING_CHARGES() {
		return ADDITIONAL_TOWING_CHARGES;
	}
	public void setADDITIONAL_TOWING_CHARGES(String aDDITIONAL_TOWING_CHARGES) {
		ADDITIONAL_TOWING_CHARGES = aDDITIONAL_TOWING_CHARGES;
	}
	public String getEXTENSION_OF_GEOGRAPHICAL_IMT1() {
		return EXTENSION_OF_GEOGRAPHICAL_IMT1;
	}
	public void setEXTENSION_OF_GEOGRAPHICAL_IMT1(String eXTENSION_OF_GEOGRAPHICAL_IMT1) {
		EXTENSION_OF_GEOGRAPHICAL_IMT1 = eXTENSION_OF_GEOGRAPHICAL_IMT1;
	}
	public String getWHETHER_VINTAGE_CAR_IMT2() {
		return WHETHER_VINTAGE_CAR_IMT2;
	}
	public void setWHETHER_VINTAGE_CAR_IMT2(String wHETHER_VINTAGE_CAR_IMT2) {
		WHETHER_VINTAGE_CAR_IMT2 = wHETHER_VINTAGE_CAR_IMT2;
	}
	public String getMEMBER_AUTOMOBILE_ASSO_IMT8() {
		return MEMBER_AUTOMOBILE_ASSO_IMT8;
	}
	public void setMEMBER_AUTOMOBILE_ASSO_IMT8(String mEMBER_AUTOMOBILE_ASSO_IMT8) {
		MEMBER_AUTOMOBILE_ASSO_IMT8 = mEMBER_AUTOMOBILE_ASSO_IMT8;
	}
	public String getNAME_OF_ASSOCIATION() {
		return NAME_OF_ASSOCIATION;
	}
	public void setNAME_OF_ASSOCIATION(String nAME_OF_ASSOCIATION) {
		NAME_OF_ASSOCIATION = nAME_OF_ASSOCIATION;
	}
	public String getMEMBERSHIP_NO() {
		return MEMBERSHIP_NO;
	}
	public void setMEMBERSHIP_NO(String mEMBERSHIP_NO) {
		MEMBERSHIP_NO = mEMBERSHIP_NO;
	}
	public String getIS_LIFE_MEMBER() {
		return IS_LIFE_MEMBER;
	}
	public void setIS_LIFE_MEMBER(String iS_LIFE_MEMBER) {
		IS_LIFE_MEMBER = iS_LIFE_MEMBER;
	}
	public String getDATE_OF_MEMBERSHIP_EXPIRY() {
		return DATE_OF_MEMBERSHIP_EXPIRY;
	}
	public void setDATE_OF_MEMBERSHIP_EXPIRY(String dATE_OF_MEMBERSHIP_EXPIRY) {
		DATE_OF_MEMBERSHIP_EXPIRY = dATE_OF_MEMBERSHIP_EXPIRY;
	}
	public String getVEH_FIT_ANTITHEFT_DEVICE_IMT10() {
		return VEH_FIT_ANTITHEFT_DEVICE_IMT10;
	}
	public void setVEH_FIT_ANTITHEFT_DEVICE_IMT10(String vEH_FIT_ANTITHEFT_DEVICE_IMT10) {
		VEH_FIT_ANTITHEFT_DEVICE_IMT10 = vEH_FIT_ANTITHEFT_DEVICE_IMT10;
	}
	public String getDESIGNED_BLIND_HANDICAP_IMT12() {
		return DESIGNED_BLIND_HANDICAP_IMT12;
	}
	public void setDESIGNED_BLIND_HANDICAP_IMT12(String dESIGNED_BLIND_HANDICAP_IMT12) {
		DESIGNED_BLIND_HANDICAP_IMT12 = dESIGNED_BLIND_HANDICAP_IMT12;
	}
	public String getUSE_LIMIT_TO_OWN_PREMISE_IMT13() {
		return USE_LIMIT_TO_OWN_PREMISE_IMT13;
	}
	public void setUSE_LIMIT_TO_OWN_PREMISE_IMT13(String uSE_LIMIT_TO_OWN_PREMISE_IMT13) {
		USE_LIMIT_TO_OWN_PREMISE_IMT13 = uSE_LIMIT_TO_OWN_PREMISE_IMT13;
	}
	public String getPREMISE_ADDRESS() {
		return PREMISE_ADDRESS;
	}
	public void setPREMISE_ADDRESS(String pREMISE_ADDRESS) {
		PREMISE_ADDRESS = pREMISE_ADDRESS;
	}
	public String getPA_COVER_TO_NAMED_PERSON_IMT15() {
		return PA_COVER_TO_NAMED_PERSON_IMT15;
	}
	public void setPA_COVER_TO_NAMED_PERSON_IMT15(String pA_COVER_TO_NAMED_PERSON_IMT15) {
		PA_COVER_TO_NAMED_PERSON_IMT15 = pA_COVER_TO_NAMED_PERSON_IMT15;
	}
	public String getINDIVIDUAL_SI_FOR_IMT_15() {
		return INDIVIDUAL_SI_FOR_IMT_15;
	}
	public void setINDIVIDUAL_SI_FOR_IMT_15(String iNDIVIDUAL_SI_FOR_IMT_15) {
		INDIVIDUAL_SI_FOR_IMT_15 = iNDIVIDUAL_SI_FOR_IMT_15;
	}
	public String getNUMBER_OF_NAMED_PERSONS() {
		return NUMBER_OF_NAMED_PERSONS;
	}
	public void setNUMBER_OF_NAMED_PERSONS(String nUMBER_OF_NAMED_PERSONS) {
		NUMBER_OF_NAMED_PERSONS = nUMBER_OF_NAMED_PERSONS;
	}
	public String getPA_COVER_UNNAMED_PERSON_IMT16() {
		return PA_COVER_UNNAMED_PERSON_IMT16;
	}
	public void setPA_COVER_UNNAMED_PERSON_IMT16(String pA_COVER_UNNAMED_PERSON_IMT16) {
		PA_COVER_UNNAMED_PERSON_IMT16 = pA_COVER_UNNAMED_PERSON_IMT16;
	}
	public String getNO_OF_UNNAMED_PERSONS() {
		return NO_OF_UNNAMED_PERSONS;
	}
	public void setNO_OF_UNNAMED_PERSONS(String nO_OF_UNNAMED_PERSONS) {
		NO_OF_UNNAMED_PERSONS = nO_OF_UNNAMED_PERSONS;
	}
	public String getINDIVIDUAL_SI_FOR_IMT_16() {
		return INDIVIDUAL_SI_FOR_IMT_16;
	}
	public void setINDIVIDUAL_SI_FOR_IMT_16(String iNDIVIDUAL_SI_FOR_IMT_16) {
		INDIVIDUAL_SI_FOR_IMT_16 = iNDIVIDUAL_SI_FOR_IMT_16;
	}
	public String getPA_COVER_TO_PAID_DRIVERS_IMT17() {
		return PA_COVER_TO_PAID_DRIVERS_IMT17;
	}
	public void setPA_COVER_TO_PAID_DRIVERS_IMT17(String pA_COVER_TO_PAID_DRIVERS_IMT17) {
		PA_COVER_TO_PAID_DRIVERS_IMT17 = pA_COVER_TO_PAID_DRIVERS_IMT17;
	}
	public String getNO_OF_PAID_DRIVER_CLEA_CONDUCT() {
		return NO_OF_PAID_DRIVER_CLEA_CONDUCT;
	}
	public void setNO_OF_PAID_DRIVER_CLEA_CONDUCT(String nO_OF_PAID_DRIVER_CLEA_CONDUCT) {
		NO_OF_PAID_DRIVER_CLEA_CONDUCT = nO_OF_PAID_DRIVER_CLEA_CONDUCT;
	}
	public String getINDIVIDUAL_SI() {
		return INDIVIDUAL_SI;
	}
	public void setINDIVIDUAL_SI(String iNDIVIDUAL_SI) {
		INDIVIDUAL_SI = iNDIVIDUAL_SI;
	}
	public String getIMPORTED_WITHOUT_CUSTOM_IMT19() {
		return IMPORTED_WITHOUT_CUSTOM_IMT19;
	}
	public void setIMPORTED_WITHOUT_CUSTOM_IMT19(String iMPORTED_WITHOUT_CUSTOM_IMT19) {
		IMPORTED_WITHOUT_CUSTOM_IMT19 = iMPORTED_WITHOUT_CUSTOM_IMT19;
	}
	public String getTPPD_COVER_TO_THE_LIMIT_IMT20() {
		return TPPD_COVER_TO_THE_LIMIT_IMT20;
	}
	public void setTPPD_COVER_TO_THE_LIMIT_IMT20(String tPPD_COVER_TO_THE_LIMIT_IMT20) {
		TPPD_COVER_TO_THE_LIMIT_IMT20 = tPPD_COVER_TO_THE_LIMIT_IMT20;
	}
	public String getCOMPULSARY_DEDUCTABLE_IMT22() {
		return COMPULSARY_DEDUCTABLE_IMT22;
	}
	public void setCOMPULSARY_DEDUCTABLE_IMT22(String cOMPULSARY_DEDUCTABLE_IMT22) {
		COMPULSARY_DEDUCTABLE_IMT22 = cOMPULSARY_DEDUCTABLE_IMT22;
	}
	public String getVOLUNTARY_DEDUCTABLE_IMT22A() {
		return VOLUNTARY_DEDUCTABLE_IMT22A;
	}
	public void setVOLUNTARY_DEDUCTABLE_IMT22A(String vOLUNTARY_DEDUCTABLE_IMT22A) {
		VOLUNTARY_DEDUCTABLE_IMT22A = vOLUNTARY_DEDUCTABLE_IMT22A;
	}
	public String getIMPOSED_EXCESS() {
		return IMPOSED_EXCESS;
	}
	public void setIMPOSED_EXCESS(String iMPOSED_EXCESS) {
		IMPOSED_EXCESS = iMPOSED_EXCESS;
	}
	public String getNO_OF_LL_TO_PAID_DRIVERIMT28() {
		return NO_OF_LL_TO_PAID_DRIVERIMT28;
	}
	public void setNO_OF_LL_TO_PAID_DRIVERIMT28(String nO_OF_LL_TO_PAID_DRIVERIMT28) {
		NO_OF_LL_TO_PAID_DRIVERIMT28 = nO_OF_LL_TO_PAID_DRIVERIMT28;
	}
	public String getNO_OF_LL_TO_EMPLOYEES_IMT29() {
		return NO_OF_LL_TO_EMPLOYEES_IMT29;
	}
	public void setNO_OF_LL_TO_EMPLOYEES_IMT29(String nO_OF_LL_TO_EMPLOYEES_IMT29) {
		NO_OF_LL_TO_EMPLOYEES_IMT29 = nO_OF_LL_TO_EMPLOYEES_IMT29;
	}
	public String getRALLY_TYPE_IMT31() {
		return RALLY_TYPE_IMT31;
	}
	public void setRALLY_TYPE_IMT31(String rALLY_TYPE_IMT31) {
		RALLY_TYPE_IMT31 = rALLY_TYPE_IMT31;
	}
	public String getASSOCIATION_NAME() {
		return ASSOCIATION_NAME;
	}
	public void setASSOCIATION_NAME(String aSSOCIATION_NAME) {
		ASSOCIATION_NAME = aSSOCIATION_NAME;
	}
	public String getNO_OF_DAYS_FOR_RALLY_IMT31() {
		return NO_OF_DAYS_FOR_RALLY_IMT31;
	}
	public void setNO_OF_DAYS_FOR_RALLY_IMT31(String nO_OF_DAYS_FOR_RALLY_IMT31) {
		NO_OF_DAYS_FOR_RALLY_IMT31 = nO_OF_DAYS_FOR_RALLY_IMT31;
	}
	public String getSTART_DATE_OF_RALLY_IMT31() {
		return START_DATE_OF_RALLY_IMT31;
	}
	public void setSTART_DATE_OF_RALLY_IMT31(String sTART_DATE_OF_RALLY_IMT31) {
		START_DATE_OF_RALLY_IMT31 = sTART_DATE_OF_RALLY_IMT31;
	}
	public String getEND_DATE_OF_RALLY_IMT31() {
		return END_DATE_OF_RALLY_IMT31;
	}
	public void setEND_DATE_OF_RALLY_IMT31(String eND_DATE_OF_RALLY_IMT31) {
		END_DATE_OF_RALLY_IMT31 = eND_DATE_OF_RALLY_IMT31;
	}
	public String getRALLY_ADDITIONAL_EXCESS() {
		return RALLY_ADDITIONAL_EXCESS;
	}
	public void setRALLY_ADDITIONAL_EXCESS(String rALLY_ADDITIONAL_EXCESS) {
		RALLY_ADDITIONAL_EXCESS = rALLY_ADDITIONAL_EXCESS;
	}
	public String getACCIDENT_SOLDIER_SAILOR_IMT32() {
		return ACCIDENT_SOLDIER_SAILOR_IMT32;
	}
	public void setACCIDENT_SOLDIER_SAILOR_IMT32(String aCCIDENT_SOLDIER_SAILOR_IMT32) {
		ACCIDENT_SOLDIER_SAILOR_IMT32 = aCCIDENT_SOLDIER_SAILOR_IMT32;
	}
	public String getNO_OF_PERSONS_FOR_IMT_32() {
		return NO_OF_PERSONS_FOR_IMT_32;
	}
	public void setNO_OF_PERSONS_FOR_IMT_32(String nO_OF_PERSONS_FOR_IMT_32) {
		NO_OF_PERSONS_FOR_IMT_32 = nO_OF_PERSONS_FOR_IMT_32;
	}
	public String getTRAILERS_IDV() {
		return TRAILERS_IDV;
	}
	public void setTRAILERS_IDV(String tRAILERS_IDV) {
		TRAILERS_IDV = tRAILERS_IDV;
	}
	public String getATTACHED_TRAILER_SI() {
		return ATTACHED_TRAILER_SI;
	}
	public void setATTACHED_TRAILER_SI(String aTTACHED_TRAILER_SI) {
		ATTACHED_TRAILER_SI = aTTACHED_TRAILER_SI;
	}
	public String getNUMBER_OF_TRAILERS() {
		return NUMBER_OF_TRAILERS;
	}
	public void setNUMBER_OF_TRAILERS(String nUMBER_OF_TRAILERS) {
		NUMBER_OF_TRAILERS = nUMBER_OF_TRAILERS;
	}
	public String getGO_SMART_FLEXI_APPLICABLE() {
		return GO_SMART_FLEXI_APPLICABLE;
	}
	public void setGO_SMART_FLEXI_APPLICABLE(String gO_SMART_FLEXI_APPLICABLE) {
		GO_SMART_FLEXI_APPLICABLE = gO_SMART_FLEXI_APPLICABLE;
	}
	public String getKILOMETER_BAND() {
		return KILOMETER_BAND;
	}
	public void setKILOMETER_BAND(String kILOMETER_BAND) {
		KILOMETER_BAND = kILOMETER_BAND;
	}
	public String getACTUAL_KILOMETER() {
		return ACTUAL_KILOMETER;
	}
	public void setACTUAL_KILOMETER(String aCTUAL_KILOMETER) {
		ACTUAL_KILOMETER = aCTUAL_KILOMETER;
	}
	public String getINSUREDINTEREST() {
		return INSUREDINTEREST;
	}
	public void setINSUREDINTEREST(String iNSUREDINTEREST) {
		INSUREDINTEREST = iNSUREDINTEREST;
	}
	public String getHELMET_PROTECTION_SI() {
		return HELMET_PROTECTION_SI;
	}
	public void setHELMET_PROTECTION_SI(String hELMET_PROTECTION_SI) {
		HELMET_PROTECTION_SI = hELMET_PROTECTION_SI;
	}
	public String getHELMET_PROTECTIONS() {
		return HELMET_PROTECTIONS;
	}
	public void setHELMET_PROTECTIONS(String hELMET_PROTECTIONS) {
		HELMET_PROTECTIONS = hELMET_PROTECTIONS;
	}
	public String getSIDE_CAR() {
		return SIDE_CAR;
	}
	public void setSIDE_CAR(String sIDE_CAR) {
		SIDE_CAR = sIDE_CAR;
	}
	public String getSIDE_CAR_SUM_INSURED() {
		return SIDE_CAR_SUM_INSURED;
	}
	public void setSIDE_CAR_SUM_INSURED(String sIDE_CAR_SUM_INSURED) {
		SIDE_CAR_SUM_INSURED = sIDE_CAR_SUM_INSURED;
	}
	public String getBODY_STYLE_DESCRIPTION() {
		return BODY_STYLE_DESCRIPTION;
	}
	public void setBODY_STYLE_DESCRIPTION(String bODY_STYLE_DESCRIPTION) {
		BODY_STYLE_DESCRIPTION = bODY_STYLE_DESCRIPTION;
	}
	public String getBUILT_IN_LPG_KIT_IMT23() {
		return BUILT_IN_LPG_KIT_IMT23;
	}
	public void setBUILT_IN_LPG_KIT_IMT23(String bUILT_IN_LPG_KIT_IMT23) {
		BUILT_IN_LPG_KIT_IMT23 = bUILT_IN_LPG_KIT_IMT23;
	}
	public String getUSED_PRIVATE_PURPOSE_IMT34() {
		return USED_PRIVATE_PURPOSE_IMT34;
	}
	public void setUSED_PRIVATE_PURPOSE_IMT34(String uSED_PRIVATE_PURPOSE_IMT34) {
		USED_PRIVATE_PURPOSE_IMT34 = uSED_PRIVATE_PURPOSE_IMT34;
	}
	public String getPA_COVER_PILLION_RIDER_IMT16() {
		return PA_COVER_PILLION_RIDER_IMT16;
	}
	public void setPA_COVER_PILLION_RIDER_IMT16(String pA_COVER_PILLION_RIDER_IMT16) {
		PA_COVER_PILLION_RIDER_IMT16 = pA_COVER_PILLION_RIDER_IMT16;
	}
	public String getDRIVER_GENDER() {
		return DRIVER_GENDER;
	}
	public void setDRIVER_GENDER(String dRIVER_GENDER) {
		DRIVER_GENDER = dRIVER_GENDER;
	}
	public String getDRIVING_LICENCE_NUMBER() {
		return DRIVING_LICENCE_NUMBER;
	}
	public void setDRIVING_LICENCE_NUMBER(String dRIVING_LICENCE_NUMBER) {
		DRIVING_LICENCE_NUMBER = dRIVING_LICENCE_NUMBER;
	}
	public String getFIBRE_GLASS_TANK_UNIT() {
		return FIBRE_GLASS_TANK_UNIT;
	}
	public void setFIBRE_GLASS_TANK_UNIT(String fIBRE_GLASS_TANK_UNIT) {
		FIBRE_GLASS_TANK_UNIT = fIBRE_GLASS_TANK_UNIT;
	}
	public String getHORSE_POWER() {
		return HORSE_POWER;
	}
	public void setHORSE_POWER(String hORSE_POWER) {
		HORSE_POWER = hORSE_POWER;
	}
	public String getIMT_46_LL_TO_PASSENGERS() {
		return IMT_46_LL_TO_PASSENGERS;
	}
	public void setIMT_46_LL_TO_PASSENGERS(String iMT_46_LL_TO_PASSENGERS) {
		IMT_46_LL_TO_PASSENGERS = iMT_46_LL_TO_PASSENGERS;
	}
	public String getIMT44() {
		return IMT44;
	}
	public void setIMT44(String iMT44) {
		IMT44 = iMT44;
	}
	public String getIMT48() {
		return IMT48;
	}
	public void setIMT48(String iMT48) {
		IMT48 = iMT48;
	}
	public String getIMT49() {
		return IMT49;
	}
	public void setIMT49(String iMT49) {
		IMT49 = iMT49;
	}
	public String getIMT50() {
		return IMT50;
	}
	public void setIMT50(String iMT50) {
		IMT50 = iMT50;
	}
	public String getIMT51() {
		return IMT51;
	}
	public void setIMT51(String iMT51) {
		IMT51 = iMT51;
	}
	public String getIMT52() {
		return IMT52;
	}
	public void setIMT52(String iMT52) {
		IMT52 = iMT52;
	}
	public String getIMT53() {
		return IMT53;
	}
	public void setIMT53(String iMT53) {
		IMT53 = iMT53;
	}
	public String getIMT54() {
		return IMT54;
	}
	public void setIMT54(String iMT54) {
		IMT54 = iMT54;
	}
	public String getIMT55() {
		return IMT55;
	}
	public void setIMT55(String iMT55) {
		IMT55 = iMT55;
	}
	public String getINDEMNITY_TO_HIRER() {
		return INDEMNITY_TO_HIRER;
	}
	public void setINDEMNITY_TO_HIRER(String iNDEMNITY_TO_HIRER) {
		INDEMNITY_TO_HIRER = iNDEMNITY_TO_HIRER;
	}
	public String getVEHICLE_USED_DRIVING_TUITION() {
		return VEHICLE_USED_DRIVING_TUITION;
	}
	public void setVEHICLE_USED_DRIVING_TUITION(String vEHICLE_USED_DRIVING_TUITION) {
		VEHICLE_USED_DRIVING_TUITION = vEHICLE_USED_DRIVING_TUITION;
	}
	public String getLL_TO_NFPP_EMP_OUTSIDEWC_IMT37() {
		return LL_TO_NFPP_EMP_OUTSIDEWC_IMT37;
	}
	public void setLL_TO_NFPP_EMP_OUTSIDEWC_IMT37(String lL_TO_NFPP_EMP_OUTSIDEWC_IMT37) {
		LL_TO_NFPP_EMP_OUTSIDEWC_IMT37 = lL_TO_NFPP_EMP_OUTSIDEWC_IMT37;
	}
	public String getLL_TO_NFPP_NOT_EMPLOYEE_IMT37A() {
		return LL_TO_NFPP_NOT_EMPLOYEE_IMT37A;
	}
	public void setLL_TO_NFPP_NOT_EMPLOYEE_IMT37A(String lL_TO_NFPP_NOT_EMPLOYEE_IMT37A) {
		LL_TO_NFPP_NOT_EMPLOYEE_IMT37A = lL_TO_NFPP_NOT_EMPLOYEE_IMT37A;
	}
	public String getLOSS_OF_ACCESSORIES_IMT33() {
		return LOSS_OF_ACCESSORIES_IMT33;
	}
	public void setLOSS_OF_ACCESSORIES_IMT33(String lOSS_OF_ACCESSORIES_IMT33) {
		LOSS_OF_ACCESSORIES_IMT33 = lOSS_OF_ACCESSORIES_IMT33;
	}
	public String getSI_FOR_LOSS_OF_ACCESSORIES() {
		return SI_FOR_LOSS_OF_ACCESSORIES;
	}
	public void setSI_FOR_LOSS_OF_ACCESSORIES(String sI_FOR_LOSS_OF_ACCESSORIES) {
		SI_FOR_LOSS_OF_ACCESSORIES = sI_FOR_LOSS_OF_ACCESSORIES;
	}
	public String getNO_OF_LL_PD_CLEAN_CONDUC_IMT40() {
		return NO_OF_LL_PD_CLEAN_CONDUC_IMT40;
	}
	public void setNO_OF_LL_PD_CLEAN_CONDUC_IMT40(String nO_OF_LL_PD_CLEAN_CONDUC_IMT40) {
		NO_OF_LL_PD_CLEAN_CONDUC_IMT40 = nO_OF_LL_PD_CLEAN_CONDUC_IMT40;
	}
	public String getNO_OF_PERSON_EMPL_IMT39_IMT39A() {
		return NO_OF_PERSON_EMPL_IMT39_IMT39A;
	}
	public void setNO_OF_PERSON_EMPL_IMT39_IMT39A(String nO_OF_PERSON_EMPL_IMT39_IMT39A) {
		NO_OF_PERSON_EMPL_IMT39_IMT39A = nO_OF_PERSON_EMPL_IMT39_IMT39A;
	}
	public String getPER_DAY_BENEFIT_LOSS_OF_INCOME() {
		return PER_DAY_BENEFIT_LOSS_OF_INCOME;
	}
	public void setPER_DAY_BENEFIT_LOSS_OF_INCOME(String pER_DAY_BENEFIT_LOSS_OF_INCOME) {
		PER_DAY_BENEFIT_LOSS_OF_INCOME = pER_DAY_BENEFIT_LOSS_OF_INCOME;
	}
	public String getNUMBER_OF_DAY_F_LOSS_OF_INCOME() {
		return NUMBER_OF_DAY_F_LOSS_OF_INCOME;
	}
	public void setNUMBER_OF_DAY_F_LOSS_OF_INCOME(String nUMBER_OF_DAY_F_LOSS_OF_INCOME) {
		NUMBER_OF_DAY_F_LOSS_OF_INCOME = nUMBER_OF_DAY_F_LOSS_OF_INCOME;
	}
	public String getLOSS_OF_INCOME_DEDUCTIBLE() {
		return LOSS_OF_INCOME_DEDUCTIBLE;
	}
	public void setLOSS_OF_INCOME_DEDUCTIBLE(String lOSS_OF_INCOME_DEDUCTIBLE) {
		LOSS_OF_INCOME_DEDUCTIBLE = lOSS_OF_INCOME_DEDUCTIBLE;
	}
	public String getTYPE_OF_PERMIT() {
		return TYPE_OF_PERMIT;
	}
	public void setTYPE_OF_PERMIT(String tYPE_OF_PERMIT) {
		TYPE_OF_PERMIT = tYPE_OF_PERMIT;
	}
	public String getTHEFT_AND_CONVERSION_IMT43() {
		return THEFT_AND_CONVERSION_IMT43;
	}
	public void setTHEFT_AND_CONVERSION_IMT43(String tHEFT_AND_CONVERSION_IMT43) {
		THEFT_AND_CONVERSION_IMT43 = tHEFT_AND_CONVERSION_IMT43;
	}
	public String getOVER_TURNING_COVER() {
		return OVER_TURNING_COVER;
	}
	public void setOVER_TURNING_COVER(String oVER_TURNING_COVER) {
		OVER_TURNING_COVER = oVER_TURNING_COVER;
	}
	public String getPROPOSED_USAGE() {
		return PROPOSED_USAGE;
	}
	public void setPROPOSED_USAGE(String pROPOSED_USAGE) {
		PROPOSED_USAGE = pROPOSED_USAGE;
	}
	public String getDRIVING_LICENSE_EXPIRY_DATE() {
		return DRIVING_LICENSE_EXPIRY_DATE;
	}
	public void setDRIVING_LICENSE_EXPIRY_DATE(String dRIVING_LICENSE_EXPIRY_DATE) {
		DRIVING_LICENSE_EXPIRY_DATE = dRIVING_LICENSE_EXPIRY_DATE;
	}
	public String getGEO_EXT_BANGLADESH() {
		return GEO_EXT_BANGLADESH;
	}
	public void setGEO_EXT_BANGLADESH(String gEO_EXT_BANGLADESH) {
		GEO_EXT_BANGLADESH = gEO_EXT_BANGLADESH;
	}
	public String getGEO_EXT_BHUTAN() {
		return GEO_EXT_BHUTAN;
	}
	public void setGEO_EXT_BHUTAN(String gEO_EXT_BHUTAN) {
		GEO_EXT_BHUTAN = gEO_EXT_BHUTAN;
	}
	public String getGEO_EXT_MALDIVES() {
		return GEO_EXT_MALDIVES;
	}
	public void setGEO_EXT_MALDIVES(String gEO_EXT_MALDIVES) {
		GEO_EXT_MALDIVES = gEO_EXT_MALDIVES;
	}
	public String getGEO_EXT_NEPAL() {
		return GEO_EXT_NEPAL;
	}
	public void setGEO_EXT_NEPAL(String gEO_EXT_NEPAL) {
		GEO_EXT_NEPAL = gEO_EXT_NEPAL;
	}
	public String getGEO_EXT_PAKISTAN() {
		return GEO_EXT_PAKISTAN;
	}
	public void setGEO_EXT_PAKISTAN(String gEO_EXT_PAKISTAN) {
		GEO_EXT_PAKISTAN = gEO_EXT_PAKISTAN;
	}
	public String getGEO_EXT_SRILANKA() {
		return GEO_EXT_SRILANKA;
	}
	public void setGEO_EXT_SRILANKA(String gEO_EXT_SRILANKA) {
		GEO_EXT_SRILANKA = gEO_EXT_SRILANKA;
	}
	public String getTRGCOVER_TYRE1_MFYR() {
		return TRGCOVER_TYRE1_MFYR;
	}
	public void setTRGCOVER_TYRE1_MFYR(String tRGCOVER_TYRE1_MFYR) {
		TRGCOVER_TYRE1_MFYR = tRGCOVER_TYRE1_MFYR;
	}
	public String getTRGCOVER_TYRE1_SRNO() {
		return TRGCOVER_TYRE1_SRNO;
	}
	public void setTRGCOVER_TYRE1_SRNO(String tRGCOVER_TYRE1_SRNO) {
		TRGCOVER_TYRE1_SRNO = tRGCOVER_TYRE1_SRNO;
	}
	public String getTRGCOVER_TYRE2_MFYR() {
		return TRGCOVER_TYRE2_MFYR;
	}
	public void setTRGCOVER_TYRE2_MFYR(String tRGCOVER_TYRE2_MFYR) {
		TRGCOVER_TYRE2_MFYR = tRGCOVER_TYRE2_MFYR;
	}
	public String getTRGCOVER_TYRE2_SRNO() {
		return TRGCOVER_TYRE2_SRNO;
	}
	public void setTRGCOVER_TYRE2_SRNO(String tRGCOVER_TYRE2_SRNO) {
		TRGCOVER_TYRE2_SRNO = tRGCOVER_TYRE2_SRNO;
	}
	public String getTRGCOVER_TYRE3_MFYR() {
		return TRGCOVER_TYRE3_MFYR;
	}
	public void setTRGCOVER_TYRE3_MFYR(String tRGCOVER_TYRE3_MFYR) {
		TRGCOVER_TYRE3_MFYR = tRGCOVER_TYRE3_MFYR;
	}
	public String getTRGCOVER_TYRE3_SRNO() {
		return TRGCOVER_TYRE3_SRNO;
	}
	public void setTRGCOVER_TYRE3_SRNO(String tRGCOVER_TYRE3_SRNO) {
		TRGCOVER_TYRE3_SRNO = tRGCOVER_TYRE3_SRNO;
	}
	public String getTRGCOVER_TYRE4_MFYR() {
		return TRGCOVER_TYRE4_MFYR;
	}
	public void setTRGCOVER_TYRE4_MFYR(String tRGCOVER_TYRE4_MFYR) {
		TRGCOVER_TYRE4_MFYR = tRGCOVER_TYRE4_MFYR;
	}
	public String getTRGCOVER_TYRE4_SRNO() {
		return TRGCOVER_TYRE4_SRNO;
	}
	public void setTRGCOVER_TYRE4_SRNO(String tRGCOVER_TYRE4_SRNO) {
		TRGCOVER_TYRE4_SRNO = tRGCOVER_TYRE4_SRNO;
	}
	public String getTRAILER_REG_NO() {
		return TRAILER_REG_NO;
	}
	public void setTRAILER_REG_NO(String tRAILER_REG_NO) {
		TRAILER_REG_NO = tRAILER_REG_NO;
	}
	public String getTRAILER_CHASSIS_NO() {
		return TRAILER_CHASSIS_NO;
	}
	public void setTRAILER_CHASSIS_NO(String tRAILER_CHASSIS_NO) {
		TRAILER_CHASSIS_NO = tRAILER_CHASSIS_NO;
	}
	public String getTRAILER_YEAR_OF_MANF() {
		return TRAILER_YEAR_OF_MANF;
	}
	public void setTRAILER_YEAR_OF_MANF(String tRAILER_YEAR_OF_MANF) {
		TRAILER_YEAR_OF_MANF = tRAILER_YEAR_OF_MANF;
	}
	public String getMULTI_ELE_ITEM_DESC() {
		return MULTI_ELE_ITEM_DESC;
	}
	public void setMULTI_ELE_ITEM_DESC(String mULTI_ELE_ITEM_DESC) {
		MULTI_ELE_ITEM_DESC = mULTI_ELE_ITEM_DESC;
	}
	public String getMULTI_ELE_IDV() {
		return MULTI_ELE_IDV;
	}
	public void setMULTI_ELE_IDV(String mULTI_ELE_IDV) {
		MULTI_ELE_IDV = mULTI_ELE_IDV;
	}
	public String getMULTI_ELE_ACCESS_DESC() {
		return MULTI_ELE_ACCESS_DESC;
	}
	public void setMULTI_ELE_ACCESS_DESC(String mULTI_ELE_ACCESS_DESC) {
		MULTI_ELE_ACCESS_DESC = mULTI_ELE_ACCESS_DESC;
	}
	public String getMULTI_NON_ELE_ITEM_DESC() {
		return MULTI_NON_ELE_ITEM_DESC;
	}
	public void setMULTI_NON_ELE_ITEM_DESC(String mULTI_NON_ELE_ITEM_DESC) {
		MULTI_NON_ELE_ITEM_DESC = mULTI_NON_ELE_ITEM_DESC;
	}
	public String getMULTI_NON_ELE_IDV() {
		return MULTI_NON_ELE_IDV;
	}
	public void setMULTI_NON_ELE_IDV(String mULTI_NON_ELE_IDV) {
		MULTI_NON_ELE_IDV = mULTI_NON_ELE_IDV;
	}
	public String getMULTI_NON_ELE_ACCESS_DESC() {
		return MULTI_NON_ELE_ACCESS_DESC;
	}
	public void setMULTI_NON_ELE_ACCESS_DESC(String mULTI_NON_ELE_ACCESS_DESC) {
		MULTI_NON_ELE_ACCESS_DESC = mULTI_NON_ELE_ACCESS_DESC;
	}
	public String getELCTRICELECTRNICACCS() {
		return ELCTRICELECTRNICACCS;
	}
	public void setELCTRICELECTRNICACCS(String eLCTRICELECTRNICACCS) {
		ELCTRICELECTRNICACCS = eLCTRICELECTRNICACCS;
	}
	public String getTOWINGCHARG() {
		return TOWINGCHARG;
	}
	public void setTOWINGCHARG(String tOWINGCHARG) {
		TOWINGCHARG = tOWINGCHARG;
	}
	public String getHOSPODCOVER() {
		return HOSPODCOVER;
	}
	public void setHOSPODCOVER(String hOSPODCOVER) {
		HOSPODCOVER = hOSPODCOVER;
	}
	public String getENGINEGUARD() {
		return ENGINEGUARD;
	}
	public void setENGINEGUARD(String eNGINEGUARD) {
		ENGINEGUARD = eNGINEGUARD;
	}
	public String getINCONVENIENCECOVER() {
		return INCONVENIENCECOVER;
	}
	public void setINCONVENIENCECOVER(String iNCONVENIENCECOVER) {
		INCONVENIENCECOVER = iNCONVENIENCECOVER;
	}
	public String getNMDPAPRACPDDRVCL() {
		return NMDPAPRACPDDRVCL;
	}
	public void setNMDPAPRACPDDRVCL(String nMDPAPRACPDDRVCL) {
		NMDPAPRACPDDRVCL = nMDPAPRACPDDRVCL;
	}
	public String getPASOLDRSSAILORSAIRMN() {
		return PASOLDRSSAILORSAIRMN;
	}
	public void setPASOLDRSSAILORSAIRMN(String pASOLDRSSAILORSAIRMN) {
		PASOLDRSSAILORSAIRMN = pASOLDRSSAILORSAIRMN;
	}
	public String getENHANCEDPAOD() {
		return ENHANCEDPAOD;
	}
	public void setENHANCEDPAOD(String eNHANCEDPAOD) {
		ENHANCEDPAOD = eNHANCEDPAOD;
	}
	public String getBASICROADSIDE() {
		return BASICROADSIDE;
	}
	public void setBASICROADSIDE(String bASICROADSIDE) {
		BASICROADSIDE = bASICROADSIDE;
	}
	public String getBASICOD() {
		return BASICOD;
	}
	public void setBASICOD(String bASICOD) {
		BASICOD = bASICOD;
	}
	public String getMEDICALEXPENSES() {
		return MEDICALEXPENSES;
	}
	public void setMEDICALEXPENSES(String mEDICALEXPENSES) {
		MEDICALEXPENSES = mEDICALEXPENSES;
	}
	public String getLLTOEMPLOYEE() {
		return LLTOEMPLOYEE;
	}
	public void setLLTOEMPLOYEE(String lLTOEMPLOYEE) {
		LLTOEMPLOYEE = lLTOEMPLOYEE;
	}
	public String getUNPAPRACPDDRVCLN() {
		return UNPAPRACPDDRVCLN;
	}
	public void setUNPAPRACPDDRVCLN(String uNPAPRACPDDRVCLN) {
		UNPAPRACPDDRVCLN = uNPAPRACPDDRVCLN;
	}
	public String getVEXTENSIONRCSPTP() {
		return VEXTENSIONRCSPTP;
	}
	public void setVEXTENSIONRCSPTP(String vEXTENSIONRCSPTP) {
		VEXTENSIONRCSPTP = vEXTENSIONRCSPTP;
	}
	public String getEMIPROTECTIONCOVER() {
		return EMIPROTECTIONCOVER;
	}
	public void setEMIPROTECTIONCOVER(String eMIPROTECTIONCOVER) {
		EMIPROTECTIONCOVER = eMIPROTECTIONCOVER;
	}
	public String getENHANCEDUNNAMED() {
		return ENHANCEDUNNAMED;
	}
	public void setENHANCEDUNNAMED(String eNHANCEDUNNAMED) {
		ENHANCEDUNNAMED = eNHANCEDUNNAMED;
	}
	public String getCPACOVER() {
		return CPACOVER;
	}
	public void setCPACOVER(String cPACOVER) {
		CPACOVER = cPACOVER;
	}
	public String getVKEYREPLACEMENTCOV() {
		return VKEYREPLACEMENTCOV;
	}
	public void setVKEYREPLACEMENTCOV(String vKEYREPLACEMENTCOV) {
		VKEYREPLACEMENTCOV = vKEYREPLACEMENTCOV;
	}
	public String getTRAILERSOD() {
		return TRAILERSOD;
	}
	public void setTRAILERSOD(String tRAILERSOD) {
		TRAILERSOD = tRAILERSOD;
	}
	public String getRETINVOCOVER() {
		return RETINVOCOVER;
	}
	public void setRETINVOCOVER(String rETINVOCOVER) {
		RETINVOCOVER = rETINVOCOVER;
	}
	public String getRTRODCOVER() {
		return RTRODCOVER;
	}
	public void setRTRODCOVER(String rTRODCOVER) {
		RTRODCOVER = rTRODCOVER;
	}
	public String getTRGCOVER() {
		return TRGCOVER;
	}
	public void setTRGCOVER(String tRGCOVER) {
		TRGCOVER = tRGCOVER;
	}
	public String getEXTENSIONGEOTP() {
		return EXTENSIONGEOTP;
	}
	public void setEXTENSIONGEOTP(String eXTENSIONGEOTP) {
		EXTENSIONGEOTP = eXTENSIONGEOTP;
	}
	public String getNONELECTRICALACSRYOD() {
		return NONELECTRICALACSRYOD;
	}
	public void setNONELECTRICALACSRYOD(String nONELECTRICALACSRYOD) {
		NONELECTRICALACSRYOD = nONELECTRICALACSRYOD;
	}
	public String getBASICTP() {
		return BASICTP;
	}
	public void setBASICTP(String bASICTP) {
		BASICTP = bASICTP;
	}
	public String getEXTERNALLYLPGCNG() {
		return EXTERNALLYLPGCNG;
	}
	public void setEXTERNALLYLPGCNG(String eXTERNALLYLPGCNG) {
		EXTERNALLYLPGCNG = eXTERNALLYLPGCNG;
	}
	public String getGEOAREAOD() {
		return GEOAREAOD;
	}
	public void setGEOAREAOD(String gEOAREAOD) {
		GEOAREAOD = gEOAREAOD;
	}
	public String getVEXTENSIONOD() {
		return VEXTENSIONOD;
	}
	public void setVEXTENSIONOD(String vEXTENSIONOD) {
		VEXTENSIONOD = vEXTENSIONOD;
	}
	public String getCONSUMABLECOV() {
		return CONSUMABLECOV;
	}
	public void setCONSUMABLECOV(String cONSUMABLECOV) {
		CONSUMABLECOV = cONSUMABLECOV;
	}
	public String getCNGLPGBIFUELTP() {
		return CNGLPGBIFUELTP;
	}
	public void setCNGLPGBIFUELTP(String cNGLPGBIFUELTP) {
		CNGLPGBIFUELTP = cNGLPGBIFUELTP;
	}
	public String getLLTOPAIDDRIVER() {
		return LLTOPAIDDRIVER;
	}
	public void setLLTOPAIDDRIVER(String lLTOPAIDDRIVER) {
		LLTOPAIDDRIVER = lLTOPAIDDRIVER;
	}
	public String getVEHICLESIMPORTED() {
		return VEHICLESIMPORTED;
	}
	public void setVEHICLESIMPORTED(String vEHICLESIMPORTED) {
		VEHICLESIMPORTED = vEHICLESIMPORTED;
	}
	public String getPRSNLACDNCVPDDRVCLN() {
		return PRSNLACDNCVPDDRVCLN;
	}
	public void setPRSNLACDNCVPDDRVCLN(String pRSNLACDNCVPDDRVCLN) {
		PRSNLACDNCVPDDRVCLN = pRSNLACDNCVPDDRVCLN;
	}
	public String getINBUILTCNGLPG() {
		return INBUILTCNGLPG;
	}
	public void setINBUILTCNGLPG(String iNBUILTCNGLPG) {
		INBUILTCNGLPG = iNBUILTCNGLPG;
	}
	public String getADDROADSIDE() {
		return ADDROADSIDE;
	}
	public void setADDROADSIDE(String aDDROADSIDE) {
		ADDROADSIDE = aDDROADSIDE;
	}
	public String getVVNCBCOVER() {
		return VVNCBCOVER;
	}
	public void setVVNCBCOVER(String vVNCBCOVER) {
		VVNCBCOVER = vVNCBCOVER;
	}
	public String getLOSSOFPERSONAL() {
		return LOSSOFPERSONAL;
	}
	public void setLOSSOFPERSONAL(String lOSSOFPERSONAL) {
		LOSSOFPERSONAL = lOSSOFPERSONAL;
	}
	public String getVDRIVINGTUITIONS() {
		return VDRIVINGTUITIONS;
	}
	public void setVDRIVINGTUITIONS(String vDRIVINGTUITIONS) {
		VDRIVINGTUITIONS = vDRIVINGTUITIONS;
	}
	public String getHOSPUPCOVER() {
		return HOSPUPCOVER;
	}
	public void setHOSPUPCOVER(String hOSPUPCOVER) {
		HOSPUPCOVER = hOSPUPCOVER;
	}
	public String getTRAILERSTP() {
		return TRAILERSTP;
	}
	public void setTRAILERSTP(String tRAILERSTP) {
		TRAILERSTP = tRAILERSTP;
	}
	public String getFIBREGLASSFUELTANK() {
		return FIBREGLASSFUELTANK;
	}
	public void setFIBREGLASSFUELTANK(String fIBREGLASSFUELTANK) {
		FIBREGLASSFUELTANK = fIBREGLASSFUELTANK;
	}
	public String getENHANCEDPAPD() {
		return ENHANCEDPAPD;
	}
	public void setENHANCEDPAPD(String eNHANCEDPAPD) {
		ENHANCEDPAPD = eNHANCEDPAPD;
	}
	public String getDEPRECIATIONREIM() {
		return DEPRECIATIONREIM;
	}
	public void setDEPRECIATIONREIM(String dEPRECIATIONREIM) {
		DEPRECIATIONREIM = dEPRECIATIONREIM;
	}
	public String getRTRTPCOVER() {
		return RTRTPCOVER;
	}
	public void setRTRTPCOVER(String rTRTPCOVER) {
		RTRTPCOVER = rTRTPCOVER;
	}
	public String getHOSPPDCOVER() {
		return HOSPPDCOVER;
	}
	public void setHOSPPDCOVER(String hOSPPDCOVER) {
		HOSPPDCOVER = hOSPPDCOVER;
	}
	public String getGEOGRAPHICALTP() {
		return GEOGRAPHICALTP;
	}
	public void setGEOGRAPHICALTP(String gEOGRAPHICALTP) {
		GEOGRAPHICALTP = gEOGRAPHICALTP;
	}
	public String getRTRCOVER() {
		return RTRCOVER;
	}
	public void setRTRCOVER(String rTRCOVER) {
		RTRCOVER = rTRCOVER;
	}
	public String getCONSUMABLESCOVER() {
		return CONSUMABLESCOVER;
	}
	public void setCONSUMABLESCOVER(String cONSUMABLESCOVER) {
		CONSUMABLESCOVER = cONSUMABLESCOVER;
	}
	public String getHELMETPROT() {
		return HELMETPROT;
	}
	public void setHELMETPROT(String hELMETPROT) {
		HELMETPROT = hELMETPROT;
	}
	public String getPRONCBCOVER() {
		return PRONCBCOVER;
	}
	public void setPRONCBCOVER(String pRONCBCOVER) {
		PRONCBCOVER = pRONCBCOVER;
	}
	public String getMEDICALEXPENSE() {
		return MEDICALEXPENSE;
	}
	public void setMEDICALEXPENSE(String mEDICALEXPENSE) {
		MEDICALEXPENSE = mEDICALEXPENSE;
	}
	public String getINSUREDPA() {
		return INSUREDPA;
	}
	public void setINSUREDPA(String iNSUREDPA) {
		INSUREDPA = iNSUREDPA;
	}
	public String getUNNAMEDPA() {
		return UNNAMEDPA;
	}
	public void setUNNAMEDPA(String uNNAMEDPA) {
		UNNAMEDPA = uNNAMEDPA;
	}
	public String getLLPAIDDRIVER() {
		return LLPAIDDRIVER;
	}
	public void setLLPAIDDRIVER(String lLPAIDDRIVER) {
		LLPAIDDRIVER = lLPAIDDRIVER;
	}
	public String getLLEMPLOYEES() {
		return LLEMPLOYEES;
	}
	public void setLLEMPLOYEES(String lLEMPLOYEES) {
		LLEMPLOYEES = lLEMPLOYEES;
	}
	public String getRTRTPCOVERMASTER() {
		return RTRTPCOVERMASTER;
	}
	public void setRTRTPCOVERMASTER(String rTRTPCOVERMASTER) {
		RTRTPCOVERMASTER = rTRTPCOVERMASTER;
	}
	public String getTYRERIMCOVER() {
		return TYRERIMCOVER;
	}
	public void setTYRERIMCOVER(String tYRERIMCOVER) {
		TYRERIMCOVER = tYRERIMCOVER;
	}
	public String getINCONVENIENCEMASTER() {
		return INCONVENIENCEMASTER;
	}
	public void setINCONVENIENCEMASTER(String iNCONVENIENCEMASTER) {
		INCONVENIENCEMASTER = iNCONVENIENCEMASTER;
	}
	public String getSCCOVER() {
		return SCCOVER;
	}
	public void setSCCOVER(String sCCOVER) {
		SCCOVER = sCCOVER;
	}
	public String getEXTERNALLYCNGLPG() {
		return EXTERNALLYCNGLPG;
	}
	public void setEXTERNALLYCNGLPG(String eXTERNALLYCNGLPG) {
		EXTERNALLYCNGLPG = eXTERNALLYCNGLPG;
	}
	public String getDRIVINGTUTIONS() {
		return DRIVINGTUTIONS;
	}
	public void setDRIVINGTUTIONS(String dRIVINGTUTIONS) {
		DRIVINGTUTIONS = dRIVINGTUTIONS;
	}
	public String getEXTENSIONOD() {
		return EXTENSIONOD;
	}
	public void setEXTENSIONOD(String eXTENSIONOD) {
		EXTENSIONOD = eXTENSIONOD;
	}
	public String getEXTENSTIONTP() {
		return EXTENSTIONTP;
	}
	public void setEXTENSTIONTP(String eXTENSTIONTP) {
		EXTENSTIONTP = eXTENSTIONTP;
	}
	public String getACCESSORIESLOSS() {
		return ACCESSORIESLOSS;
	}
	public void setACCESSORIESLOSS(String aCCESSORIESLOSS) {
		ACCESSORIESLOSS = aCCESSORIESLOSS;
	}
	public String getCNGLPGTP() {
		return CNGLPGTP;
	}
	public void setCNGLPGTP(String cNGLPGTP) {
		CNGLPGTP = cNGLPGTP;
	}
	public String getFIBREGLASS() {
		return FIBREGLASS;
	}
	public void setFIBREGLASS(String fIBREGLASS) {
		FIBREGLASS = fIBREGLASS;
	}
	public String getIMT44OD() {
		return IMT44OD;
	}
	public void setIMT44OD(String iMT44OD) {
		IMT44OD = iMT44OD;
	}
	public String getIMT37A() {
		return IMT37A;
	}
	public void setIMT37A(String iMT37A) {
		IMT37A = iMT37A;
	}
	public String getIMT43() {
		return IMT43;
	}
	public void setIMT43(String iMT43) {
		IMT43 = iMT43;
	}
	public String getIMT44TP() {
		return IMT44TP;
	}
	public void setIMT44TP(String iMT44TP) {
		IMT44TP = iMT44TP;
	}
	public String getYPCOMMERCIALPVT() {
		return YPCOMMERCIALPVT;
	}
	public void setYPCOMMERCIALPVT(String yPCOMMERCIALPVT) {
		YPCOMMERCIALPVT = yPCOMMERCIALPVT;
	}
	public String getPATOPAIDCLNCON() {
		return PATOPAIDCLNCON;
	}
	public void setPATOPAIDCLNCON(String pATOPAIDCLNCON) {
		PATOPAIDCLNCON = pATOPAIDCLNCON;
	}
	public String getHOSPITALCASHOD() {
		return HOSPITALCASHOD;
	}
	public void setHOSPITALCASHOD(String hOSPITALCASHOD) {
		HOSPITALCASHOD = hOSPITALCASHOD;
	}
	public String getIMT37() {
		return IMT37;
	}
	public void setIMT37(String iMT37) {
		IMT37 = iMT37;
	}
	public String getENHANCEPAOD() {
		return ENHANCEPAOD;
	}
	public void setENHANCEPAOD(String eNHANCEPAOD) {
		ENHANCEPAOD = eNHANCEPAOD;
	}
	public String getRETURNTOINVOICE() {
		return RETURNTOINVOICE;
	}
	public void setRETURNTOINVOICE(String rETURNTOINVOICE) {
		RETURNTOINVOICE = rETURNTOINVOICE;
	}
	public String getLOSSOFINCOME() {
		return LOSSOFINCOME;
	}
	public void setLOSSOFINCOME(String lOSSOFINCOME) {
		LOSSOFINCOME = lOSSOFINCOME;
	}
	public String getENHANCEPAPD() {
		return ENHANCEPAPD;
	}
	public void setENHANCEPAPD(String eNHANCEPAPD) {
		ENHANCEDPAOD = eNHANCEPAPD;
	}
	public String getADDTOWINGCHARGE() {
		return ADDTOWINGCHARGE;
	}
	public void setADDTOWINGCHARGE(String aDDTOWINGCHARGE) {
		ADDTOWINGCHARGE = aDDTOWINGCHARGE;
	}
	public String getIMT23() {
		return IMT23;
	}
	public void setIMT23(String iMT23) {
		IMT23 = iMT23;
	}
	public String getEMIPROTECTOR() {
		return EMIPROTECTOR;
	}
	public void setEMIPROTECTOR(String eMIPROTECTOR) {
		EMIPROTECTOR = eMIPROTECTOR;
	}
	public String getODCOMMERCIALPRIVATE() {
		return ODCOMMERCIALPRIVATE;
	}
	public void setODCOMMERCIALPRIVATE(String oDCOMMERCIALPRIVATE) {
		ODCOMMERCIALPRIVATE = oDCOMMERCIALPRIVATE;
	}
	public String getIMT40() {
		return IMT40;
	}
	public void setIMT40(String iMT40) {
		IMT40 = iMT40;
	}
	public String getHOSPITALCASHPD() {
		return HOSPITALCASHPD;
	}
	public void setHOSPITALCASHPD(String hOSPITALCASHPD) {
		HOSPITALCASHPD = hOSPITALCASHPD;
	}
	public String getNONELECTRICALACCES() {
		return NONELECTRICALACCES;
	}
	public void setNONELECTRICALACCES(String nONELECTRICALACCES) {
		NONELECTRICALACCES = nONELECTRICALACCES;
	}
	public String getFIBREGLASSTANK() {
		return FIBREGLASSTANK;
	}
	public void setFIBREGLASSTANK(String fIBREGLASSTANK) {
		FIBREGLASSTANK = fIBREGLASSTANK;
	}
	public String getVEHICLEIMPORT() {
		return VEHICLEIMPORT;
	}
	public void setVEHICLEIMPORT(String vEHICLEIMPORT) {
		VEHICLEIMPORT = vEHICLEIMPORT;
	}
	public String getEXTNGEOOD() {
		return EXTNGEOOD;
	}
	public void setEXTNGEOOD(String eXTNGEOOD) {
		EXTNGEOOD = eXTNGEOOD;
	}
	public String getBIFUELCNGLPGOD() {
		return BIFUELCNGLPGOD;
	}
	public void setBIFUELCNGLPGOD(String bIFUELCNGLPGOD) {
		BIFUELCNGLPGOD = bIFUELCNGLPGOD;
	}
	public String getINBUILTCNGLPGOD() {
		return INBUILTCNGLPGOD;
	}
	public void setINBUILTCNGLPGOD(String iNBUILTCNGLPGOD) {
		INBUILTCNGLPGOD = iNBUILTCNGLPGOD;
	}
	public String getDEPREIMBURSEMENT() {
		return DEPREIMBURSEMENT;
	}
	public void setDEPREIMBURSEMENT(String dEPREIMBURSEMENT) {
		DEPREIMBURSEMENT = dEPREIMBURSEMENT;
	}
	public String getZDRIVINGTUITIONS() {
		return ZDRIVINGTUITIONS;
	}
	public void setZDRIVINGTUITIONS(String zDRIVINGTUITIONS) {
		ZDRIVINGTUITIONS = zDRIVINGTUITIONS;
	}
	public String getPROTECTIONOFNCB() {
		return PROTECTIONOFNCB;
	}
	public void setPROTECTIONOFNCB(String pROTECTIONOFNCB) {
		PROTECTIONOFNCB = pROTECTIONOFNCB;
	}
	public String getKEYREPLACEMENTCOV() {
		return KEYREPLACEMENTCOV;
	}
	public void setKEYREPLACEMENTCOV(String kEYREPLACEMENTCOV) {
		KEYREPLACEMENTCOV = kEYREPLACEMENTCOV;
	}
	public String getIMT39A() {
		return IMT39A;
	}
	public void setIMT39A(String iMT39A) {
		IMT39A = iMT39A;
	}
	public String getLLTOEMPLOYED() {
		return LLTOEMPLOYED;
	}
	public void setLLTOEMPLOYED(String lLTOEMPLOYED) {
		LLTOEMPLOYED = lLTOEMPLOYED;
	}
	public String getIMT39() {
		return IMT39;
	}
	public void setIMT39(String iMT39) {
		IMT39 = iMT39;
	}
	public String getODIMT23() {
		return ODIMT23;
	}
	public void setODIMT23(String oDIMT23) {
		ODIMT23 = oDIMT23;
	}
	public String getIMT47() {
		return IMT47;
	}
	public void setIMT47(String iMT47) {
		IMT47 = iMT47;
	}
	public String getIMT46() {
		return IMT46;
	}
	public void setIMT46(String iMT46) {
		IMT46 = iMT46;
	}
	public String getPARTY_TYPE() {
		return PARTY_TYPE;
	}
	public void setPARTY_TYPE(String pARTY_TYPE) {
		PARTY_TYPE = pARTY_TYPE;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getMIDDLE_NAME() {
		return MIDDLE_NAME;
	}
	public void setMIDDLE_NAME(String mIDDLE_NAME) {
		MIDDLE_NAME = mIDDLE_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public String getNATIONALITY() {
		return NATIONALITY;
	}
	public void setNATIONALITY(String nATIONALITY) {
		NATIONALITY = nATIONALITY;
	}
	public String getOCCUPATION() {
		return OCCUPATION;
	}
	public void setOCCUPATION(String oCCUPATION) {
		OCCUPATION = oCCUPATION;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}
	public String getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}
	public void setDATE_OF_BIRTH(String dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}
	public String getSALUTATION() {
		return SALUTATION;
	}
	public void setSALUTATION(String sALUTATION) {
		SALUTATION = sALUTATION;
	}
	public String getPROPOSER_PAN() {
		return PROPOSER_PAN;
	}
	public void setPROPOSER_PAN(String pROPOSER_PAN) {
		PROPOSER_PAN = pROPOSER_PAN;
	}
	public String getPROPOSER_CKYC_NO() {
		return PROPOSER_CKYC_NO;
	}
	public void setPROPOSER_CKYC_NO(String pROPOSER_CKYC_NO) {
		PROPOSER_CKYC_NO = pROPOSER_CKYC_NO;
	}
	public String getADDRESS1() {
		return ADDRESS1;
	}
	public void setADDRESS1(String aDDRESS1) {
		ADDRESS1 = aDDRESS1;
	}
	public String getADDRESS2() {
		return ADDRESS2;
	}
	public void setADDRESS2(String aDDRESS2) {
		ADDRESS2 = aDDRESS2;
	}
	public String getADDRESS3() {
		return ADDRESS3;
	}
	public void setADDRESS3(String aDDRESS3) {
		ADDRESS3 = aDDRESS3;
	}
	public String getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(String pINCODE) {
		PINCODE = pINCODE;
	}
	public String getTELEPHONE_NO() {
		return TELEPHONE_NO;
	}
	public void setTELEPHONE_NO(String tELEPHONE_NO) {
		TELEPHONE_NO = tELEPHONE_NO;
	}
	public String getMOBILE_NO() {
		return MOBILE_NO;
	}
	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}
	public String getWHATSAPP_NO() {
		return WHATSAPP_NO;
	}
	public void setWHATSAPP_NO(String wHATSAPP_NO) {
		WHATSAPP_NO = wHATSAPP_NO;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getEMAIL1() {
		return EMAIL1;
	}
	public void setEMAIL1(String eMAIL1) {
		EMAIL1 = eMAIL1;
	}
	public String getCOL_BANK_BRANCH() {
		return COL_BANK_BRANCH;
	}
	public void setCOL_BANK_BRANCH(String cOL_BANK_BRANCH) {
		COL_BANK_BRANCH = cOL_BANK_BRANCH;
	}
	public String getCOL_BANK_NAME() {
		return COL_BANK_NAME;
	}
	public void setCOL_BANK_NAME(String cOL_BANK_NAME) {
		COL_BANK_NAME = cOL_BANK_NAME;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getCOL_TYPE() {
		return COL_TYPE;
	}
	public void setCOL_TYPE(String cOL_TYPE) {
		COL_TYPE = cOL_TYPE;
	}
	public String getRECIEPT_NUM() {
		return RECIEPT_NUM;
	}
	public void setRECIEPT_NUM(String rECIEPT_NUM) {
		RECIEPT_NUM = rECIEPT_NUM;
	}
	public String getCD_ACCOUNT_NO() {
		return CD_ACCOUNT_NO;
	}
	public void setCD_ACCOUNT_NO(String cD_ACCOUNT_NO) {
		CD_ACCOUNT_NO = cD_ACCOUNT_NO;
	}
	public String getSOA_TRANSACTIONID() {
		return SOA_TRANSACTIONID;
	}
	public void setSOA_TRANSACTIONID(String sOA_TRANSACTIONID) {
		SOA_TRANSACTIONID = sOA_TRANSACTIONID;
	}
	public String getPAYER_TYPE() {
		return PAYER_TYPE;
	}
	public void setPAYER_TYPE(String pAYER_TYPE) {
		PAYER_TYPE = pAYER_TYPE;
	}
	public String getCHANNEL_NAME() {
		return CHANNEL_NAME;
	}
	public void setCHANNEL_NAME(String cHANNEL_NAME) {
		CHANNEL_NAME = cHANNEL_NAME;
	}
	public String getSUB_CHANNEL_NAME() {
		return SUB_CHANNEL_NAME;
	}
	public void setSUB_CHANNEL_NAME(String sUB_CHANNEL_NAME) {
		SUB_CHANNEL_NAME = sUB_CHANNEL_NAME;
	}
	public String getINSTRUMENTNUMBER() {
		return INSTRUMENTNUMBER;
	}
	public void setINSTRUMENTNUMBER(String iNSTRUMENTNUMBER) {
		INSTRUMENTNUMBER = iNSTRUMENTNUMBER;
	}
	public String getCOL_DATE() {
		return COL_DATE;
	}
	public void setCOL_DATE(String cOL_DATE) {
		COL_DATE = cOL_DATE;
	}
	public String getCOL_RECIEVED_DATE() {
		return COL_RECIEVED_DATE;
	}
	public void setCOL_RECIEVED_DATE(String cOL_RECIEVED_DATE) {
		COL_RECIEVED_DATE = cOL_RECIEVED_DATE;
	}
	public String getOEM_PREMIUM_AMOUNT() {
		return OEM_PREMIUM_AMOUNT;
	}
	public void setOEM_PREMIUM_AMOUNT(String oEM_PREMIUM_AMOUNT) {
		OEM_PREMIUM_AMOUNT = oEM_PREMIUM_AMOUNT;
	}
	public String getFINANCIER_NAME() {
		return FINANCIER_NAME;
	}
	public void setFINANCIER_NAME(String fINANCIER_NAME) {
		FINANCIER_NAME = fINANCIER_NAME;
	}
	public String getFINANCIER_BRANCH() {
		return FINANCIER_BRANCH;
	}
	public void setFINANCIER_BRANCH(String fINANCIER_BRANCH) {
		FINANCIER_BRANCH = fINANCIER_BRANCH;
	}
	public String getFINANCIER_AGGREMENT_TYPE() {
		return FINANCIER_AGGREMENT_TYPE;
	}
	public void setFINANCIER_AGGREMENT_TYPE(String fINANCIER_AGGREMENT_TYPE) {
		FINANCIER_AGGREMENT_TYPE = fINANCIER_AGGREMENT_TYPE;
	}
	public String getFINANCER_LOAN_ACC_NO() {
		return FINANCER_LOAN_ACC_NO;
	}
	public void setFINANCER_LOAN_ACC_NO(String fINANCER_LOAN_ACC_NO) {
		FINANCER_LOAN_ACC_NO = fINANCER_LOAN_ACC_NO;
	}
	public String getPREV_INSURANCE_COMPANY_ADDRESS() {
		return PREV_INSURANCE_COMPANY_ADDRESS;
	}
	public void setPREV_INSURANCE_COMPANY_ADDRESS(String pREV_INSURANCE_COMPANY_ADDRESS) {
		PREV_INSURANCE_COMPANY_ADDRESS = pREV_INSURANCE_COMPANY_ADDRESS;
	}
	public String getCLAIM1_YEAR() {
		return CLAIM1_YEAR;
	}
	public void setCLAIM1_YEAR(String cLAIM1_YEAR) {
		CLAIM1_YEAR = cLAIM1_YEAR;
	}
	public String getCLAIM1_LOSS_DATE() {
		return CLAIM1_LOSS_DATE;
	}
	public void setCLAIM1_LOSS_DATE(String cLAIM1_LOSS_DATE) {
		CLAIM1_LOSS_DATE = cLAIM1_LOSS_DATE;
	}
	public String getCLAIM1_AMOUNT() {
		return CLAIM1_AMOUNT;
	}
	public void setCLAIM1_AMOUNT(String cLAIM1_AMOUNT) {
		CLAIM1_AMOUNT = cLAIM1_AMOUNT;
	}
	public String getCLAIM1_TYPE() {
		return CLAIM1_TYPE;
	}
	public void setCLAIM1_TYPE(String cLAIM1_TYPE) {
		CLAIM1_TYPE = cLAIM1_TYPE;
	}
	public String getDATE_OF_INCORPORATION() {
		return DATE_OF_INCORPORATION;
	}
	public void setDATE_OF_INCORPORATION(String dATE_OF_INCORPORATION) {
		DATE_OF_INCORPORATION = dATE_OF_INCORPORATION;
	}
	public String getGSTN_NUMBER() {
		return GSTN_NUMBER;
	}
	public void setGSTN_NUMBER(String gSTN_NUMBER) {
		GSTN_NUMBER = gSTN_NUMBER;
	}
	public String getGSTN_STATE_CODE() {
		return GSTN_STATE_CODE;
	}
	public void setGSTN_STATE_CODE(String gSTN_STATE_CODE) {
		GSTN_STATE_CODE = gSTN_STATE_CODE;
	}
	public String getMISC_1() {
		return MISC_1;
	}
	public void setMISC_1(String mISC_1) {
		MISC_1 = mISC_1;
	}
	public String getMISC_2() {
		return MISC_2;
	}
	public void setMISC_2(String mISC_2) {
		MISC_2 = mISC_2;
	}
	public String getMISC_3() {
		return MISC_3;
	}
	public void setMISC_3(String mISC_3) {
		MISC_3 = mISC_3;
	}
	public String getMISC_4() {
		return MISC_4;
	}
	public void setMISC_4(String mISC_4) {
		MISC_4 = mISC_4;
	}
	public String getMISC_5() {
		return MISC_5;
	}
	public void setMISC_5(String mISC_5) {
		MISC_5 = mISC_5;
	}
	public String getMISC_6() {
		return MISC_6;
	}
	public void setMISC_6(String mISC_6) {
		MISC_6 = mISC_6;
	}
	public String getMISC_7() {
		return MISC_7;
	}
	public void setMISC_7(String mISC_7) {
		MISC_7 = mISC_7;
	}
	public String getMISC_8() {
		return MISC_8;
	}
	public void setMISC_8(String mISC_8) {
		MISC_8 = mISC_8;
	}
	public String getMISC_9() {
		return MISC_9;
	}
	public void setMISC_9(String mISC_9) {
		MISC_9 = mISC_9;
	}
	public String getMISC_10() {
		return MISC_10;
	}
	public void setMISC_10(String mISC_10) {
		MISC_10 = mISC_10;
	}
	@Override
	public String toString() {
		return "UserPolicyDetails [id=" + ", PRODUCT_CODE=" + PRODUCT_CODE + ", POLICY_HOLDER=" + POLICY_HOLDER
				+ ", IS_CKYC_VERIFIED=" + IS_CKYC_VERIFIED + ", CKYC_NUMBER=" + CKYC_NUMBER + ", CKYC_DOCUMENT_UPLOAD="
				+ CKYC_DOCUMENT_UPLOAD + ", GENDER=" + GENDER + ", CKYC_UNIQUE_IDENTIFIER=" + CKYC_UNIQUE_IDENTIFIER
				+ ", CKYC_REMARKS=" + CKYC_REMARKS + ", POLICY_HOLDER_NAME=" + POLICY_HOLDER_NAME + ", VEHICLE_TYPE="
				+ VEHICLE_TYPE + ", BUSINESS_TYPE=" + BUSINESS_TYPE + ", COMMERCIAL_TYPE=" + COMMERCIAL_TYPE
				+ ", POLICY_TYPE=" + POLICY_TYPE + ", POLICY_PLAN=" + POLICY_PLAN + ", POLICY_TENURE=" + POLICY_TENURE
				+ ", ENTRY_DATE=" + ENTRY_DATE + ", ENTRY_TIME=" + ENTRY_TIME + ", POLICY_INCEPTION_DATE="
				+ POLICY_INCEPTION_DATE + ", POLICY_INCEPTION_TIME=" + POLICY_INCEPTION_TIME + ", POLICY_DURATION="
				+ POLICY_DURATION + ", TERM_UNIT=" + TERM_UNIT + ", POLICY_EXPIRY_DATE=" + POLICY_EXPIRY_DATE
				+ ", POLICY_EXPIRY_TIME=" + POLICY_EXPIRY_TIME + ", ODRED=" + ODRED + ", COUNTRY=" + COUNTRY
				+ ", BRANCH_CODE=" + BRANCH_CODE + ", USER_BRANCH_NAME=" + USER_BRANCH_NAME + ", HEAD_OFFICE="
				+ HEAD_OFFICE + ", EXEMPTION_CATEGORY=" + EXEMPTION_CATEGORY + ", ISSUANCE_SOURCE=" + ISSUANCE_SOURCE
				+ ", OPTION_FOR_CALCULATION=" + OPTION_FOR_CALCULATION + ", SECTOR=" + SECTOR
				+ ", CO_INSURANCE_APPLICABLE=" + CO_INSURANCE_APPLICABLE + ", OEM_POLICY_NUMBER=" + OEM_POLICY_NUMBER
				+ ", INWARD_NUMBER=" + INWARD_NUMBER + ", POLICY_ISSUED_DATE=" + POLICY_ISSUED_DATE
				+ ", RENEWAL_APPLICABLE=" + RENEWAL_APPLICABLE + ", GO_GREEN=" + GO_GREEN
				+ ", PROPOSAL_IDENTIFICATION_NUMBER=" + PROPOSAL_IDENTIFICATION_NUMBER + ", PREVIOUS_POLICY_AVAILABLE="
				+ PREVIOUS_POLICY_AVAILABLE + ", PREVIOUS_POLICY_NUMBER=" + PREVIOUS_POLICY_NUMBER
				+ ", PREV_INSURANCE_COMPANY_NAME=" + PREV_INSURANCE_COMPANY_NAME + ", PREV_POLICY_INCEPTION_DATE="
				+ PREVIOUS_POLICY_INCEPTION_DATE + ", PREVIOUS_POLICY_EXPIRY_DATE=" + PREVIOUS_POLICY_EXPIRY_DATE
				+ ", PREVIOUS_POLICY_TERM=" + PREVIOUS_POLICY_TERM + ", PREVIOUS_POLICY_TYPE=" + PREVIOUS_POLICY_TYPE
				+ ", CLAIM_APPLICABLE=" + CLAIM_APPLICABLE + ", NUMBER_OF_CLAIM_ON_PREV_POLICY="
				+ NUMBER_OF_CLAIM_ON_PREV_POLICY + ", LEAD_NUMBER=" + LEAD_NUMBER + ", PREVIOUS_COMPANY_EMAIL_ID="
				+ PREVIOUS_COMPANY_EMAIL_ID + ", PROPOSAL_IS_BREAK_IN=" + PROPOSAL_IS_BREAK_IN + ", REINSTATE_REQUIRED="
				+ REINSTATE_REQUIRED + ", RENEWAL_NOTICE_TO_BE_GENERATED=" + RENEWAL_NOTICE_TO_BE_GENERATED
				+ ", RENEWAL_STATUS=" + RENEWAL_STATUS + ", DEALER_CODE=" + DEALER_CODE + ", SUB_CHANNEL_2="
				+ SUB_CHANNEL2 + ", AGREEMENT_CODE=" + AGREEMENT_CODE + ", IS_CUST_ID_SAME_PAYER_ID="
				+ IS_CUST_ID_SAME_PAYER_ID + ", ACTIVE_TP_POLICY_NUMBER=" + ACTIVE_TP_POLICY_NUMBER
				+ ", ACTIVE_TP_INS_COMPANY_NAME=" + ACTIVE_TP_INS_COMPANY_NAME + ", ACTIVE_TP_BRANCH_ADDRESS="
				+ ACTIVE_TP_BRANCH_ADDRESS + ", ACTIVE_TP_INCEPT_DATE=" + ACTIVE_TP_POLICY_INCEPT_DATE
				+ ", ACTIVE_TP_POLICY_EXPIRY_DATE=" + ACTIVE_TP_POLICY_EXPIRY_DATE + ", ACTIVE_TP_POLICY_TERM="
				+ ACTIVE_TP_POLICY_TERM + ", MISC_VEHICLE_SUB_TYPE=" + MISC_VEHICLE_SUB_TYPE + ", COMPUTATION_TYPE="
				+ COMPUTATION_TYPE + ", INSPECTION_WAIVER=" + INSPECTION_WAIVER + ", PIN_NUMBER=" + PIN_NUMBER
				+ ", VEHICLE_INSPECTION_STATUS=" + VEHICLE_INSPECTION_STATUS + ", INSPECTION_DATE=" + INSPECTION_DATE
				+ ", INSPECTION_AGENCY_NAME=" + INSPECTION_AGENCY_NAME + ", REMARKS=" + REMARKS + ", INSPECTION_REASON="
				+ INSPECTION_REASON + ", NCB_DISCOUNT_AMOUNT=" + NCB_DISCOUNT_AMOUNT + ", ARE_YOU_ENTITLED_TO_NCB="
				+ ARE_YOU_ENTITLED_TO_NCB + ", HAS_ANY_INSURANCE_COMPANY_EVER=" + HAS_ANY_INSURANCE_COMPANY_EVER
				+ ", DOES_DRIVER_SUFFER_DEFECTIVE=" + DOES_DRIVER_SUFFER_DEFECTIVE + ", DRIVER_BEEN_INVOL_CONVICTED="
				+ DRIVER_BEEN_INVOL_CONVICTED + ", IS_VEHICLE_IN_GOOD_CONDITION=" + IS_VEHICLE_IN_GOOD_CONDITION
				+ ", ROAD_TYPE=" + ROAD_TYPE + ", USE_OF_VEHICLE=" + USE_OF_VEHICLE + ", AVERAGE_DAILY_USE_OF_VEHICLE="
				+ AVERAGE_DAILY_USE_OF_VEHICLE + ", LOCATION_FOR_PARK_DURING_DAY=" + LOCATION_FOR_PARK_DURING_DAY
				+ ", LOCATION_FOR_PARK_DURING_NIGHT=" + LOCATION_FOR_PARK_DURING_NIGHT
				+ ", DRIVING_EXPERIENCE_IN_YEARS=" + DRIVING_EXPERIENCE_IN_YEARS + ", AGE_OF_DRIVER=" + AGE_OF_THE_DRIVER
				+ ", TYRE_SERIAL_NUMBER=" + TYRE_SERIAL_NUMBER + ", TRASNFER_OF_NCB=" + TRANSFER_OF_NCB
				+ ", NCB_ON_PREVIOUS_POLICY=" + NCB_ON_PREVIOUS_POLICY + ", PROOF_PROVIDED_FOR_NCB="
				+ PROOF_PROVIDED_FOR_NCB + ", APPLICABLE_NCB_PERCENT=" + APPLICABLE_NCB_PERCENT + ", NCB_STATUS="
				+ NCB_STATUS + ", NCB_RECOVERY_REASON=" + NCB_RECOVERY_REASON + ", REGISTRATION_NUMBER="
				+ REGISTRATION_NUMBER + ", REGISTRATION_NUMBER_FORMAT=" + REGISTRATION_NUMBER_FORMAT
				+ ", REGISTRATION_NO_BOX_1=" + REGISTRATION_NO_BOX_1 + ", REGISTRATION_NO_BOX_2="
				+ REGISTRATION_NO_BOX_2 + ", REGISTRATION_NO_BOX_3=" + REGISTRATION_NO_BOX_3
				+ ", REGISTRATION_NO_BOX_4=" + REGISTRATION_NO_BOX_4 + ", ENGINE_NUMBER=" + ENGINE_NUMBER
				+ ", CHASIS_NUMBER=" + CHASIS_NUMBER + ", MODEL_YEAR=" + MODEL_YEAR + ", VEHICLE_MAKE=" + VEHICLE_MAKE
				+ ", VEHICLE_MODEL=" + VEHICLE_MODEL + ", VEHICLE_SPECIFICATION=" + VEHICLE_SPECIFICATION
				+ ", TYPE_OF_FUEL=" + TYPE_OF_FUEL + ", DATE_OF_REGISTRATION=" + DATE_OF_REGISTRATION
				+ ", TYPE_OF_MODIFICATION=" + TYPE_OF_MODIFICATION + ", RTA_CODE=" + RTA_CODE
				+ ", INCONVENIENCE_ALLOWANCE=" + INCONVENIENCE_ALLOWANCE + ", EMI_PROTECTOR=" + EMI_PROTECTOR
				+ ", EMI_AMOUNT=" + EMI_AMOUNT + ", EMI_DEDUCTIBLE_AMOUNT=" + EMI_DEDUCTIBLE_AMOUNT
				+ ", ENHANCED_PA_OWNER_DRIVER_SI=" + ENHANCED_PA_OWNER_DRIVER_SI + ", ENHANCED_PA__PAID_DRIVER_SI="
				+ ENHANCED_PA__PAID_DRIVER_SI + ", ENHANCED_PA_UN_NAMED_PASS_SI=" + ENHANCED_PA_UN_NAMED_PASS_SI
				+ ", ZONE=" + ZONE + ", EMERGENCY_MEDICAL_EXPENSE=" + EMERGENCY_MEDICAL_EXPENSE
				+ ", PRESENCE_OF_AIRBAGS=" + PRESENCE_OF_AIRBAGS + ", TYRE_AND_RIM_GUARD=" + TYRE_AND_RIM_GUARD
				+ ", TYRE_AND_RIM_GUARD_DED_AMOUNT=" + TYRE_AND_RIM_GUARD_DED_AMOUNT
				+ ", HOSPITAL_CASH_UN_NAMED_PASS_SI=" + HOSPITAL_CASH_UN_NAMED_PASS_SI
				+ ", HOSPITAL_CASH_PAID_DRIVER_SI=" + HOSPITAL_CASH_PAID_DRIVER_SI + ", HOSPITAL_CASH_OWNER_DRIVER_SI="
				+ HOSPITAL_CASH_OWNER_DRIVER_SI + ", DEPRECIATION_REIMBURSEMENT=" + DEPRECIATION_REIMBURSEMENT
				+ ", RETURN_TO_INVOICE=" + RETURN_TO_INVOICE + ", COVER_FOR_CONSUMABLES=" + COVER_FOR_CONSUMABLES
				+ ", ENGINE_GUARD=" + ENGINE_GUARD + ", KEY_REPLACEMENT_COVER=" + KEY_REPLACEMENT_COVER
				+ ", PROTECTION_OF_NCB=" + PROTECTION_OF_NCB + ", BASIC_ROAD_SIDE_ASSISTANCE="
				+ BASIC_ROAD_SIDE_ASSISTANCE + ", ADDITIONAL_ROADSIDE_ASSISTANCE=" + ADDITIONAL_ROADSIDE_ASSISTANCE
				+ ", LOSS_OF_PERSONAL_BELONGINGS=" + LOSS_OF_PERSONAL_BELONGINGS + ", LOSS_OF_PERSONAL_BELONGINGS_SI="
				+ LOSS_OF_PERSONAL_BELONGINGS_SI + ", RSA_VENDOR_NAME=" + RSA_VENDOR_NAME
				+ ", CPA_COVER_WAIVER_REQUIRED=" + CPA_COVER_WAIVER_REQUIRED + ", REASON_FOR_WAIVER="
				+ REASON_FOR_WAIVER + ", YEAR_OF_COVERAGE=" + YEAR_OF_COVERAGE + ", PARED=" + PARED + ", NOMINEE_NAME="
				+ NOMINEE_NAME + ", AGE=" + AGE + ", RELATIONSHIP_WITH_OWNER=" + RELATIONSHIP_WITH_OWNER
				+ ", NAME_OF_APPOINTEE=" + NAME_OF_APPOINTEE + ", APPOINTEE_RELATIONSHIP=" + APPOINTEE_RELATIONSHIP
				+ ", RISK_INCEPTION_DATE=" + RISK_INCEPTION_DATE + ", RISK_EXPIRY_DATE=" + RISK_EXPIRY_DATE
				+ ", RISK_INCEPTION_TIME=" + RISK_INCEPTION_TIME + ", RISK_EXPIRY_TIME=" + RISK_EXPIRY_TIME
				+ ", VEHICLE_COLOR=" + VEHICLE_COLOR + ", VEHICLE_AGE=" + VEHICLE_AGE + ", VEHICLE_IDV=" + VEHICLE_IDV
				+ ", ORIGINAL_IDV=" + ORIGINAL_IDV + ", IS_CNGLPG_EXTRA_FITTED=" + IS_CNGLPG_EXTRA_FITTED
				+ ", CNGLPG_KIT_IDV=" + CNGLPG_KIT_IDV + ", MULTIPLE_ACCESSORIES_PRESENT="
				+ MULTIPLE_ACCESSORIES_PRESENT + ", VALUE_OF_EXTRA_ELECTR_ELECTRON=" + VALUE_OF_EXTRA_ELECTR_ELECTRON
				+ ", VALUE_OF_EXTRA_NON_ELECTRICAL=" + VALUE_OF_EXTRA_NON_ELECTRICAL + ", IDV_OF_ACCESSORIES="
				+ IDV_OF_ACCESSORIES + ", TOTAL_IDV=" + TOTAL_IDV + ", IS_CAR_USED_DEMONSTRATION_PURP="
				+ IS_CAR_USED_DEMONSTRATION_PURP + ", IS_CAR_USED_DRIVING_TUITION_PU=" + IS_CAR_USED_DRIVING_TUITION_PU
				+ ", ROAD_TAX_AMOUNT=" + ROAD_TAX_AMOUNT + ", ADDITIONAL_TOWING_CHARGES=" + ADDITIONAL_TOWING_CHARGES
				+ ", EXTENSION_OF_GEOGRAPHICAL_IMT1=" + EXTENSION_OF_GEOGRAPHICAL_IMT1 + ", WHETHER_VINTAGE_CAR_IMT2="
				+ WHETHER_VINTAGE_CAR_IMT2 + ", MEMBER_AUTOMOBILE_ASSO_IMT8=" + MEMBER_AUTOMOBILE_ASSO_IMT8
				+ ", NAME_OF_ASSOCIATION=" + NAME_OF_ASSOCIATION + ", MEMBERSHIP_NO=" + MEMBERSHIP_NO
				+ ", IS_LIFE_MEMBER=" + IS_LIFE_MEMBER + ", DATE_OF_MEMBERSHIP_EXPIRY=" + DATE_OF_MEMBERSHIP_EXPIRY
				+ ", VEH_FIT_ANTITHEFT_DEVICE_IMT10=" + VEH_FIT_ANTITHEFT_DEVICE_IMT10
				+ ", DESIGNED_BLIND_HANDICAP_IMT12=" + DESIGNED_BLIND_HANDICAP_IMT12
				+ ", USE_LIMIT_TO_OWN_PREMISE_IMT13=" + USE_LIMIT_TO_OWN_PREMISE_IMT13 + ", PREMISE_ADDRESS="
				+ PREMISE_ADDRESS + ", PA_COVER_TO_NAMED_PERSON_IMT15=" + PA_COVER_TO_NAMED_PERSON_IMT15
				+ ", INDIVIDUAL_SI_FOR_IMT_15=" + INDIVIDUAL_SI_FOR_IMT_15 + ", NUMBER_OF_NAMED_PERSONS="
				+ NUMBER_OF_NAMED_PERSONS + ", PA_COVER_UNNAMED_PERSON_IMT16=" + PA_COVER_UNNAMED_PERSON_IMT16
				+ ", NO_OF_UNNAMED_PERSONS=" + NO_OF_UNNAMED_PERSONS + ", INDIVIDUAL_SI_FOR_IMT_16="
				+ INDIVIDUAL_SI_FOR_IMT_16 + ", PA_COVER_TO_PAID_DRIVERS_IMT17=" + PA_COVER_TO_PAID_DRIVERS_IMT17
				+ ", NO_OF_PAID_DRIVER_CLEA_CONDUCT=" + NO_OF_PAID_DRIVER_CLEA_CONDUCT + ", INDIVIDUAL_SI="
				+ INDIVIDUAL_SI + ", IMPORTED_WITHOUT_CUSTOM_IMT19=" + IMPORTED_WITHOUT_CUSTOM_IMT19
				+ ", TPPD_COVER_TO_THE_LIMIT_IMT20=" + TPPD_COVER_TO_THE_LIMIT_IMT20 + ", COMPULSARY_DEDUCTABLE_IMT22="
				+ COMPULSARY_DEDUCTABLE_IMT22 + ", VOLUNTARY_DEDUCTABLE_IMT22A=" + VOLUNTARY_DEDUCTABLE_IMT22A
				+ ", IMPOSED_EXCESS=" + IMPOSED_EXCESS + ", NO_OF_LL_TO_PAID_DRIVERIMT28="
				+ NO_OF_LL_TO_PAID_DRIVERIMT28 + ", NO_OF_LL_TO_EMPLOYEES_IMT29=" + NO_OF_LL_TO_EMPLOYEES_IMT29
				+ ", RALLY_TYPE_IMT31=" + RALLY_TYPE_IMT31 + ", ASSOCIATION_NAME=" + ASSOCIATION_NAME
				+ ", NO_OF_DAYS_FOR_RALLY_IMT31=" + NO_OF_DAYS_FOR_RALLY_IMT31 + ", START_DATE_OF_RALLY_IMT31="
				+ START_DATE_OF_RALLY_IMT31 + ", END_DATE_OF_RALLY_IMT31=" + END_DATE_OF_RALLY_IMT31
				+ ", RALLY_ADDITIONAL_EXCESS=" + RALLY_ADDITIONAL_EXCESS + ", ACCIDENT_SOLDIER_SAILOR_IMT32="
				+ ACCIDENT_SOLDIER_SAILOR_IMT32 + ", NO_OF_PERSONS_FOR_IMT_32=" + NO_OF_PERSONS_FOR_IMT_32
				+ ", TRAILERS_IDV=" + TRAILERS_IDV + ", ATTACHED_TRAILER_SI=" + ATTACHED_TRAILER_SI
				+ ", NUMBER_OF_TRAILERS=" + NUMBER_OF_TRAILERS + ", GO_SMART_FLEXI_APPLICABLE="
				+ GO_SMART_FLEXI_APPLICABLE + ", KILOMETER_BAND=" + KILOMETER_BAND + ", ACTUAL_KILOMETER="
				+ ACTUAL_KILOMETER + ", INSUREDINTEREST=" + INSUREDINTEREST + ", HELMET_PROTECTION_SI="
				+ HELMET_PROTECTION_SI + ", HELMET_PROTECTIONS=" + HELMET_PROTECTIONS + ", SIDE_CAR=" + SIDE_CAR
				+ ", SIDE_CAR_SUM_INSURED=" + SIDE_CAR_SUM_INSURED + ", BODY_STYLE_DESCRIPTION="
				+ BODY_STYLE_DESCRIPTION + ", BUILT_IN_LPG_KIT_IMT23=" + BUILT_IN_LPG_KIT_IMT23
				+ ", USED_PRIVATE_PURPOSE_IMT34=" + USED_PRIVATE_PURPOSE_IMT34 + ", PA_COVER_PILLION_RIDER_IMT16="
				+ PA_COVER_PILLION_RIDER_IMT16 + ", DRIVER_GENDER=" + DRIVER_GENDER + ", DRIVING_LICENCE_NUMBER="
				+ DRIVING_LICENCE_NUMBER + ", FIBRE_GLASS_TANK_UNIT=" + FIBRE_GLASS_TANK_UNIT + ", HORSE_POWER="
				+ HORSE_POWER + ", IMT_46_LL_TO_PASSENGERS=" + IMT_46_LL_TO_PASSENGERS + ", IMT44=" + IMT44 + ", IMT48="
				+ IMT48 + ", IMT49=" + IMT49 + ", IMT50=" + IMT50 + ", IMT51=" + IMT51 + ", IMT52=" + IMT52 + ", IMT53="
				+ IMT53 + ", IMT54=" + IMT54 + ", IMT55=" + IMT55 + ", INDEMNITY_TO_HIRER=" + INDEMNITY_TO_HIRER
				+ ", VEHICLE_USED_DRIVING_TUITION=" + VEHICLE_USED_DRIVING_TUITION + ", LL_TO_NFPP_EMP_OUTSIDEWC_IMT37="
				+ LL_TO_NFPP_EMP_OUTSIDEWC_IMT37 + ", LL_TO_NFPP_NOT_EMPLOYEE_IMT37A=" + LL_TO_NFPP_NOT_EMPLOYEE_IMT37A
				+ ", LOSS_OF_ACCESSORIES_IMT33=" + LOSS_OF_ACCESSORIES_IMT33 + ", SI_FOR_LOSS_OF_ACCESSORIES="
				+ SI_FOR_LOSS_OF_ACCESSORIES + ", NO_OF_LL_PD_CLEAN_CONDUC_IMT40=" + NO_OF_LL_PD_CLEAN_CONDUC_IMT40
				+ ", NO_OF_PERSON_EMPL_IMT39_IMT39A=" + NO_OF_PERSON_EMPL_IMT39_IMT39A
				+ ", PER_DAY_BENEFIT_LOSS_OF_INCOME=" + PER_DAY_BENEFIT_LOSS_OF_INCOME
				+ ", NUMBER_OF_DAY_F_LOSS_OF_INCOME=" + NUMBER_OF_DAY_F_LOSS_OF_INCOME + ", LOSS_OF_INCOME_DEDUCTIBLE="
				+ LOSS_OF_INCOME_DEDUCTIBLE + ", TYPE_OF_PERMIT=" + TYPE_OF_PERMIT + ", THEFT_AND_CONVERSION_IMT43="
				+ THEFT_AND_CONVERSION_IMT43 + ", OVER_TURNING_COVER=" + OVER_TURNING_COVER + ", PROPOSED_USAGE="
				+ PROPOSED_USAGE + ", DRIVING_LICENSE_EXPIRY_DATE=" + DRIVING_LICENSE_EXPIRY_DATE
				+ ", GEO_EXT_BANGLADESH=" + GEO_EXT_BANGLADESH + ", GEO_EXT_BHUTAN=" + GEO_EXT_BHUTAN
				+ ", GEO_EXT_MALDIVES=" + GEO_EXT_MALDIVES + ", GEO_EXT_NEPAL=" + GEO_EXT_NEPAL + ", GEO_EXT_PAKISTAN="
				+ GEO_EXT_PAKISTAN + ", GEO_EXT_SRILANKA=" + GEO_EXT_SRILANKA + ", TRGCOVER_TYRE1_MFYR="
				+ TRGCOVER_TYRE1_MFYR + ", TRGCOVER_TYRE1_SRNO=" + TRGCOVER_TYRE1_SRNO + ", TRGCOVER_TYRE2_MFYR="
				+ TRGCOVER_TYRE2_MFYR + ", TRGCOVER_TYRE2_SRNO=" + TRGCOVER_TYRE2_SRNO + ", TRGCOVER_TYRE3_MFYR="
				+ TRGCOVER_TYRE3_MFYR + ", TRGCOVER_TYRE3_SRNO=" + TRGCOVER_TYRE3_SRNO + ", TRGCOVER_TYRE4_MFYR="
				+ TRGCOVER_TYRE4_MFYR + ", TRGCOVER_TYRE4_SRNO=" + TRGCOVER_TYRE4_SRNO + ", TRAILER_REG_NO="
				+ TRAILER_REG_NO + ", TRAILER_CHASSIS_NO=" + TRAILER_CHASSIS_NO + ", TRAILER_YEAR_OF_MANF="
				+ TRAILER_YEAR_OF_MANF + ", MULTI_ELE_ITEM_DESC=" + MULTI_ELE_ITEM_DESC + ", MULTI_ELE_IDV="
				+ MULTI_ELE_IDV + ", MULTI_ELE_ACCESS_DESC=" + MULTI_ELE_ACCESS_DESC + ", MULTI_NON_ELE_ITEM_DESC="
				+ MULTI_NON_ELE_ITEM_DESC + ", MULTI_NON_ELE_IDV=" + MULTI_NON_ELE_IDV + ", MULTI_NON_ELE_ACCESS_DESC="
				+ MULTI_NON_ELE_ACCESS_DESC + ", ELCTRICELECTRNICACCS=" + ELCTRICELECTRNICACCS + ", TOWINGCHARG="
				+ TOWINGCHARG + ", HOSPODCOVER=" + HOSPODCOVER + ", ENGINEGUARD=" + ENGINEGUARD
				+ ", INCONVENIENCECOVER=" + INCONVENIENCECOVER + ", NMDPAPRACPDDRVCL=" + NMDPAPRACPDDRVCL
				+ ", PASOLDRSSAILORSAIRMN=" + PASOLDRSSAILORSAIRMN + ", ENHANCEDPAOD=" + ENHANCEDPAOD
				+ ", BASICROADSIDE=" + BASICROADSIDE + ", BASICOD=" + BASICOD + ", MEDICALEXPENSES=" + MEDICALEXPENSES
				+ ", LLTOEMPLOYEE=" + LLTOEMPLOYEE + ", UNPAPRACPDDRVCLN=" + UNPAPRACPDDRVCLN + ", VEXTENSIONRCSPTP="
				+ VEXTENSIONRCSPTP + ", EMIPROTECTIONCOVER=" + EMIPROTECTIONCOVER + ", ENHANCEDUNNAMED="
				+ ENHANCEDUNNAMED + ", CPACOVER=" + CPACOVER + ", VKEYREPLACEMENTCOV=" + VKEYREPLACEMENTCOV
				+ ", TRAILERSOD=" + TRAILERSOD + ", RETINVOCOVER=" + RETINVOCOVER + ", RTRODCOVER=" + RTRODCOVER
				+ ", TRGCOVER=" + TRGCOVER + ", EXTENSIONGEOTP=" + EXTENSIONGEOTP + ", NONELECTRICALACSRYOD="
				+ NONELECTRICALACSRYOD + ", BASICTP=" + BASICTP + ", EXTERNALLYLPGCNG=" + EXTERNALLYLPGCNG
				+ ", GEOAREAOD=" + GEOAREAOD + ", VEXTENSIONOD=" + VEXTENSIONOD + ", CONSUMABLECOV=" + CONSUMABLECOV
				+ ", CNGLPGBIFUELTP=" + CNGLPGBIFUELTP + ", LLTOPAIDDRIVER=" + LLTOPAIDDRIVER + ", VEHICLESIMPORTED="
				+ VEHICLESIMPORTED + ", PRSNLACDNCVPDDRVCLN=" + PRSNLACDNCVPDDRVCLN + ", INBUILTCNGLPG=" + INBUILTCNGLPG
				+ ", ADDROADSIDE=" + ADDROADSIDE + ", VVNCBCOVER=" + VVNCBCOVER + ", LOSSOFPERSONAL=" + LOSSOFPERSONAL
				+ ", VDRIVINGTUITIONS=" + VDRIVINGTUITIONS + ", HOSPUPCOVER=" + HOSPUPCOVER + ", TRAILERSTP="
				+ TRAILERSTP + ", FIBREGLASSFUELTANK=" + FIBREGLASSFUELTANK + ", ENHANCEDPAPD=" + ENHANCEDPAPD
				+ ", DEPRECIATIONREIM=" + DEPRECIATIONREIM + ", RTRTPCOVER=" + RTRTPCOVER + ", HOSPPDCOVER="
				+ HOSPPDCOVER + ", GEOGRAPHICALTP=" + GEOGRAPHICALTP + ", RTRCOVER=" + RTRCOVER + ", CONSUMABLESCOVER="
				+ CONSUMABLESCOVER + ", HELMETPROT=" + HELMETPROT + ", PRONCBCOVER=" + PRONCBCOVER + ", MEDICALEXPENSE="
				+ MEDICALEXPENSE + ", INSUREDPA=" + INSUREDPA + ", UNNAMEDPA=" + UNNAMEDPA + ", LLPAIDDRIVER="
				+ LLPAIDDRIVER + ", LLEMPLOYEES=" + LLEMPLOYEES + ", RTRTPCOVERMASTER=" + RTRTPCOVERMASTER
				+ ", TYRERIMCOVER=" + TYRERIMCOVER + ", INCONVENIENCEMASTER=" + INCONVENIENCEMASTER + ", SCCOVER="
				+ SCCOVER + ", EXTERNALLYCNGLPG=" + EXTERNALLYCNGLPG + ", DRIVINGTUTIONS=" + DRIVINGTUTIONS
				+ ", EXTENSIONOD=" + EXTENSIONOD + ", EXTENSTIONTP=" + EXTENSTIONTP + ", ACCESSORIESLOSS="
				+ ACCESSORIESLOSS + ", CNGLPGTP=" + CNGLPGTP + ", FIBREGLASS=" + FIBREGLASS + ", IMT44OD=" + IMT44OD
				+ ", IMT37A=" + IMT37A + ", IMT43=" + IMT43 + ", IMT44TP=" + IMT44TP + ", YPCOMMERCIALPVT="
				+ YPCOMMERCIALPVT + ", PATOPAIDCLNCON=" + PATOPAIDCLNCON + ", HOSPITALCASHOD=" + HOSPITALCASHOD
				+ ", IMT37=" + IMT37 + ", ENHANCEPAOD=" + ENHANCEPAOD + ", RETURNTOINVOICE=" + RETURNTOINVOICE
				+ ", LOSSOFINCOME=" + LOSSOFINCOME + ", ENHANCEPAPD=" + ENHANCEPAPD + ", ADDTOWINGCHARGE="
				+ ADDTOWINGCHARGE + ", IMT23=" + IMT23 + ", EMIPROTECTOR=" + EMIPROTECTOR + ", ODCOMMERCIALPRIVATE="
				+ ODCOMMERCIALPRIVATE + ", IMT40=" + IMT40 + ", HOSPITALCASHPD=" + HOSPITALCASHPD
				+ ", NONELECTRICALACCES=" + NONELECTRICALACCES + ", FIBREGLASSTANK=" + FIBREGLASSTANK
				+ ", VEHICLEIMPORT=" + VEHICLEIMPORT + ", EXTNGEOOD=" + EXTNGEOOD + ", BIFUELCNGLPGOD=" + BIFUELCNGLPGOD
				+ ", INBUILTCNGLPGOD=" + INBUILTCNGLPGOD + ", DEPREIMBURSEMENT=" + DEPREIMBURSEMENT
				+ ", ZDRIVINGTUITIONS=" + ZDRIVINGTUITIONS + ", PROTECTIONOFNCB=" + PROTECTIONOFNCB
				+ ", KEYREPLACEMENTCOV=" + KEYREPLACEMENTCOV + ", IMT39A=" + IMT39A + ", LLTOEMPLOYED=" + LLTOEMPLOYED
				+ ", IMT39=" + IMT39 + ", ODIMT23=" + ODIMT23 + ", IMT47=" + IMT47 + ", IMT46=" + IMT46
				+ ", PARTY_TYPE=" + PARTY_TYPE + ", FIRST_NAME=" + FIRST_NAME + ", MIDDLE_NAME=" + MIDDLE_NAME
				+ ", LAST_NAME=" + LAST_NAME + ", SEX=" + SEX + ", NATIONALITY=" + NATIONALITY + ", OCCUPATION="
				+ OCCUPATION + ", COMPANY_NAME=" + COMPANY_NAME + ", DATE_OF_BIRTH=" + DATE_OF_BIRTH + ", SALUTATION="
				+ SALUTATION + ", PROPOSER_PAN=" + PROPOSER_PAN + ", PROPOSER_CKYC_NO=" + PROPOSER_CKYC_NO
				+ ", ADDRESS1=" + ADDRESS1 + ", ADDRESS2=" + ADDRESS2 + ", ADDRESS3=" + ADDRESS3 + ", PINCODE="
				+ PINCODE + ", TELEPHONE_NO=" + TELEPHONE_NO + ", MOBILE_NO=" + MOBILE_NO + ", WHATSAPP_NO="
				+ WHATSAPP_NO + ", EMAIL=" + EMAIL + ", EMAIL1=" + EMAIL1 + ", COL_BANK_BRANCH=" + COL_BANK_BRANCH
				+ ", COL_BANK_NAME=" + COL_BANK_NAME + ", AMOUNT=" + AMOUNT + ", COL_TYPE=" + COL_TYPE
				+ ", RECIEPT_NUM=" + RECIEPT_NUM + ", CD_ACCOUNT_NO=" + CD_ACCOUNT_NO + ", SOA_TRANSACTIONID="
				+ SOA_TRANSACTIONID + ", PAYER_TYPE=" + PAYER_TYPE + ", CHANNEL_NAME=" + CHANNEL_NAME
				+ ", SUB_CHANNEL_NAME=" + SUB_CHANNEL_NAME + ", INSTRUMENTNUMBER=" + INSTRUMENTNUMBER + ", COL_DATE="
				+ COL_DATE + ", COL_RECIEVED_DATE=" + COL_RECIEVED_DATE + ", OEM_PREMIUM_AMOUNT=" + OEM_PREMIUM_AMOUNT
				+ ", FINANCIER_NAME=" + FINANCIER_NAME + ", FINANCIER_BRANCH=" + FINANCIER_BRANCH
				+ ", FINANCIER_AGGREMENT_TYPE=" + FINANCIER_AGGREMENT_TYPE + ", FINANCER_LOAN_ACC_NO="
				+ FINANCER_LOAN_ACC_NO + ", PREV_INSURANCE_COMPANY_ADDRESS=" + PREV_INSURANCE_COMPANY_ADDRESS
				+ ", CLAIM1_YEAR=" + CLAIM1_YEAR + ", CLAIM1_LOSS_DATE=" + CLAIM1_LOSS_DATE + ", CLAIM1_AMOUNT="
				+ CLAIM1_AMOUNT + ", CLAIM1_TYPE=" + CLAIM1_TYPE + ", DATE_OF_INCORPORATION=" + DATE_OF_INCORPORATION
				+ ", GSTN_NUMBER=" + GSTN_NUMBER + ", GSTN_STATE_CODE=" + GSTN_STATE_CODE + ", MISC_1=" + MISC_1
				+ ", MISC_2=" + MISC_2 + ", MISC_3=" + MISC_3 + ", MISC_4=" + MISC_4 + ", MISC_5=" + MISC_5
				+ ", MISC_6=" + MISC_6 + ", MISC_7=" + MISC_7 + ", MISC_8=" + MISC_8 + ", MISC_9=" + MISC_9
				+ ", MISC_10=" + MISC_10 + "]";
	}  

	 
	 
	 
	 
	 
 
} 

