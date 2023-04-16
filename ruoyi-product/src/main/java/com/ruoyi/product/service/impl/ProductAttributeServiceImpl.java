package com.ruoyi.product.service.impl;

import com.ruoyi.product.domain.PmsProductAttribute;
import com.ruoyi.product.mapper.PmsProductAttributeMapper;
import com.ruoyi.product.mapper.PmsProductCategoryMapper;
import com.ruoyi.product.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/4/16 2:29 PM
 * @PackageName:com.ruoyi.product.service.impl
 * @ClassName: ProductAttributeServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {
    @Autowired
    private PmsProductAttributeMapper pmsProductAttributeMapper;
    @Autowired
    private PmsProductCategoryMapper pmsProductCategoryMapper;
    @Override
    public List<PmsProductAttribute> selectAttributeByCategoryList(Integer categoryId) {
        List<Integer> categoryIds= new ArrayList<Integer>();
        categoryIds.add(categoryId);
        Integer parentId = pmsProductCategoryMapper.selectParentCategoryIdsByCategoryId(categoryId);
        getCategoryIds(parentId,categoryIds);
        List<PmsProductAttribute> attributesList  = pmsProductAttributeMapper.selectAttributeListByCategory(categoryIds);
        return attributesList;
    }
    public void getCategoryIds(Integer parentId,List<Integer> categoryIds) {
      if(parentId != null &&  parentId != 0 ) {
          categoryIds.add(parentId);
          Integer id  = pmsProductCategoryMapper.selectParentCategoryIdsByCategoryId(parentId);
          getCategoryIds(id,categoryIds);
      }
    }
}
