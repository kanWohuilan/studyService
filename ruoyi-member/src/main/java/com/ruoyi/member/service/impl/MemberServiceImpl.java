package com.ruoyi.member.service.impl;

import com.ruoyi.member.domain.UmsMember;
import com.ruoyi.member.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.service.MemberService;

import java.util.List;

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

    @Override
    public List<UmsMember> selectMemberList(UmsMember umsMember) {


        return umsMemberMapper.selectMemberList(umsMember);
    }
}
