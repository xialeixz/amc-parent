package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.Date;

public class AmcAccount extends AmcAccountKey {
    private String org;

    private Long custId;

    private Long custLimitId;

    private String productCd;

    private String defaultLogicalCardNo;

    private String currCd;

    private Long creditLimit;

    private BigDecimal currBal;

    private String email;

    private String mobileNo;

    private Date createdDatetime;

    private Date lastModifiedDatetime;

    private String blockCode;

    private Date lockDate;

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getCustLimitId() {
        return custLimitId;
    }

    public void setCustLimitId(Long custLimitId) {
        this.custLimitId = custLimitId;
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd == null ? null : productCd.trim();
    }

    public String getDefaultLogicalCardNo() {
        return defaultLogicalCardNo;
    }

    public void setDefaultLogicalCardNo(String defaultLogicalCardNo) {
        this.defaultLogicalCardNo = defaultLogicalCardNo == null ? null : defaultLogicalCardNo.trim();
    }

    public String getCurrCd() {
        return currCd;
    }

    public void setCurrCd(String currCd) {
        this.currCd = currCd == null ? null : currCd.trim();
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCurrBal() {
        return currBal;
    }

    public void setCurrBal(BigDecimal currBal) {
        this.currBal = currBal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getLastModifiedDatetime() {
        return lastModifiedDatetime;
    }

    public void setLastModifiedDatetime(Date lastModifiedDatetime) {
        this.lastModifiedDatetime = lastModifiedDatetime;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode == null ? null : blockCode.trim();
    }

    public Date getLockDate() {
        return lockDate;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}