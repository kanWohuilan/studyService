package com.ruoyi.product.domain.dto;

import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsSku;
import com.ruoyi.product.domain.PmsSkuAttribute;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/4/22 12:00 AM
 * @PackageName:com.ruoyi.product.domain.dto
 * @ClassName: CreateProductAndSkuRequest
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class SkuRequest {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer stock;
    @ApiModelProperty(value = "商品品牌名称")
    private List<PmsSkuAttribute> skuAttributesList;
}
