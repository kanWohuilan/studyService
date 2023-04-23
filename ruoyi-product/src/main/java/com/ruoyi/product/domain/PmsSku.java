package com.ruoyi.product.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Author FGQ
 * @Date 2023/4/22 11:12 AM
 * @PackageName:com.ruoyi.product.domain
 * @ClassName: PmsSku
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class PmsSku extends BaseEntity {
    private Long id;
    @NotNull
    private Long productId;
    @NotNull
    private String skuCode;
    private BigDecimal price;
    private Integer stock;
    private String pic;
    private Integer verifyStatus;
}
