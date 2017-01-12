package com.tpk.amc.service.api.account;

import com.tpk.amc.service.api.protocol.account.AccountDto;

import java.util.List;

/**
 * Created by jasonxxia on 2017/1/11.
 */
public interface BaseAccountServiceApi {
    public AccountDto getAccount(Long id);

    public List<AccountDto> getAccounts(AccountDto condition);

    public boolean updateAccount(Long id, AccountDto data);

    public boolean addAccount(AccountDto data);
}
