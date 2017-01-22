package com.tpk.amc.core.utils;

import com.tpk.amc.core.dto.AmcAccount;
import com.tpk.amc.service.api.protocol.account.AccountDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonxxia on 2017/1/13.
 */
@Component
public class AccountUtils {

    public AmcAccount fromApiDto(AccountDto accountDto){
        if(null == accountDto){
            return null;
        }

        AmcAccount account = new AmcAccount();
        account.setOrg(accountDto.getOrg());
        account.setAcctNo(accountDto.getAcctNo());
        account.setAcctType(accountDto.getAcctType());
        account.setCustId(accountDto.getCustId());
        account.setCustLimitId(accountDto.getCustLimitId());
        account.setProductCd(accountDto.getProductCd());
        account.setDefaultLogicalCardNo(accountDto.getDefaultLogicalCardNo());
        account.setCurrCd(accountDto.getCurrCd());
        account.setCreditLimit(accountDto.getCreditLimit());
        account.setCurrBal(accountDto.getCurrBal());
        account.setEmail(accountDto.getEmail());
        account.setMobileNo(accountDto.getMobileNo());
        account.setCreatedDatetime(accountDto.getCreatedDatetime());
        account.setLastModifiedDatetime(accountDto.getLastModifiedDatetime());
        account.setBlockCode(accountDto.getBlockCode());
        account.setLockDate(accountDto.getLockDate());

        return account;
    }

    public List<AmcAccount> fromApiDto(List<AccountDto> accountDtoList){
        List<AmcAccount> result = new ArrayList<AmcAccount>();
        if(CollectionUtils.isEmpty(result)){
            return result;
        }

        for(AccountDto accountDto : accountDtoList){
            result.add(fromApiDto(accountDto));
        }

        return result;
    }

    public AccountDto toApiDto(AmcAccount account){
        if(null == account){
            return null;
        }

        AccountDto accountDto = new AccountDto();
        accountDto.setOrg(account.getOrg());
        accountDto.setAcctNo(account.getAcctNo());
        accountDto.setAcctType(account.getAcctType());
        accountDto.setCustId(account.getCustId());
        accountDto.setCustLimitId(account.getCustLimitId());
        accountDto.setProductCd(account.getProductCd());
        accountDto.setDefaultLogicalCardNo(account.getDefaultLogicalCardNo());
        accountDto.setCurrCd(account.getCurrCd());
        accountDto.setCreditLimit(account.getCreditLimit());
        accountDto.setCurrBal(account.getCurrBal());
        accountDto.setEmail(account.getEmail());
        accountDto.setMobileNo(account.getMobileNo());
        accountDto.setCreatedDatetime(account.getCreatedDatetime());
        accountDto.setLastModifiedDatetime(account.getLastModifiedDatetime());
        accountDto.setBlockCode(account.getBlockCode());
        accountDto.setLockDate(account.getLockDate());

        return accountDto;
    }

    public List<AccountDto> toApiDto(List<AmcAccount> accountList){
        List<AccountDto> result = new ArrayList<AccountDto>();
        if(CollectionUtils.isEmpty(accountList)){
            return result;
        }

        for(AmcAccount account : accountList){
            result.add(toApiDto(account));
        }

        return result;
    }
}