package com.tpk.amc.core.dao;

import com.tpk.amc.core.dto.AmcCustomer;

import java.util.List;

public interface AmcCustomerMapper {
    int deleteByPrimaryKey(Long custId);

    int insert(AmcCustomer record);

    int insertSelective(AmcCustomer record);

    AmcCustomer selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(AmcCustomer record);

    int updateByPrimaryKey(AmcCustomer record);

    List<AmcCustomer> selectBySelective(AmcCustomer record);
}