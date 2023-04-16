package com.ruoyi.product.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author FGQ
 * @Date 2023/4/12 1:14 AM
 * @PackageName:com.ruoyi.product.domain
 * @ClassName: PmsProductBrand
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class PmsProductBrand {
    private Long id;
    @ApiModelProperty(value = "商品品牌名称")
    private String name;
    private Integer sort;
}
