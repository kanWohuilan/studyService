package com.ruoyi.member.service.impl;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.entity.Member;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.member.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.service.MemberService;

/**
 * @Author FGQ
 * @Date 2023/3/30 11:37 PM
 * @PackageName:service.impl
 * @ClassName: MemberServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    UmsMemberMapper umsMemberMapper;

//    @Override
//    public List<Member> selectMemberList(Member umsMember) {
//
//
//        return umsMemberMapper.selectMemberList(umsMember);
//    }
    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    @Override
    public Member selectUserByUserName(String userName)
    {
        return umsMemberMapper.selectUserByUserName(userName);
    }

    @Override
    public String checkUserNameUnique(Member user) {
        Long userId = StringUtils.isNull(user.getUserId()) ? -1L : user.getUserId();
        Member info = umsMemberMapper.checkUserNameUnique(user.getUserName());
        if (StringUtils.isNotNull(info) && info.getUserId().longValue() != userId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    @Override
    public Boolean registerUser(Member member) {
        return umsMemberMapper.insertUser(member) > 0;
    }
}
