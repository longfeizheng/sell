package cn.merryyou.repository;

import cn.merryyou.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created on 2017/11/5 0005.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
