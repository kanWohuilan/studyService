package com.ruoyi.product.domain.dto;

import com.ruoyi.product.domain.PmsProduct;
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
public class CreateProductAndSkuRequest {
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
    private BigDecimal price;

    @ApiModelProperty(value = "商品描述")
    private String description;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    //上架状态：0->下架；1->上架
    @ApiModelProperty(value = "上架状态")
    private Integer publishStatus;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;
    @ApiModelProperty(value = "品牌Id")
    private Long brandId;
    @ApiModelProperty(value = "分类")
    private String productCategoryName;

    @ApiModelProperty(value = "分类名")
    private Long productCategoryId;

    @ApiModelProperty(value = "副标题")
    private String subTitle;
    @ApiModelProperty(value = "spu")
    private Long spuId;

    @ApiModelProperty(value = "审核状态")
    private Integer verifyStatus;
    @ApiModelProperty(value = "商品品牌名称")
    private List<SkuRequest> skuList;
}
