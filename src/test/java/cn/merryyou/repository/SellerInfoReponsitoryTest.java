package cn.merryyou.repository;

import cn.merryyou.dataobject.SellerInfo;
import cn.merryyou.utils.KeyUtil;
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
public class SellerInfoReponsitoryTest {

    @Autowired
    private SellerInfoReponsitory reponsitory;


    @Test
    public void save() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");
        SellerInfo info = reponsitory.save(sellerInfo);
        Assert.assertNotNull(info);
    }

    @Test
    public void findByOpenid() throws Exception {
        SellerInfo s = reponsitory.findByOpenid("abc");
        Assert.assertNotNull(s);
    }

}