package com.sbigeneral.BTMS.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sbigeneral.BTMS.model.BirthdayWiseReportModel;
import com.sbigeneral.BTMS.model.BussinessSummarryReport;
import com.sbigeneral.BTMS.model.DashboardCurrentMonthReport;
import com.sbigeneral.BTMS.model.RenewalPolicyDetails;
import com.sbigeneral.BTMS.model.RenewalRmsReport;

public interface DashboardRenewalReportService {
	
	
	public List<DashboardCurrentMonthReport> FetchCurrentMonthDashBoardReport(String agrement);
	public List<BussinessSummarryReport> FetchdashboradSummaryReport(String agrement);
	public List<BirthdayWiseReportModel> FetchBirthdayWiseReport(String agrement);
	public List<RenewalRmsReport> FetchPolicyDetails(String byKey,String byValue,String agent_code);
	

}
