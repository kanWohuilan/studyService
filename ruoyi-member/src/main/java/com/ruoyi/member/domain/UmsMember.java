package com.ruoyi.member.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author FGQ
 * @Date 2023/3/26 11:53 PM
 * @PackageName:com.ruoyi.common.core.domain.entity
 * @ClassName: UmsMember
 * @Description: 会员对象实体类
 * @Version 1.0
 */
@Data
public class UmsMember extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;
}
