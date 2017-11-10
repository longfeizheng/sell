package cn.merryyou.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created on 2017/11/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
@Entity
public class SellerInfo {
    @Id
    private String id;

    private String username;

    private String password;

    private String openid;
}
