package com.ruoyi.product.rest;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author FGQ
 * @Date 2023/5/7 4:13 PM
 * @PackageName:com.ruoyi.product.rest
 * @ClassName: DeleteRequest
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class DeleteRequest {
    @NotNull(message = "ids不能为空")
    @Size(min = 1, message = "ids不能为空数组")
    private Long[] ids;
}
