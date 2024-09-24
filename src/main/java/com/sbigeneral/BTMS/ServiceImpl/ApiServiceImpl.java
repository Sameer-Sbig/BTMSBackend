package com.sbigeneral.BTMS.ServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sbigeneral.BTMS.Controller.loginController;
import com.sbigeneral.BTMS.Entity.CustomMisReport;
import com.sbigeneral.BTMS.Entity.MisReport;
import com.sbigeneral.BTMS.Entity.OemReport;
import com.sbigeneral.BTMS.Entity.PinDetails;
import com.sbigeneral.BTMS.Service.ApiService;

@Service
public class ApiServiceImpl implements ApiService {

	private static final Logger logger = LogManager.getLogger(loginController.class);
	@Autowired
	private DataSource dataSource;

	private static RestTemplate restTemplate = new RestTemplate();

	@Override
	public ResponseEntity<String> getReport(String employeeId) {

		try {
			String API_URL = "https://dil.sbigen.in/services/PINModule/fetchPINDetails/v1";
			String decision = "Extra KM Requested|Extra KM Approved|Case Recommend|Case Reject";

			String encodedDecision = URLEncoder.encode(decision, "UTF-8");
			String apiUrl = API_URL + "?VendorCode=" + employeeId + "&Decision=" + encodedDecision;

//		       String apiUrl = "https://uat-dil.sbigen.in/services/PINModule/fetchPINDetails/v1?VendorCode=V003&Decision=Extra%20KM%20Requested|Extra%20KM%20Approved|Case%20Recommend|Case%20Reject";
			logger.info("API URL: {}", apiUrl);
			System.out.println(apiUrl);

			// URL url = new URL(apiUrl);
			URL url = new URL(apiUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuilder response = new StringBuilder();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				logger.debug("Response Body: {}", response.toString());
				return ResponseEntity.ok(response.toString());
			} else {
				logger.error("Failed to fetch report. Response Code: {}", responseCode);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to fetch report");
			}

		} catch (Exception e) {
			logger.error("Error in PIN survey getReport: {}", e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to fetch report");
		}
	}

	@Override
	public ResponseEntity<Map<String, List<PinDetails>>> getByPinDetails(String pinNumber) {
		// TODO Auto-generated method stub
		logger.info("Response of getByPinDetails method in PIN details {}", pinNumber);
		System.out.println(pinNumber);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		Class<Map<String, List<PinDetails>>> responseType = (Class<Map<String, List<PinDetails>>>) (Class<?>) Map.class;

		String apiUrl = "https://dil.sbigen.in:443/services/PINModule/fetchPINDetails/v1?PINNumber=" + pinNumber;
		System.out.println(apiUrl);

		ResponseEntity<Map<String, List<PinDetails>>> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET,
				null, responseType);
		System.out.println(responseEntity.getBody());
		logger.info("Response of getByPinDetails method in PIN details {}", responseEntity.getBody());

		return responseEntity.ok(responseEntity.getBody());

	}

