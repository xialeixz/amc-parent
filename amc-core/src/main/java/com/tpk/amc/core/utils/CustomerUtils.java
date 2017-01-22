package com.tpk.amc.core.utils;

import com.tpk.amc.core.dto.AmcCustomer;
import com.tpk.amc.service.api.protocol.customer.CustomerDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonxxia on 2017/1/12.
 */
@Component
public class CustomerUtils {

    public AmcCustomer fromApiDto(CustomerDto customerDto){
        if(null == customerDto){
            return null;
        }

        AmcCustomer customer = new AmcCustomer();
        customer.setCustId(customerDto.getCustId());
        customer.setOrg(customerDto.getOrg());
        customer.setIdNo(customerDto.getIdNo());
        customer.setIdType(customerDto.getIdType());
        customer.setTitle(customerDto.getTitle());
        customer.setName(customerDto.getName());
        customer.setGender(customerDto.getGender());
        customer.setBirthday(customerDto.getBirthday());
        customer.setNationality(customerDto.getNationality());
        customer.setMobileNo(customerDto.getMobileNo());
        customer.setEmail(customerDto.getEmail());
        customer.setSetupDate(customerDto.getSetupDate());
        customer.setJpaVersion(customerDto.getJpaVersion());
        customer.setLastModifiedDatetime(customerDto.getLastModifiedDatetime());
        customer.setCreatedDatetime(customerDto.getCreatedDatetime());
        return customer;
    }

    public List<AmcCustomer> fromApiDto(List<CustomerDto> customerDtoList){

        List<AmcCustomer> customerList = new ArrayList<AmcCustomer>();
        if(CollectionUtils.isEmpty(customerList)){
            return customerList;
        }

        for(CustomerDto customer : customerDtoList){
            customerList.add(fromApiDto(customer));
        }

        return customerList;
    }

    public CustomerDto toApiDto(AmcCustomer customer){
        if(null == customer){
            return null;
        }

        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustId(customer.getCustId());
        customerDto.setOrg(customer.getOrg());
        customerDto.setIdNo(customer.getIdNo());
        customerDto.setIdType(customer.getIdType());
        customerDto.setTitle(customer.getTitle());
        customerDto.setName(customer.getName());
        customerDto.setGender(customer.getGender());
        customerDto.setBirthday(customer.getBirthday());
        customerDto.setNationality(customer.getNationality());
        customerDto.setMobileNo(customer.getMobileNo());
        customerDto.setEmail(customer.getEmail());
        customerDto.setSetupDate(customer.getSetupDate());
        customerDto.setJpaVersion(customer.getJpaVersion());
        customerDto.setLastModifiedDatetime(customer.getLastModifiedDatetime());
        customerDto.setCreatedDatetime(customer.getCreatedDatetime());

        return customerDto;
    }

    public List<CustomerDto> toApiDto(List<AmcCustomer> customerList){

        List<CustomerDto> customerDtoList = new ArrayList<CustomerDto>();
        if(CollectionUtils.isEmpty(customerList)){
            return customerDtoList;
        }


        for(AmcCustomer customer : customerList){
            customerDtoList.add(toApiDto(customer));
        }

        return customerDtoList;
    }
}
