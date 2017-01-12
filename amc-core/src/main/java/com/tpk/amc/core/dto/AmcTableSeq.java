package com.tpk.amc.core.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AmcTableSeq {
    private String tableName;

    private Long seqVal;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Long getSeqVal() {
        return seqVal;
    }

    public void setSeqVal(Long seqVal) {
        this.seqVal = seqVal;
    }

    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this);
        } catch (Exception var2) {
            return super.toString();
        }
    }
}