package com.sbigeneral.BTMS.Service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sbigeneral.BTMS.Entity.CustomMisReport;
import com.sbigeneral.BTMS.Entity.MisReport;
import com.sbigeneral.BTMS.Entity.OemReport;
import com.sbigeneral.BTMS.Entity.PinDetails;

@Service
public interface ApiService {
    public ResponseEntity<String>  getReport(String employeeId);

    public ResponseEntity<Map<String, List<PinDetails>>> getByPinDetails(String pinNumber);
    public String getLoginImage();
    
    public List<MisReport> getCustomReport(CustomMisReport object);
    
    public List<OemReport> getOemReport();
}
