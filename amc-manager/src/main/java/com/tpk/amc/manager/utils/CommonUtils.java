package com.tpk.amc.manager.utils;

import com.tpk.amc.face.dto.manager.BaseManagerDto;
import com.tpk.amc.manager.dto.TmCustomer;
import org.springframework.stereotype.Component;

/**
 * Created by jasonxxia on 2016/12/23.
 */
@Component
public class CommonUtils {

    public BaseManagerDto getResult(TmCustomer customer){

        if(null == customer){
            return null;
        }

        BaseManagerDto baseManagerDto = new BaseManagerDto();
        baseManagerDto.setCustId(customer.getCustId());
        baseManagerDto.setOrg(customer.getOrg());
        baseManagerDto.setIdNo(customer.getIdNo());
        baseManagerDto.setIdType(customer.getIdType());
        baseManagerDto.setTitle(customer.getTitle());
        baseManagerDto.setName(customer.getName());
        baseManagerDto.setGender(customer.getGender());
        baseManagerDto.setBirthday(customer.getBirthday());
        baseManagerDto.setOccupation(customer.getOccupation());
        baseManagerDto.setBankmemberNo(customer.getBankmemberNo());
        baseManagerDto.setNationality(customer.getNationality());
        baseManagerDto.setPrOfCountry(customer.getPrOfCountry());
        baseManagerDto.setResidencyCountryCd(customer.getResidencyCountryCd());

        return baseManagerDto;
    }
}