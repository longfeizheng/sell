package cn.merryyou.dataobject;

import cn.merryyou.emum.ProductStatusEnum;
import cn.merryyou.utils.EnumUtil;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created on 2017/11/5 0005.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    /**
     * 商品ID
     */
    @Id
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 商品图片
     */
    private String productIcon;

    /**
     * 商品状态
     */
    private Integer productStatus = ProductStatusEnum.UP.getCode(); //0 正常 1 下架

    /**
     * 商品类目类型
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @Ignore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
