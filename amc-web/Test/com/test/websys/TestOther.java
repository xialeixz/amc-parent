package com.test.websys;

import com.alibaba.fastjson.JSONObject;
import com.tpk.amc.face.dto.manager.BaseManagerDto;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jasonxxia on 2016/12/28.
 */
public class TestOther {
    @Test
    public void testContact(){
        String s = "S";
        String id = "10000";

        System.out.println(s.concat(id));
    }

    @Test
    public void testJson(){
        Map<String, Object> result = new HashMap<String, Object>();
        BaseManagerDto dto = new BaseManagerDto();
        dto.setCustId(32424L);
        dto.setIdType("01");
        result.put("DATA", dto);

        System.out.println(JSONObject.toJSONString(result));
    }
}