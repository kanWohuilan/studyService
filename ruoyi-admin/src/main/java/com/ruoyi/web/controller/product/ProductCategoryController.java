package com.ruoyi.web.controller.product;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;
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
public class ProductCategoryController extends BaseController {
    @Autowired
    ProductCategoryService productCategoryService;
    /**
     * 获取商品菜单列表
     */
    @GetMapping("/categorylist")
    public AjaxResult list(PmsProduct product){
        List<PmsProductCategoryVo> list = productCategoryService.selectProductCategoryList();
        return AjaxResult.success(list);
    }
}
