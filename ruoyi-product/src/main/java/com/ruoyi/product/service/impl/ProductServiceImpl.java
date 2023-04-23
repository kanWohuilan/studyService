package com.ruoyi.product.service.impl;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsSku;
import com.ruoyi.product.domain.PmsSkuAttribute;
import com.ruoyi.product.domain.dto.CreateProductAndSkuRequest;
import com.ruoyi.product.mapper.PmsProductMapper;
import com.ruoyi.product.mapper.PmsProductSkuMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.product.service.ProductService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    public static final Integer AGREE = 1;
    public static final Integer REFUSE = 0;

    @Autowired
    PmsProductMapper pmsProductMapper;
    @Autowired
    PmsProductSkuMapper pmsProductSkuMapper;
    @Override
    public List<PmsProduct> selectProductList(PmsProduct pmsProduct) {
        return pmsProductMapper.selectProductList(pmsProduct);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int createProductAndSkuRequest(CreateProductAndSkuRequest createProductAndSkuRequest) {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        PmsProduct pmsProduct = new PmsProduct();
        List<PmsSku> skuList = new ArrayList<>();
        Boolean isAdmin = StringUtils.isNotNull(user) && user.isAdmin();
        BeanUtils.copyProperties(createProductAndSkuRequest, pmsProduct);

        pmsProductMapper.insertProduct(pmsProduct);
        if(createProductAndSkuRequest.getSkuList().size()>0) {
            createProductAndSkuRequest.getSkuList().forEach(sku -> {
                List<PmsSkuAttribute> skuAttributes = new ArrayList<>();
                PmsSku pmsSkusku = new PmsSku();
                BeanUtils.copyProperties(sku, pmsSkusku);
//                sku.getSkuAttributesList().forEach(skuAttribute -> {
//                    skuAttributes.add(skuAttribute);
//                });
                pmsSkusku.setProductId(pmsProduct.getId());
                if (isAdmin) {
                    pmsSkusku.setVerifyStatus(AGREE);
                } else {
                    pmsSkusku.setVerifyStatus(REFUSE);
                }
                skuList.add(pmsSkusku);
            });
        }
        pmsProductSkuMapper.batchSku(skuList);
        if (isAdmin) {
            pmsProduct.setVerifyStatus(AGREE);
        } else {
            pmsProduct.setVerifyStatus(REFUSE);
        }
        return 0;
    }
}
