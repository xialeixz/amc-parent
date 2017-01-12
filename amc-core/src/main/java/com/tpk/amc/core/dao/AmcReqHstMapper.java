package com.tpk.amc.core.dao;

import com.tpk.amc.core.dto.AmcReqHst;
import com.tpk.amc.core.dto.AmcReqHstKey;

public interface AmcReqHstMapper {
    int deleteByPrimaryKey(AmcReqHstKey key);

    int insert(AmcReqHst record);

    int insertSelective(AmcReqHst record);

    AmcReqHst selectByPrimaryKey(AmcReqHstKey key);

    int updateByPrimaryKeySelective(AmcReqHst record);

    int updateByPrimaryKey(AmcReqHst record);
}