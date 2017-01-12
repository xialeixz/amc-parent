package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class AmcTransferTrace extends AmcTransferTraceKey {
    private String transferType;

    private Date bizDate;

    private String org;

    private String productCd;

    private String cardNo;

    private String acctType;

    private Long acctNo;

    private String transferTime;

    private String transferStatus;

    private String transferDesc;

    private String payerAcct;

    private String payerName;

    private String payerBrno;

    private String payerBrname;

    private String payeeAcct;

    private String payeeName;

    private String payeeBrno;

    private String payeeBrname;

    private String amt;

    private String fee;

    private String b003;

    private String tranDateTime;

    private String refNbr;

    private String tranCurrCode;

    private Date postDate;

    private String rtncd;

    private String rtninf;

    private Date lastModifiedDatetime;

    private String payRouteCode;

    private String workDate;

    private String reconCode;

    private String targetDcn;

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType == null ? null : transferType.trim();
    }

    public Date getBizDate() {
        return bizDate;
    }

    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd == null ? null : productCd.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long acctNo) {
        this.acctNo = acctNo;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime == null ? null : transferTime.trim();
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus == null ? null : transferStatus.trim();
    }

    public String getTransferDesc() {
        return transferDesc;
    }

    public void setTransferDesc(String transferDesc) {
        this.transferDesc = transferDesc == null ? null : transferDesc.trim();
    }

    public String getPayerAcct() {
        return payerAcct;
    }

    public void setPayerAcct(String payerAcct) {
        this.payerAcct = payerAcct == null ? null : payerAcct.trim();
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    public String getPayerBrno() {
        return payerBrno;
    }

    public void setPayerBrno(String payerBrno) {
        this.payerBrno = payerBrno == null ? null : payerBrno.trim();
    }

    public String getPayerBrname() {
        return payerBrname;
    }

    public void setPayerBrname(String payerBrname) {
        this.payerBrname = payerBrname == null ? null : payerBrname.trim();
    }

    public String getPayeeAcct() {
        return payeeAcct;
    }

    public void setPayeeAcct(String payeeAcct) {
        this.payeeAcct = payeeAcct == null ? null : payeeAcct.trim();
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    public String getPayeeBrno() {
        return payeeBrno;
    }

    public void setPayeeBrno(String payeeBrno) {
        this.payeeBrno = payeeBrno == null ? null : payeeBrno.trim();
    }

    public String getPayeeBrname() {
        return payeeBrname;
    }

    public void setPayeeBrname(String payeeBrname) {
        this.payeeBrname = payeeBrname == null ? null : payeeBrname.trim();
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt == null ? null : amt.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getB003() {
        return b003;
    }

    public void setB003(String b003) {
        this.b003 = b003 == null ? null : b003.trim();
    }

    public String getTranDateTime() {
        return tranDateTime;
    }

    public void setTranDateTime(String tranDateTime) {
        this.tranDateTime = tranDateTime == null ? null : tranDateTime.trim();
    }

    public String getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(String refNbr) {
        this.refNbr = refNbr == null ? null : refNbr.trim();
    }

    public String getTranCurrCode() {
        return tranCurrCode;
    }

    public void setTranCurrCode(String tranCurrCode) {
        this.tranCurrCode = tranCurrCode == null ? null : tranCurrCode.trim();
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getRtncd() {
        return rtncd;
    }

    public void setRtncd(String rtncd) {
        this.rtncd = rtncd == null ? null : rtncd.trim();
    }

    public String getRtninf() {
        return rtninf;
    }

    public void setRtninf(String rtninf) {
        this.rtninf = rtninf == null ? null : rtninf.trim();
    }

    public Date getLastModifiedDatetime() {
        return lastModifiedDatetime;
    }

    public void setLastModifiedDatetime(Date lastModifiedDatetime) {
        this.lastModifiedDatetime = lastModifiedDatetime;
    }

    public String getPayRouteCode() {
        return payRouteCode;
    }

    public void setPayRouteCode(String payRouteCode) {
        this.payRouteCode = payRouteCode == null ? null : payRouteCode.trim();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    public String getReconCode() {
        return reconCode;
    }

    public void setReconCode(String reconCode) {
        this.reconCode = reconCode == null ? null : reconCode.trim();
    }

    public String getTargetDcn() {
        return targetDcn;
    }

    public void setTargetDcn(String targetDcn) {
        this.targetDcn = targetDcn == null ? null : targetDcn.trim();
    }

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}