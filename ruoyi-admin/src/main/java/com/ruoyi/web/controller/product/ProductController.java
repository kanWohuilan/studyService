package com.ruoyi.web.controller.product;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.service.ProductService;
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
public class ProductController extends BaseController {
    @Autowired
    ProductService productService;
    /**
     * 获取会员列表
     */
    @GetMapping("/list")
    public AjaxResult list(PmsProduct product)
    {
        startPage();
        List<PmsProduct> list = productService.selectProductList(product);
//        return getDataTable(list);
        return AjaxResult.success(list);

    }
}
