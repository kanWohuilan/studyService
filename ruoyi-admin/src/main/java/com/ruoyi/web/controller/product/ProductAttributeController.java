package com.ruoyi.web.controller.product;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductAttribute;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;
import com.ruoyi.product.service.ProductAttributeService;
import com.ruoyi.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/26 11:37 PM
 * @PackageName:com.ruoyi.web.controller.member
 * @ClassName: memberController
 * @Description: 商品模块
 * @Version 1.0
 */
@RestController
@RequestMapping("/product")
public class ProductAttributeController extends BaseController {
    @Autowired
    ProductAttributeService productAttributeService;
    /**
     * 根据分类获取商品属性列表
     */
    @GetMapping("/attributelist")
    public AjaxResult list(Integer categoryId){
        List<PmsProductAttribute> list = productAttributeService.selectAttributeByCategoryList(categoryId);
        return AjaxResult.success(list);
    }
}
