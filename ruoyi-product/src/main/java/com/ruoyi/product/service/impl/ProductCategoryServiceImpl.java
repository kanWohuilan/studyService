package com.ruoyi.product.service.impl;

import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductCategory;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;
import com.ruoyi.product.mapper.PmsProductCategoryMapper;
import com.ruoyi.product.mapper.PmsProductMapper;
import com.ruoyi.product.service.ProductCategoryService;
import com.ruoyi.product.service.ProductService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service.impl
 * @ClassName: ProductCategoryServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    PmsProductCategoryMapper pmsProductCategoryMapper;
    private  List<PmsProductCategory> pmsProductCategoryList;
    @Override
    public List<PmsProductCategoryVo> selectProductCategoryList() {
        List<PmsProductCategory> categoryList = pmsProductCategoryMapper.selectProductCategoryList();
        pmsProductCategoryList = categoryList;
        List pmsProductCategoryVoList = new ArrayList<>();
        for (PmsProductCategory pmsProductCategory:
        pmsProductCategoryList) {
            if (pmsProductCategory.getParentId()==0) {
                PmsProductCategoryVo vo = new PmsProductCategoryVo();
                BeanUtils.copyProperties(pmsProductCategory,vo);
                vo.setChildren(getPmsProductCategoryVo(vo));
                pmsProductCategoryVoList.add(vo);
            }
        }
        return pmsProductCategoryVoList;
    }
    public List<PmsProductCategoryVo> getPmsProductCategoryVo(PmsProductCategoryVo pmsProductCategoryVo) {
        List voList= new ArrayList<>();
        for (PmsProductCategory category :
                pmsProductCategoryList) {
              if(category.getParentId() == pmsProductCategoryVo.getId())    {
                  PmsProductCategoryVo vo = new PmsProductCategoryVo();
                  BeanUtils.copyProperties(category,vo);
                  vo.setChildren(getPmsProductCategoryVo(vo));
                  voList.add(vo);
              }
        }
        return voList;
    }
}
