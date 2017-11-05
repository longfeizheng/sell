package cn.merryyou.repository;

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
//@Transactional
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Test
    public void save(){
        ProductCategory category = saveProductCategory();
        log.info(category.toString());
        Assert.assertNotNull(category.getCategoryId());
    }

    private ProductCategory saveProductCategory() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("联通");
        productCategory.setCategoryType(1);
        return categoryRepository.save(productCategory);
    }

    @Test
    public void findOne(){
        ProductCategory category = saveProductCategory();
        ProductCategory productCategory = categoryRepository.findOne(category.getCategoryId());
        Assert.assertNotNull(productCategory);
        Assert.assertEquals("联通",productCategory.getCategoryName());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        ProductCategory category = saveProductCategory();
        List<Integer> list = Arrays.asList(category.getCategoryId());
        List<ProductCategory> categoryList = categoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotNull(categoryList);
    }

}