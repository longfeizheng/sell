package cn.merryyou.service;

import cn.merryyou.dto.OrderDTO;

/**
 * Created on 2017/11/7 0007.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancleOrder(String openid, String orderId);
}
