package com.ruoyi.product.mapper;

import com.ruoyi.product.domain.PmsProduct;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/31 11:21 PM
 * @PackageName:com.ruoyi.member.mapper
 * @ClassName: UmsMemberMapper
 * @Description: TODO
 * @Version 1.0
 */

public interface PmsProductMapper {
    public List<PmsProduct> selectProductList(PmsProduct pmsProduct);
    public  int insertProduct(PmsProduct pmsProduct);
}
