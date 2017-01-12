package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class AmcReqHst extends AmcReqHstKey {
    private String channelId;

    private String cardNo;

    private String b003;

    private String refNbr;

    private String b039;

    private String respDesc;

    private String origData;

    private String msgContent;

    private Date createdDatetime;

    private Date lastModifiedDatetime;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getB003() {
        return b003;
    }

    public void setB003(String b003) {
        this.b003 = b003 == null ? null : b003.trim();
    }

    public String getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(String refNbr) {
        this.refNbr = refNbr == null ? null : refNbr.trim();
    }

    public String getB039() {
        return b039;
    }

    public void setB039(String b039) {
        this.b039 = b039 == null ? null : b039.trim();
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc == null ? null : respDesc.trim();
    }

    public String getOrigData() {
        return origData;
    }

    public void setOrigData(String origData) {
        this.origData = origData == null ? null : origData.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
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

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}