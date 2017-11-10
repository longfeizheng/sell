package cn.merryyou.service;

import cn.merryyou.dataobject.SellerInfo;

/**
 * Created on 2017/11/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOperid(String openid);
}