	@Override
	public String getLoginImage() {
////		/u02/Oracle/Middleware/Oracle_Home/user_projects/domains/base_domain

		// uat path ==
		// /u02/Oracle/Middleware/Oracle_Home/user_projects/domains/base_domain
		// prod path =
		// /u01/Oracle/Middleware/Oracle_Home/user_projects/domains/base_domain/Sameer/
		String loginPage = "";
		try {
			System.out.println();
			loginPage = new String(Files.readAllBytes(Paths
					.get("/u01/Oracle/Middleware/Oracle_Home/user_projects/domains/base_domain/Sameer/login.txt")));
			System.out.println(loginPage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginPage;
	}

	@Override
	public List<MisReport> getCustomReport(CustomMisReport object) {
	    List<MisReport> results = new ArrayList<>();

	    String sql = "SELECT OT.POLICY_NO, CMD.BANCS_POLICYID, AT.POLICY_HOLDER, AT.POLICY_HOLDER_NAME, " +
	                 "OT.REGISTRATIONNO, AT.SUB_CHANNEL_NAME, AT.DEALER_CODE, AT.SUB_CHANNEL2, AT.AGREEMENT_CODE, " +
	                 "AT.COL_TYPE, AT.OEM_PREMIUM_AMOUNT, CMD.SOA_STATUS, CMD.ERROR " +
	                 "FROM SOA_OEM.OEM_TATAPV OT " +
	                 "JOIN SOA_OEM.OEM_SOA_RECORD_CMD CMD ON OT.POLICY_NO = CMD.OEM_POLICY_NUMBER " +
	                 "JOIN SOA_OEM.OEM_CMD_ALL_TABLE AT ON AT.OEM_POLICY_NUMBER = CMD.OEM_POLICY_NUMBER " +
	                 "WHERE TO_CHAR(CMD.CREATION_TIME, 'dd-mon-yyyy') BETWEEN ? AND ?";

	    if (object.getOemName() != null && !object.getOemName().isEmpty()) {
	        sql += " AND AT.OEM_NAME = ?";
	    }

	    try (Connection conn = dataSource.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, object.getStartDate());
	        ps.setString(2, object.getEndDate());

	        if (object.getOemName() != null && !object.getOemName().isEmpty()) {
	            ps.setString(3, object.getOemName());
	        }

	        try (ResultSet rs = ps.executeQuery()) {
	            while (rs.next()) {
	                MisReport report = new MisReport();
	                report.setPOLICY_NO(rs.getString("POLICY_NO"));
	                report.setBANCS_POLICYID(rs.getString("BANCS_POLICYID"));
	                report.setPOLICY_HOLDER(rs.getString("POLICY_HOLDER"));
	                report.setPOLICY_HOLDER_NAME(rs.getString("POLICY_HOLDER_NAME"));
	                report.setREGISTRATIONNO(rs.getString("REGISTRATIONNO"));
	                report.setSUB_CHANNEL_NAME(rs.getString("SUB_CHANNEL_NAME"));
	                report.setDEALER_CODE(rs.getString("DEALER_CODE"));
	                report.setSUB_CHANNEL2(rs.getString("SUB_CHANNEL2"));
	                report.setAGREEMENT_CODE(rs.getString("AGREEMENT_CODE"));
	                report.setCOL_TYPE(rs.getString("COL_TYPE"));
	                report.setOEM_PREMIUM_AMOUNT(rs.getString("OEM_PREMIUM_AMOUNT"));
	                report.setSOA_STATUS(rs.getString("SOA_STATUS"));
	                report.setERROR(rs.getString("ERROR"));
	                results.add(report);
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return results;
	}

	@Override
	public List<OemReport> getOemReport() {
		
		 List<OemReport> reports = new ArrayList<>();

	        String query = "SELECT to_char(CMD.CREATION_TIME,'dd-mon-yyyy') as Created_on, " +
	                       "Count(AT.SOA_TRANSACTIONID) as Total_Policy, " +
	                       "COUNT(CASE WHEN CMD.SOA_STATUS = 'ISSUEPOLICY_STAGE_COMPLETED' THEN 1 END) as success, " +
	                       "COUNT(CASE WHEN CMD.SOA_STATUS IN ('COLLECTION_STAGE_COMPLETED', 'PROPOSAL_STAGE_COMPLETED', 'Insert to common DB', " +
	                       "'PARTY_STAGE_COMPLETED', 'ISSUEQUOTE_STAGE_COMPLETED', 'PARTY_STAGE_FAILED', 'PROPOSAL_STAGE_FAILED', null) THEN 1 END) as Fail " +
	                       "FROM SOA_OEM.OEM_TATAPV OT " +
	                       "JOIN SOA_OEM.OEM_SOA_RECORD_CMD CMD ON OT.POLICY_NO = CMD.OEM_POLICY_NUMBER " +
	                       "JOIN SOA_OEM.OEM_CMD_ALL_TABLE AT ON AT.OEM_POLICY_NUMBER = CMD.OEM_POLICY_NUMBER " +
	                       "WHERE to_char(CMD.CREATION_TIME, 'dd-mon-yyyy') BETWEEN '01-09-2024' AND '30-09-2024' " +
	                       "GROUP BY CMD.CREATION_TIME";

	        try (Connection conn = dataSource.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(query);
	             ResultSet rs = stmt.executeQuery()) {

	            while (rs.next()) {
	                OemReport report = new OemReport();
	                report.setCreatedOn(rs.getString("Created_on"));
	                report.setTotalPolicy(rs.getString("Total_Policy"));
	                report.setSuccess(rs.getString("success"));
	                report.setFail(rs.getString("Fail"));
	                reports.add(report);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return reports;
	}

	
    
	}
	


