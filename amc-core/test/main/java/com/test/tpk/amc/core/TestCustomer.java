package com.test.tpk.amc.core;

import com.tpk.amc.core.service.BaseCustomerService;
import com.tpk.amc.service.api.protocol.customer.CustomerDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jasonxxia on 2017/1/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context-biz.xml")
public class TestCustomer {

    @Autowired
    private BaseCustomerService baseCustomerService;

    @Test
    public void testNotNull(){
        CustomerDto customerDto = baseCustomerService.getCustomer(2954800000000000012L);
        Assert.assertNotNull(customerDto);
        Assert.assertNotNull(customerDto.getIdNo());
    }

    @Test
    public void testData(){

    }
}