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
public enum ProductStatusEnum implements CodeEnmu {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String msg;


    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
