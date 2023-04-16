package com.ruoyi.product.mapper;

import com.ruoyi.product.domain.PmsProductAttribute;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/4/16 11:13 AM
 * @PackageName:com.ruoyi.product.mapper
 * @ClassName: PmsProductAttributeMapper
 * @Description: TODO
 * @Version 1.0
 */
public interface PmsProductAttributeMapper {
    public List<PmsProductAttribute> selectAttributeListByCategory(List<Integer> categoryIds);
}
