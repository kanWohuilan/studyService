package com.ruoyi.web.controller.product;

import com.github.pagehelper.PageInfo;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.page.TableSupport;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductCategory;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;
import com.ruoyi.product.rest.AddCategoryReq;
import com.ruoyi.product.rest.DeleteRequest;
import com.ruoyi.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.util.Date;
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
@Validated
public class ProductCategoryController extends BaseController {
    @Autowired
    ProductCategoryService productCategoryService;
    /**
     * 获取商品分类列表
     */
    @GetMapping("/categorylist")
    public TableDataInfo list(HttpServletRequest b){
        List<PmsProductCategoryVo> list = productCategoryService.selectProductCategoryList();
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setData(list);
        rspData.setTotal((Long)(b.getAttribute("total")));
        return rspData;
    }
    /**
     * 更新分类
     */
    @PostMapping("/updatecategory")
    public AjaxResult updateList(@RequestBody PmsProductCategory productCategory){
        productCategoryService.updateProductCategory(productCategory);
        return AjaxResult.success();
    }

    /**
     * 添加分类
     */
    @PostMapping("/addcategory")
    public AjaxResult insertCategory (@RequestBody AddCategoryReq addCategoryReq){
        return toAjax(productCategoryService.insertCategory(addCategoryReq));
    }

    /**
     * 添加分类
     */
    @PostMapping("/deletecategory")
    public AjaxResult deleteCategory ( @RequestBody DeleteRequest DeleteRequest){
        return toAjax(productCategoryService.deleteCategory(DeleteRequest.getIds()));
    }
}
