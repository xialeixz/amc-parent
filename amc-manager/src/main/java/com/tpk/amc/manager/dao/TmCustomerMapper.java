package com.tpk.amc.manager.dao;

import com.tpk.amc.manager.dto.TmCustomer;

public interface TmCustomerMapper {
    int deleteByPrimaryKey(Long custId);

    int insert(TmCustomer record);

    int insertSelective(TmCustomer record);

    TmCustomer selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(TmCustomer record);

    int updateByPrimaryKey(TmCustomer record);
}