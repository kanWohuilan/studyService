package com.ruoyi.product.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author FGQ
 * @Date 2023/3/26 11:53 PM
 * @PackageName:com.ruoyi.common.core.domain.entity
 * @ClassName: PmsProduct
 * @Description: 商品对象实体类
 * @Version 1.0
 */
@Data
public class PmsProduct extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;
    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "图片")
    private String pic;

    @ApiModelProperty(value = "货号")
    private String productSn;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    @ApiModelProperty(value = "价格")
    private Integer price;

    @ApiModelProperty(value = "商品描述")
    private String description;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "分类")
    private String productCategoryName;
    @Override
    public String toString() {
        return "PmsProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", productSn='" + productSn + '\'' +
                ", sale=" + sale +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
