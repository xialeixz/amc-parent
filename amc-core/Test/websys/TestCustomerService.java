package websys;

import com.tpk.amc.core.dao.AmcAccountMapper;
import com.tpk.amc.core.dto.AmcAccount;
import com.tpk.amc.core.dto.AmcAccountKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jasonxxia on 2016/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:biz/biz-context-mybatis.xml")
public class TestCustomerService {

    @Autowired
    AmcAccountMapper amcAccountMapper;

    @Test
    public void test(){
        AmcAccountKey key = new AmcAccountKey();
        key.setAcctNo(4954806000000003L);
        key.setAcctType("H");
        AmcAccount account = amcAccountMapper.selectByPrimaryKey(key);

        if(null == account){
            System.out.println("未找到数据");
        }else {
            System.out.println(account.toString());
        }
    }
}