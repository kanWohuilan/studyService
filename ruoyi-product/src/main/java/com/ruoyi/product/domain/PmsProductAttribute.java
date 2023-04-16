package com.ruoyi.product.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author FGQ
 * @Date 2023/4/16 11:12 AM
 * @PackageName:com.ruoyi.product.domain
 * @ClassName: PmsProductAttribute
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class PmsProductAttribute extends BaseEntity {
    private Long id;
    @ApiModelProperty(value = "商品名称")
    private String name;
    @ApiModelProperty(value = "属性参数")
    private String inputList;
    @ApiModelProperty(value = "输入类型")
    private Integer inputType;
    @ApiModelProperty(value = "选择类型")
    private Integer selectType;
}
