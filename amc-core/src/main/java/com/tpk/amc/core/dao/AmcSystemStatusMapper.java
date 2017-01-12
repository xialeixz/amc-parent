package com.tpk.amc.core.dao;

import com.tpk.amc.core.dto.AmcSystemStatus;

public interface AmcSystemStatusMapper {
    int deleteByPrimaryKey(Integer statusId);

    int insert(AmcSystemStatus record);

    int insertSelective(AmcSystemStatus record);

    AmcSystemStatus selectByPrimaryKey(Integer statusId);

    int updateByPrimaryKeySelective(AmcSystemStatus record);

    int updateByPrimaryKey(AmcSystemStatus record);
}