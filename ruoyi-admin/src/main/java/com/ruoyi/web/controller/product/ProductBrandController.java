package com.ruoyi.web.controller.product;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductBrand;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;
import com.ruoyi.product.service.ProductBrandService;
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
 * @Description: 商品品牌模块
 * @Version 1.0
 */
@RestController
@RequestMapping("/product")
public class ProductBrandController extends BaseController {
    @Autowired
    ProductBrandService productBrandService;
    /**
     * 获取所有商品菜单列表
     */
    @GetMapping("/brandlist")
    public AjaxResult list(PmsProduct product){
        List<PmsProductBrand> list = productBrandService.selectProductBrandList();
        return AjaxResult.success(list);
    }
}
