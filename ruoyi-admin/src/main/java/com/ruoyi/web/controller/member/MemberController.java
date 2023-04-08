package com.ruoyi.web.controller.member;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.member.domain.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.member.service.MemberService;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/26 11:37 PM
 * @PackageName:com.ruoyi.web.controller.member
 * @ClassName: memberController
 * @Description: TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/member")
public class MemberController extends BaseController {
    @Autowired
    MemberService memberService;
    /**
     * 获取会员列表
     */
    @GetMapping("/list")
    public AjaxResult list(UmsMember member)
    {
        startPage();
        List<UmsMember> list = memberService.selectMemberList(member);
//        return getDataTable(list);
        return AjaxResult.success(list);

    }
}
