package com.tpk.amc.core.dao;

import com.tpk.amc.core.dto.AmcTableSeq;

public interface AmcTableSeqMapper {
    int deleteByPrimaryKey(String tableName);

    int insert(AmcTableSeq record);

    int insertSelective(AmcTableSeq record);

    AmcTableSeq selectByPrimaryKey(String tableName);

    int updateByPrimaryKeySelective(AmcTableSeq record);

    int updateByPrimaryKey(AmcTableSeq record);
}