package cn.merryyou.service.impl;

import cn.merryyou.dto.OrderDTO;
import cn.merryyou.emum.ResultEnum;
import cn.merryyou.exception.SellException;
import cn.merryyou.service.BuyerService;
import cn.merryyou.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2017/11/7 0007.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOrderoOner(openid, orderId);
    }

    @Override
    public OrderDTO cancleOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderoOner(openid, orderId);
        if (orderDTO == null) {
            log.error("【取消订单】查询不到该订单，orderId={}", orderId);
            throw new SellException(ResultEnum.ORDER_NO_EXIST);
        }
        return orderService.cancle(orderDTO);
    }

    private OrderDTO checkOrderoOner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        //判断是否是自己的订单
        if (!orderDTO.getBuyerOpenid().endsWith(openid)) {
            log.error("【查询订单】 订单openid不一致 openid={},orderDto={}", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
