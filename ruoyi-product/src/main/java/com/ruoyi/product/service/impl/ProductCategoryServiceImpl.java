package com.ruoyi.product.service.impl;

import com.github.pagehelper.PageInfo;
import com.ruoyi.common.core.page.PageDomain;
import com.ruoyi.common.core.page.TableSupport;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.product.domain.PmsProduct;
import com.ruoyi.product.domain.PmsProductCategory;
import com.ruoyi.product.domain.vo.PmsProductCategoryVo;
import com.ruoyi.product.mapper.PmsProductCategoryMapper;
import com.ruoyi.product.mapper.PmsProductMapper;
import com.ruoyi.product.rest.AddCategoryReq;
import com.ruoyi.product.service.ProductCategoryService;
import com.ruoyi.product.service.ProductService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service.impl
 * @ClassName: ProductCategoryServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    PmsProductCategoryMapper pmsProductCategoryMapper;
    private List<PmsProductCategory> pmsProductCategoryList;

    @Override
    public List<PmsProductCategoryVo> selectProductCategoryList() {
        List<PmsProductCategory> categoryList = pmsProductCategoryMapper.selectProductCategoryList();
        PageDomain pageDomain = TableSupport.buildPageRequest();
        long tatol = 0;
        pmsProductCategoryList = categoryList;
        List pmsProductCategoryVoList = new ArrayList<>();
        for (PmsProductCategory pmsProductCategory :
                pmsProductCategoryList) {
            if (pmsProductCategory.getParentId() == 0) {
                PmsProductCategoryVo vo = new PmsProductCategoryVo();
                BeanUtils.copyProperties(pmsProductCategory, vo);
                vo.setChildren(getPmsProductCategoryVo(vo));
                pmsProductCategoryVoList.add(vo);
                tatol++;
            }
        }
        new PageInfo(pmsProductCategoryVoList).setTotal(10);
        int startIndex = (pageDomain.getPageNum() - 1) * pageDomain.getPageSize();
        int endIndex = pageDomain.getPageNum()  * pageDomain.getPageSize();
        ServletUtils.getRequest().setAttribute("total",tatol);
        return pmsProductCategoryVoList.subList(startIndex, Math.min(endIndex, pmsProductCategoryVoList.size()));
    }

    @Override
    public int updateProductCategory(PmsProductCategory productCategory) {
        return pmsProductCategoryMapper.updateCategory(productCategory);
    }

    @Override
    public int insertCategory(AddCategoryReq productCategory) {
        int hasParentId = pmsProductCategoryMapper.selectByParentCategoryId(productCategory.getParentId());
        if (hasParentId == 0) {
            throw new ServiceException("父分类不存在");
        }
        return pmsProductCategoryMapper.insertCategory(productCategory);
    }

    @Override
    public int deleteCategory(Long[] ids) {
        return pmsProductCategoryMapper.deleteCategory(ids);
    }

    public List<PmsProductCategoryVo> getPmsProductCategoryVo(PmsProductCategoryVo pmsProductCategoryVo) {
        List voList = new ArrayList<>();
        for (PmsProductCategory category :
                pmsProductCategoryList) {
            if (category.getParentId() == pmsProductCategoryVo.getId()) {
                PmsProductCategoryVo vo = new PmsProductCategoryVo();
                BeanUtils.copyProperties(category, vo);
                vo.setChildren(getPmsProductCategoryVo(vo));
                voList.add(vo);
            }
        }
        return voList;
    }
}
