package com.tpk.amc.service.api.customer;

import com.tpk.amc.service.api.protocol.customer.CustomerDto;
import java.util.List;

/**
 * Created by jasonxxia on 2017/1/11.
 */
public interface BaseCustomerServiceApi {

    public CustomerDto getCustomer(Long id);

    public List<CustomerDto> getCustomers(CustomerDto condition);

    public boolean updateCustomer(CustomerDto data);

    public boolean addCustomer(CustomerDto data);
}