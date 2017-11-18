package cn.merryyou.service.impl;

import cn.merryyou.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created on 2017/11/18 0018.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PushMessageServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private PushMessageServiceImpl pushMessage;

    @Test
    public void orderStatus() throws Exception {
        OrderDTO orderDTO = orderService.findOne("orderId");
        pushMessage.orderStatus(orderDTO);
    }

}