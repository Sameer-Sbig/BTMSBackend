package com.sbigeneral.BTMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sbigeneral.BTMS.Entity.UserPolicyDetails;

public interface UserPolicyDetailsRepo extends JpaRepository<UserPolicyDetails, String> {
    
    @Query("SELECT u FROM UserPolicyDetails u WHERE u.OEM_POLICY_NUMBER = :OEM_POLICY_NUMBER")
    public UserPolicyDetails fetchDetails(@Param("OEM_POLICY_NUMBER") String OEM_POLICY_NUMBER);
}
