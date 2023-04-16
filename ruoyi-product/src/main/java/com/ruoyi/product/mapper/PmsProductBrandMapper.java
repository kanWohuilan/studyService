package com.ruoyi.product.mapper;

import com.ruoyi.product.domain.PmsProductBrand;
import com.ruoyi.product.domain.PmsProductCategory;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/4/15 2:58 AM
 * @PackageName:com.ruoyi.product.mapper
 * @ClassName: PmsProductBrandMapper
 * @Description: TODO
 * @Version 1.0
 */
public interface PmsProductBrandMapper {
    public List<PmsProductBrand> selectProductBrandList();
}
