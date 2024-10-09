package com.sbigeneral.BTMS.Service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sbigeneral.BTMS.Entity.CustomDate;
import com.sbigeneral.BTMS.Entity.CustomMisReport;
import com.sbigeneral.BTMS.Entity.FailedCases;
import com.sbigeneral.BTMS.Entity.MisReport;
import com.sbigeneral.BTMS.Entity.OemReport;
import com.sbigeneral.BTMS.Entity.PinDetails;
import com.sbigeneral.BTMS.Entity.PolicyDetails;
import com.sbigeneral.BTMS.Entity.SuccessCases;
import com.sbigeneral.BTMS.Entity.UserPolicyDetails;

@Service
public interface ApiService {
    public ResponseEntity<String>  getReport(String employeeId);

    public ResponseEntity<Map<String, List<PinDetails>>> getByPinDetails(String pinNumber);
    public String getLoginImage();
    
    public List<MisReport> getCustomReport(CustomMisReport object);
    
    public List<OemReport> getOemReport();
    
    public List<FailedCases> getFailedCases(CustomDate object);
    
    public List<SuccessCases> getSuccessCases(CustomDate object);
    
    public List<FailedCases> getAllCases(CustomDate object);
    
    public UserPolicyDetails getAllPolicyDetails(String policyNumber);
    
    
}
