package com.ruoyi.product.service;

import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductCategory;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service
 * @ClassName: MemberService
 * @Description: TODO
 * @Version 1.0
 */
public interface ProductCategoryService {
    List<PmsProductCategoryVo> selectProductCategoryList();
}
