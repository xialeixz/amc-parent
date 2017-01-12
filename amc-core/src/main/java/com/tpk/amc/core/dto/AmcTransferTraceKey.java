package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AmcTransferTraceKey {
    private String sysTransId;

    private String consumerTransId;

    public String getSysTransId() {
        return sysTransId;
    }

    public void setSysTransId(String sysTransId) {
        this.sysTransId = sysTransId == null ? null : sysTransId.trim();
    }

    public String getConsumerTransId() {
        return consumerTransId;
    }

    public void setConsumerTransId(String consumerTransId) {
        this.consumerTransId = consumerTransId == null ? null : consumerTransId.trim();
    }

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}