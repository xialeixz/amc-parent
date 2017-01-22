package com.test.tpk.amc.web;

import com.tpk.amc.service.api.customer.BaseCustomerServiceApi;
import com.tpk.amc.service.api.protocol.customer.CustomerDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.mockito.Mockito.doReturn;

/**
 * Created by jasonxxia on 2017/1/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:biz-web.xml")
public class TestCustomer {

    @Spy
    @Autowired
    private BaseCustomerServiceApi baseCustomerServiceApi;

    @Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test(){
    doReturn(createCustomerDto()).when(baseCustomerServiceApi).getCustomer(2954800000000000002L);
    doReturn(returnNull()).when(baseCustomerServiceApi).getCustomer(2954800000000000003L);

    CustomerDto customerDto = baseCustomerServiceApi.getCustomer(2954800000000000002L);
    CustomerDto customerDto2 = baseCustomerServiceApi.getCustomer(2954800000000000003L);

        System.out.println(customerDto);
        System.out.println(customerDto2);
}

    public CustomerDto returnNull(){
        return null;
    }

    public CustomerDto createCustomerDto(){
        return new CustomerDto();
    }
}