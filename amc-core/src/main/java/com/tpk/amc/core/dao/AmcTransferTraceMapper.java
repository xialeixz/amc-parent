package com.tpk.amc.core.dao;

import com.tpk.amc.core.dto.AmcTransferTrace;
import com.tpk.amc.core.dto.AmcTransferTraceKey;

public interface AmcTransferTraceMapper {
    int deleteByPrimaryKey(AmcTransferTraceKey key);

    int insert(AmcTransferTrace record);

    int insertSelective(AmcTransferTrace record);

    AmcTransferTrace selectByPrimaryKey(AmcTransferTraceKey key);

    int updateByPrimaryKeySelective(AmcTransferTrace record);

    int updateByPrimaryKey(AmcTransferTrace record);
}