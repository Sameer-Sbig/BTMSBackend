package com.sbigeneral.BTMS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sbigeneral.BTMS.Entity.AgreementCodeEntity;
import com.sbigeneral.BTMS.Entity.User;


public interface UserService {
	
	public String SaveEmployeDetails(User user);
	public User findByAgrementCode(String agreementCode);
	public List<AgreementCodeEntity> checkAgrementCodeExistOrNot(String agreementCode);
	
	public User FindByUserName(String username);
	
	public void UpdatePassword(String username,String password)throws Exception;
	public void savePasswordFlag(String agreementcode);


}
