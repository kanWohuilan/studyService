package com.ruoyi.product.service.impl;

import com.ruoyi.product.domain.PmsProductBrand;
import com.ruoyi.product.mapper.PmsProductBrandMapper;
import com.ruoyi.product.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/4/15 3:05 AM
 * @PackageName:com.ruoyi.product.service.impl
 * @ClassName: ProductBrandServicesImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class ProductBrandServicesImpl implements ProductBrandService {
    @Autowired
    PmsProductBrandMapper pmsProductBrandMapper;
    @Override
    public List<PmsProductBrand> selectProductBrandList() {
        return pmsProductBrandMapper.selectProductBrandList();
    }
}
