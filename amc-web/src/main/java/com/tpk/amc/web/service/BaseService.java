package com.tpk.amc.web.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by jasonxxia on 2016/12/28.
 */
public interface BaseService {
    public Map<String, Object> proc(JSONObject req);
}
