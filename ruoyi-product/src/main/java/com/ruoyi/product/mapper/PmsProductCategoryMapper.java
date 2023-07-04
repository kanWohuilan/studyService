package com.ruoyi.product.mapper;

import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductCategory;
import com.ruoyi.product.rest.AddCategoryReq;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/31 11:21 PM
 * @PackageName:com.ruoyi.member.mapper
 * @ClassName: UmsMemberMapper
 * @Description: TODO
 * @Version 1.0
 */

public interface PmsProductCategoryMapper {
    public List<PmsProductCategory> selectProductCategoryList();
    public Integer selectParentCategoryIdsByCategoryId(Integer categoryId);
    public int updateCategory(PmsProductCategory category);
    public int selectByParentCategoryId(@Param("parentId") Long parentId);
    public int insertCategory(AddCategoryReq productCategory);

    public int deleteCategory(Long[] ids);
}
