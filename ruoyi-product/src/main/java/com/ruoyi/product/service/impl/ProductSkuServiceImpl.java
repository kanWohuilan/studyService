package com.ruoyi.product.service.impl;

import com.ruoyi.product.domain.PmsSku;
import com.ruoyi.product.mapper.PmsProductSkuMapper;
import com.ruoyi.product.service.ProductSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author FGQ
 * @Date 2023/4/22 6:24 PM
 * @PackageName:com.ruoyi.product.service.impl
 * @ClassName: ProductSkuServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class ProductSkuServiceImpl implements ProductSkuService {
    @Autowired
    PmsProductSkuMapper pmsProductSkuMapper;

    @Override
    public int insertSku(PmsSku sku) {
        return  pmsProductSkuMapper.insertSku(sku);

    }
}
