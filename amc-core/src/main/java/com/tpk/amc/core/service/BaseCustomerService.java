package com.tpk.amc.core.service;

import com.tpk.amc.core.dao.AmcCustomerMapper;
import com.tpk.amc.core.dto.AmcCustomer;
import com.tpk.amc.core.utils.CustomerUtils;
import com.tpk.amc.service.api.customer.BaseCustomerServiceApi;
import com.tpk.amc.service.api.protocol.customer.CustomerDto;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by jasonxxia on 2016/12/14.
 */
@Service
public class BaseCustomerService implements BaseCustomerServiceApi {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CustomerUtils customerUtils;

    @Autowired
    private AmcCustomerMapper customerMapper;

    @Override
    public CustomerDto getCustomer(Long id) {

        logger.info("获取客户信息请求:{}", id);
        AmcCustomer customer = customerMapper.selectByPrimaryKey(id);
        if(null == customer){
            logger.info("未找到id对应客户数据");
        }

        return customerUtils.toApiDto(customer);
    }

    @Override
    public List<CustomerDto> getCustomers(CustomerDto condition) {
        logger.info("获取客户信息列表请求:{}-{}", condition);

        List<AmcCustomer> customerList = customerMapper.selectBySelective(customerUtils.fromApiDto(condition));
        return customerUtils.toApiDto(customerList);
    }

    @Override
    public boolean updateCustomer(CustomerDto data) {
        logger.info("修改客户信息请求:{}-{}", data);

        AmcCustomer customer = customerMapper.selectByPrimaryKey(data.getCustId());
        if(null == customer){
            logger.info("未找到id对应客户数据");
            return false;
        }

        return customerMapper.updateByPrimaryKey(customerUtils.fromApiDto(data)) > 0;
    }

    @Override
    public boolean addCustomer(CustomerDto data){
        logger.info("新增客户信息请求:{}-{}", data);

        if(StringUtils.isEmpty(data.getName()) || StringUtils.isEmpty(data.getIdNo())){
            return false;
        }

        return customerMapper.insert(customerUtils.fromApiDto(data)) > 0;
    }
}