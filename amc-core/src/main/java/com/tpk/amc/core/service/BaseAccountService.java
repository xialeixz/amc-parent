package com.tpk.amc.core.service;

import com.tpk.amc.core.dao.AmcAccountMapper;
import com.tpk.amc.core.dto.AmcAccount;
import com.tpk.amc.core.dto.AmcAccountKey;
import com.tpk.amc.core.utils.AccountUtils;
import com.tpk.amc.service.api.account.BaseAccountServiceApi;
import com.tpk.amc.service.api.protocol.account.AccountDto;
import com.tpk.amc.service.api.protocol.account.AccountKeyDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jasonxxia on 2017/1/13.
 */
@Service
public class BaseAccountService implements BaseAccountServiceApi {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AmcAccountMapper accountMapper;

    @Autowired
    private AccountUtils accountUtils;

    @Override
    public AccountDto getAccount(AccountKeyDto id) {
        if (null == id) {
            return null;
        }

        logger.info("获取账户信息请求:{}", id);
        AmcAccountKey accountKey = new AmcAccountKey();
        accountKey.setAcctNo(id.getAcctNo());
        accountKey.setAcctType(id.getAcctType());

        AmcAccount account = accountMapper.selectByPrimaryKey(accountKey);
        if (null == account) {
            logger.info("账户信息不存在");
        }
        return accountUtils.toApiDto(account);
    }

    @Override
    public List<AccountDto> getAccounts(AccountDto condition) {
        logger.info("获取账户信息列表请求:{}", condition);
        List<AmcAccount> accountList = accountMapper.selectBySelective(accountUtils.fromApiDto(condition));

        return accountUtils.toApiDto(accountList);
    }

    @Override
    public boolean updateAccount(AccountDto data) {
        logger.info("修改账户信息请求:{}", data);
        if (null == data) {
            return false;
        }

        AmcAccountKey accountKey = new AmcAccountKey();
        accountKey.setAcctNo(data.getAcctNo());
        accountKey.setAcctType(data.getAcctType());
        AmcAccount account = accountMapper.selectByPrimaryKey(accountKey);
        if (null == account) {
            logger.info("未找到账户信息:{}", accountKey);
            return false;
        }

        return accountMapper.updateByPrimaryKey(accountUtils.fromApiDto(data)) > 0;
    }

    @Override
    public boolean addAccount(AccountDto data) {
        logger.info("新增账户信息请求:{}", data);
        AmcAccount account = accountUtils.fromApiDto(data);
        if (null == account) {
            return false;
        }

        AmcAccountKey accountKey = new AmcAccountKey();
        accountKey.setAcctNo(account.getAcctNo());
        accountKey.setAcctType(account.getAcctType());
        AmcAccount oldAccount = accountMapper.selectByPrimaryKey(accountKey);
        if (null != oldAccount) {
            logger.info("数据已存在");
            return false;
        }

        return accountMapper.insert(account) > 0;
    }
}