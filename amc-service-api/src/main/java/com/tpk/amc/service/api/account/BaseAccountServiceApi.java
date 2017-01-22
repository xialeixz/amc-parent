package com.tpk.amc.service.api.account;

import com.tpk.amc.service.api.protocol.account.AccountDto;
import com.tpk.amc.service.api.protocol.account.AccountKeyDto;
import java.util.List;

/**
 * Created by jasonxxia on 2017/1/11.
 */
public interface BaseAccountServiceApi {
    public AccountDto getAccount(AccountKeyDto id);

    public List<AccountDto> getAccounts(AccountDto condition);

    public boolean updateAccount(AccountDto data);

    public boolean addAccount(AccountDto data);
}