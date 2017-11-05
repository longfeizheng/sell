package cn.merryyou.repository;

import cn.merryyou.dataobject.ProductInfo;
import cn.merryyou.emum.ProductStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created on 2017/11/5 0005.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRespositoryTest {

    @Autowired
    ProductInfoRespository respository;

    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("手机卡");
        productInfo.setProductDescription("很好很好用");
        productInfo.setProductIcon("http://ww.baidu.com");
        productInfo.setProductStock(20);
        productInfo.setCategoryType(1);
        productInfo.setProductPrice(new BigDecimal(12.3));
        ProductInfo info = respository.save(productInfo);
        Assert.assertNotNull(info);
    }

    @Test
    public void findByProductStatus(){
        List<ProductInfo> infos = respository.findByProductStatus(ProductStatusEnum.UP.getCode());
        log.info("infos.size={}",infos.size());
        Assert.assertEquals(1,infos.size());
    }
}