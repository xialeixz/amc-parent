package com.tpk.amc.service.api;

import com.tpk.amc.service.api.protocol.DemoReq;
import com.tpk.amc.service.api.protocol.DemoResp;

/**
 * Created by jasonxxia on 2017/1/11.
 */
public interface DemoApi {
    public void set();

    public DemoResp get(DemoReq req);
}