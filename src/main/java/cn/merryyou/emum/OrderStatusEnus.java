package cn.merryyou.emum;

import lombok.Getter;

/**
 * Created on 2017/11/5 0005.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Getter
public enum OrderStatusEnus {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCLE(2,"已取消");

    private Integer code;
    private String message;

    OrderStatusEnus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
