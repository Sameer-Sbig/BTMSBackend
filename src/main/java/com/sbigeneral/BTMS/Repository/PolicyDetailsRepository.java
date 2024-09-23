package com.sbigeneral.BTMS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbigeneral.BTMS.Entity.MisReport;

@Repository
public interface PolicyDetailsRepository extends CrudRepository<MisReport, Long> {

    @Query(value = "SELECT OT.POLICY_NO, CMD.BANCS_POLICYID, AT.POLICY_HOLDER, AT.POLICY_HOLDER_NAME, OT.REGISTRATIONNO, " +
                   "AT.SUB_CHANNEL_NAME, AT.DEALER_CODE, AT.SUB_CHANNEL2, AT.AGREEMENT_CODE, AT.COL_TYPE, " +
                   "AT.OEM_PREMIUM_AMOUNT, CMD.SOA_STATUS, CMD.ERROR " +
                   "FROM SOA_OEM.OEM_TATAPV OT " +
                   "JOIN SOA_OEM.OEM_SOA_RECORD_CMD CMD ON OT.POLICY_NO = CMD.OEM_POLICY_NUMBER " +
                   "JOIN SOA_OEM.OEM_CMD_ALL_TABLE AT ON AT.OEM_POLICY_NUMBER = CMD.OEM_POLICY_NUMBER", nativeQuery = true)
    List<MisReport> getPolicyDetails();
}