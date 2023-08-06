package com.ruoyi.web.controller.member;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginBody;
import com.ruoyi.common.core.domain.model.RegisterBody;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.web.service.SysLoginService;
import com.ruoyi.framework.web.service.SysRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    private  MemberService memberService;
    @Autowired
    private SysRegisterService registerService;
    @Autowired
    private SysLoginService loginService;
    /**
     * 获取会员列表
     */
//    @GetMapping("/list")
//    public AjaxResult list(UmsMember member)
//    {
//        startPage();
//        List<UmsMember> list = memberService.selectMemberList(member);
////        return getDataTable(list);
//        return AjaxResult.success(list);
//
//    }
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid());
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }
    @PostMapping("/register")
    public AjaxResult register(@RequestBody RegisterBody user)
    {
//        if (!("true".equals(configService.selectConfigByKey("sys.account.registerUser"))))
//        {
//            return error("当前系统没有开启注册功能！");
//        }
        String msg = registerService.memberRegister(user);
        return StringUtils.isEmpty(msg) ? success() : error(msg);
    }
//    /**
//     * 获取用户信息
//     *
//     * @return 用户信息
//     */
    @GetMapping("/getInfo")
    public AjaxResult getInfo()
    {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        // 角色集合
//        Set<String> roles = permissionService.getRolePermission(user);
//        // 权限集合
//        Set<String> permissions = permissionService.getMenuPermission(user);
        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
//        ajax.put("roles", roles);
//        ajax.put("permissions", permissions);
        return ajax;
    }

}
