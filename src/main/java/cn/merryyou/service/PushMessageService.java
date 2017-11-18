package cn.merryyou.service;

import cn.merryyou.dto.OrderDTO;

/**
 * Created on 2017/11/18 0018.
 *
 * 推送消息
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface PushMessageService {

    /**
     * 订单状态消息推送
     */
    void orderStatus(OrderDTO orderDTO);
}
