package com.tpk.amc.param.def;

/**
 * Created by jasonxxia on 2016/12/28.
 */
public enum AMCCode {
    D000("交易成功"),
    S001("交易异常");

    private AMCCode(String desc){
        this.setDesc(desc);
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
