package cn.merryyou.service.impl;

import cn.merryyou.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
public class PorductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo info = productService.findOne("123");
        Assert.assertNotNull(info);
        Assert.assertEquals("手机卡", info.getProductName());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> all = productService.findUpAll();
        Assert.assertNotNull(all);
        Assert.assertEquals(1,all.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0,3);
        Page<ProductInfo> infos = productService.findAll(pageRequest);
        Assert.assertNotNull(infos);
        Assert.assertEquals(1,infos.getTotalPages());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1233");
        productInfo.setProductName("笔记本");
        productInfo.setProductDescription("很不好用");
        productInfo.setProductIcon("http://ww.baidu.com");
        productInfo.setProductStock(10);
        productInfo.setCategoryType(1);
        productInfo.setProductPrice(new BigDecimal(18888.3));
        ProductInfo info = productService.save(productInfo);
        Assert.assertNotNull(info);
    }

}