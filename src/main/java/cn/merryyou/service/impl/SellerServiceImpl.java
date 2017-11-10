package cn.merryyou.service.impl;

import cn.merryyou.dataobject.SellerInfo;
import cn.merryyou.repository.SellerInfoReponsitory;
import cn.merryyou.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2017/11/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoReponsitory reponsitory;

    @Override
    public SellerInfo findSellerInfoByOperid(String openid) {
        return reponsitory.findByOpenid(openid);
    }
}
