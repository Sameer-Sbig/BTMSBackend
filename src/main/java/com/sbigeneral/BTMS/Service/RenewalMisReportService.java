package com.sbigeneral.BTMS.Service;

import java.util.List;

import com.sbigeneral.BTMS.model.RenewalMisReport;
import com.sbigeneral.BTMS.model.RenewalRmsModel;
import com.sbigeneral.BTMS.model.RenewalRmsReport;

public interface RenewalMisReportService {

	
	public List<RenewalMisReport> fetchRenewalMisReport(RenewalRmsModel renewalRmsModel);
}
