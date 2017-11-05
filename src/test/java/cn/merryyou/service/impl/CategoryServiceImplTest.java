package cn.merryyou.service.impl;

import cn.merryyou.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2017/11/4 0004.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() throws Exception {
        ProductCategory category = categoryService.findOne(new Integer(1));
        log.info(category.toString());
        Assert.assertEquals(category.getCategoryName(),"联通");
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> categories = categoryService.findAll();
        categories.forEach(e -> log.info(e.toString()));
        Assert.assertNotNull(categories);
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> categories = categoryService.findByCategoryTypeIn(list);
        categories.forEach(e ->log.info(e.toString()));
        Assert.assertNotNull(categories);
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("联通");
        productCategory.setCategoryType(1);
        ProductCategory category = categoryService.save(productCategory);
        Assert.assertNotNull(category);
    }

}