package com.ruoyi.product.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/26 11:53 PM
 * @PackageName:com.ruoyi.common.core.domain.entity
 * @ClassName: PmsProduct
 * @Description: 商品对象实体类
 * @Version 1.0
 */
@Data
public class PmsProductCategory extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long parentId;
    private Integer level;
    @ApiModelProperty(value = "分类名称")
    private String name;
}
