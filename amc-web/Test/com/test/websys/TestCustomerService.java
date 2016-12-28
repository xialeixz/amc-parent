package com.test.websys;

import com.tpk.amc.face.dto.manager.BaseManagerDto;
import com.tpk.amc.face.interfacz.manager.BaseManagerFace;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jasonxxia on 2016/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:biz/biz-dubbo.xml")
public class TestCustomerService {

    @Autowired
    private BaseManagerFace managerService;

    @Test
    public void test(){
        BaseManagerDto customer = managerService.getCustomer(2951200000000001931L);
        System.out.println(customer);
    }
}