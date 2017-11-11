package cn.merryyou.dataobject.mapper;

import cn.merryyou.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/11/11 0011.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insert() {
        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "111");
        map.put("category_type", 6);
        int result = mapper.insertByMap(map);
        Assert.assertNotNull(result);
    }

    @Test
    public void insertObjectt() {
        ProductCategory category = new ProductCategory();
        category.setCategoryName("333");
        category.setCategoryType(6);
        Integer result = mapper.insertByObject(category);
        Assert.assertNotNull(result);
    }

}