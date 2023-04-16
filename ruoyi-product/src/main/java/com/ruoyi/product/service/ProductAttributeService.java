package com.ruoyi.product.service;

import com.ruoyi.product.domain.PmsProductAttribute;
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
public interface ProductAttributeService {
    List<PmsProductAttribute> selectAttributeByCategoryList(Integer categoryId);
}
