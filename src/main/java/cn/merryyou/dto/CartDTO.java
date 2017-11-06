package cn.merryyou.dto;

import lombok.Data;

/**
 * Created on 2017/11/6 0006.
 * 购物车
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
public class CartDTO {
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
