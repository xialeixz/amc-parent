package com.tpk.amc.face.interfacz.manager;

import com.tpk.amc.face.dto.manager.BaseManagerDto;

/**
 * Created by jasonxxia on 2016/12/22.
 */
public interface BaseManagerFace {

    public BaseManagerDto getCustomer(Long custId);

    public boolean addCustomer(BaseManagerDto baseManagerDto);

    public boolean updateCustomer(BaseManagerDto baseManagerDto);
}
