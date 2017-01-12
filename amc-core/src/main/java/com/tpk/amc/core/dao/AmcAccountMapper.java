package com.tpk.amc.core.dao;

import com.tpk.amc.core.dto.AmcAccount;
import com.tpk.amc.core.dto.AmcAccountKey;

public interface AmcAccountMapper {
    int deleteByPrimaryKey(AmcAccountKey key);

    int insert(AmcAccount record);

    int insertSelective(AmcAccount record);

    AmcAccount selectByPrimaryKey(AmcAccountKey key);

    int updateByPrimaryKeySelective(AmcAccount record);

    int updateByPrimaryKey(AmcAccount record);
}