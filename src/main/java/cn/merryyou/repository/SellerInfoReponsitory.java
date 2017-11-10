package cn.merryyou.repository;

import cn.merryyou.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2017/11/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface SellerInfoReponsitory extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
