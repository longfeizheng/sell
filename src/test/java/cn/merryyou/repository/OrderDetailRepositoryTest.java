package cn.merryyou.repository;

import cn.merryyou.dataobject.OrderDetail;
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
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;


    @Test
    public void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12344559");
        orderDetail.setOrderId("1234567");
        orderDetail.setProductIcon("http://www.baidu.com");
        orderDetail.setProductId("11112");
        orderDetail.setProductName("白苹果");
        orderDetail.setProductPrice(new BigDecimal(9909.99));
        orderDetail.setProductQuantity(2);
        OrderDetail detail = repository.save(orderDetail);
        Assert.assertNotNull(detail);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> details = repository.findByOrderId("1234567");
        Assert.assertNotNull(details);
        Assert.assertNotEquals(0, details.size());
    }

}