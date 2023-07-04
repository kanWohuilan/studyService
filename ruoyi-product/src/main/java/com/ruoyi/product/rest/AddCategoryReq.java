package com.ruoyi.product.rest;

import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author FGQ
 * @Date 2023/5/5 11:29 PM
 * @PackageName:com.ruoyi.product.rest
 * @ClassName: AddCategoryReq
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class AddCategoryReq extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "parentId不能为空")
    private Long parentId;
    private Integer level;
    @NotNull(message = "name不能为空")
    @ApiModelProperty(value = "分类名称")
    private String name;
}
