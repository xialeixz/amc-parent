package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AmcAccountKey {
    private Long acctNo;

    private String acctType;

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long acctNo) {
        this.acctNo = acctNo;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}