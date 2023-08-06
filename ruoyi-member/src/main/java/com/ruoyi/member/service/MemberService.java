package com.ruoyi.member.service;

import com.ruoyi.common.core.domain.entity.Member;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service
 * @ClassName: MemberService
 * @Description: TODO
 * @Version 1.0
 */
public interface MemberService {
//    List<Member> selectMemberList(Member umsMember);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    public Member selectUserByUserName(String userName);
    public String checkUserNameUnique(Member user);
    public  Boolean registerUser (Member member);
}
