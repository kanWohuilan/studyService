package com.ruoyi.product.service.impl;

import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.mapper.PmsProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.product.service.ProductService;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service.impl
 * @ClassName: ProductServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    PmsProductMapper pmsProductMapper;

    @Override
    public List<PmsProduct> selectProductList(PmsProduct pmsProduct) {
        return pmsProductMapper.selectProductList(pmsProduct);
    }
}
