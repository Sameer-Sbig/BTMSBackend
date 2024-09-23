package com.sbigeneral.BTMS.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbigeneral.BTMS.Entity.MisReport;
import com.sbigeneral.BTMS.Repository.PolicyDetailsRepository;

@Service
public class MisReportService {


    @Autowired
    private PolicyDetailsRepository policyDetailsRepository;
    
    public List<MisReport> getPolicyDetails() {
        return policyDetailsRepository.getPolicyDetails();
    }
}
