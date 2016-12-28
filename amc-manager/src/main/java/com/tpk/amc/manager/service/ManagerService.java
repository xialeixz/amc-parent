package com.tpk.amc.manager.service;

import com.tpk.amc.face.dto.manager.BaseManagerDto;
import com.tpk.amc.face.interfacz.manager.BaseManagerFace;
import com.tpk.amc.manager.dao.TmCustomerMapper;
import com.tpk.amc.manager.dto.TmCustomer;
import com.tpk.amc.manager.utils.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * Created by jasonxxia on 2016/12/14.
 */
@Service
public class ManagerService implements BaseManagerFace {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TmCustomerMapper customerMapper;

    @Autowired
    private CommonUtils commonUtils;

    private Random random = new Random();

    public BaseManagerDto getCustomer(Long custId) {
        logger.info("获取客户信息服务请求:{}", custId);

        if(null == custId){
            return null;
        }

        TmCustomer customer = customerMapper.selectByPrimaryKey(custId);
        if(null == customer){
            return null;
        }
        return commonUtils.getResult(customer);
    }

    public boolean addCustomer(BaseManagerDto baseManagerDto) {

        if(null == baseManagerDto){
            return false;
        }

        TmCustomer customer = new TmCustomer();
        if(null == baseManagerDto.getCustId()){
            customer.setCustId(random.nextLong());
        }else {
            customer.setCustId(baseManagerDto.getCustId());
        }
        customer.setName(baseManagerDto.getName());
        customer.setIdNo(baseManagerDto.getIdNo());
        customer.setIdType(baseManagerDto.getIdType());
        customer.setBirthday(baseManagerDto.getBirthday());

        return false;
    }

    public boolean updateCustomer(BaseManagerDto baseManagerDto) {

        if(null == baseManagerDto){
            return false;
        }

        TmCustomer customer = customerMapper.selectByPrimaryKey(baseManagerDto.getCustId());
        if(null == customer){
            return false;
        }

        customer.setName(baseManagerDto.getName());
        customer.setIdNo(baseManagerDto.getIdNo());

        return customerMapper.updateByPrimaryKeySelective(customer) > 0;
    }
}