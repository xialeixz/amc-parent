package com.tpk.amc.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.tpk.amc.param.def.AMCCode;
import com.tpk.amc.param.def.CommonMsgKey;
import com.tpk.amc.web.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jasonxxia on 2016/12/28.
 */
@Controller
public class ManagerController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Map<String, BaseService> procs;

    @RequestMapping(value = "interface", method = RequestMethod.POST)
    @ResponseBody
    public String onMessage(@RequestBody String param){

        logger.info("接收消息:[{}]", param);
        Map<String, Object> result = new HashMap<String, Object>();

        try{
            JSONObject json = JSONObject.parseObject(param);
            if(null == json){
                throw new RuntimeException("接收参数异常");
            }

            String interfaces = json.getString("INTERFACE");
            BaseService service = procs.get("s".concat(interfaces));
            if(null == service){
                throw new RuntimeException("服务不存在");
            }

            result.putAll(service.proc(json));
        } catch(Exception ex){
            result.put(CommonMsgKey.CODE, AMCCode.S001);
            if(!StringUtils.isEmpty(ex.getMessage())){
                result.put(CommonMsgKey.DESC, ex.getMessage());
            }else {
                result.put(CommonMsgKey.DESC, AMCCode.S001.getDesc());
            }
        }

        if(!result.containsKey(CommonMsgKey.CODE)){
            result.put(CommonMsgKey.CODE, AMCCode.D000);
        }

        if(!result.containsKey(CommonMsgKey.DESC)){
            result.put(CommonMsgKey.DESC, ((AMCCode) result.get(CommonMsgKey.CODE)).getDesc());
        }

        return JSONObject.toJSONString(result);
    }
}