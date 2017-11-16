package cn.merryyou.service;

import cn.merryyou.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * Created on 2017/11/16 0016.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
