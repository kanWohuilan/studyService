package com.ruoyi.member.mapper;

import com.ruoyi.common.core.domain.entity.Member;

import java.util.List;

/**
 * @Author FGQ
 * @Date 2023/3/31 11:21 PM
 * @PackageName:com.ruoyi.member.mapper
 * @ClassName: UmsMemberMapper
 * @Description: TODO
 * @Version 1.0
 */

public interface UmsMemberMapper {
//    public List<Member> selectMemberList(Member member);
    public Member selectUserByUserName(String username);
    public int insertUser(Member member);

    public Member checkUserNameUnique(String name);
}