package cn.merryyou.service.impl;

import cn.merryyou.dataobject.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created on 2017/11/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    @Autowired
    SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByOperid() throws Exception {
        SellerInfo result = sellerService.findSellerInfoByOperid("abc");
        Assert.assertNotNull(result);
    }

}