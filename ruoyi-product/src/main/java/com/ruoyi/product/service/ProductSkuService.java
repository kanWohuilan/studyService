package com.ruoyi.product.service;

import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsSku;
import com.ruoyi.product.domain.dto.CreateProductAndSkuRequest;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service
 * @ClassName: MemberService
 * @Description: TODO
 * @Version 1.0
 */
public interface ProductSkuService {
//    List<PmsProduct> selectProductList(PmsProduct pmsProduct);
    int insertSku(PmsSku sku);
}
