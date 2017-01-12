package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class AmcSystemStatus {
    private Integer statusId;

    private Date businessDate;

    private Date processDate;

    private Date lastProcessDate;

    private Date graceTime;

    private Date mtnDate;

    private Integer jpaVersion;

    private String autoFlag;

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public Date getLastProcessDate() {
        return lastProcessDate;
    }

    public void setLastProcessDate(Date lastProcessDate) {
        this.lastProcessDate = lastProcessDate;
    }

    public Date getGraceTime() {
        return graceTime;
    }

    public void setGraceTime(Date graceTime) {
        this.graceTime = graceTime;
    }

    public Date getMtnDate() {
        return mtnDate;
    }

    public void setMtnDate(Date mtnDate) {
        this.mtnDate = mtnDate;
    }

    public Integer getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(Integer jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    public String getAutoFlag() {
        return autoFlag;
    }

    public void setAutoFlag(String autoFlag) {
        this.autoFlag = autoFlag == null ? null : autoFlag.trim();
    }

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}