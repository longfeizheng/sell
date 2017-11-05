package cn.merryyou.repository;

import cn.merryyou.dataobject.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

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
public class OrderMasterRepositoryTest {

    private final String OPENID="01010101";
    @Autowired
    private OrderMasterRepository repository;


    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");;
        orderMaster.setBuyerName("tom");
        orderMaster.setBuyerPhone("12345678900");
        orderMaster.setBuyerAddress("北京");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(111.26));
        OrderMaster master = repository.save(orderMaster);
        Assert.assertNotNull(master);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<OrderMaster> page = repository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotNull(page);
        Assert.assertEquals(2,page.getTotalElements());
    }

}