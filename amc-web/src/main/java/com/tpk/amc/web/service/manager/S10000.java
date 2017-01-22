package com.tpk.amc.web.service.manager;

import com.alibaba.fastjson.JSONObject;
import com.tpk.amc.param.def.AMCCode;
import com.tpk.amc.param.def.CommonMsgKey;
import com.tpk.amc.service.api.customer.BaseCustomerServiceApi;
import com.tpk.amc.service.api.protocol.customer.CustomerDto;
import com.tpk.amc.web.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jasonxxia on 2016/12/28.
 */
@Service
public class S10000 implements BaseService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BaseCustomerServiceApi baseCustomerServiceApi;

    public Map<String, Object> proc(JSONObject req) {

        Map<String, Object> result = new HashMap<String, Object>();
        CustomerDto manager = baseCustomerServiceApi.getCustomer(req.getLong("id"));
        if(null == manager){
            result.put(CommonMsgKey.CODE, AMCCode.S001);
        }else {
            result.put(CommonMsgKey.CODE, AMCCode.D000);
            result.put(CommonMsgKey.DATA, manager.toString());
        }

        return result;
    }
}