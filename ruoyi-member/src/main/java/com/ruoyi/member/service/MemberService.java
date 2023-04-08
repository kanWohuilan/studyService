package com.ruoyi.member.service;

import com.ruoyi.member.domain.UmsMember;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service
 * @ClassName: MemberService
 * @Description: TODO
 * @Version 1.0
 */
public interface MemberService {
    List<UmsMember> selectMemberList(UmsMember umsMember);
}
