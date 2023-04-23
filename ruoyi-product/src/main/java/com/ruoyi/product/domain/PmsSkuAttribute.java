package com.ruoyi.product.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Author FGQ
 * @Date 2023/3/26 11:53 PM
 * @PackageName:com.ruoyi.common.core.domain.entity
 * @ClassName: PmsProduct
 * @Description: 商品对象实体类
 * @Version 1.0
 */
@Data
public class PmsSkuAttribute extends  BaseEntity{
    private static final long serialVersionUID = 1L;
    @NotNull
    private Long attributeId;
    @NotNull
    private String attributeValue;
    @NotNull
    private Long skuId;
}
