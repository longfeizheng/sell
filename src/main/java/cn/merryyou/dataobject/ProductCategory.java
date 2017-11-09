package cn.merryyou.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author zlf
 * @DynamicInsert和@DynamicUpdate生成动态SQL语句，即在插入和修改数据的时候,语句中只包括要插入或者修改的字段 Created on 2017/11/4 0004.
 * @email i@merryyou.cn
 * @since 1.0
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     * 类目ID
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
