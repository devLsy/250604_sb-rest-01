package com.lsy.sbrest01.member.service;

import com.lsy.sbrest01.member.mapper.MemberMapper;
import com.lsy.sbrest01.member.model.MemberVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    public final MemberMapper memberMapper;

    @Override
    public int insertMember() throws Exception {
        return 0;
    }

    @Override
    public MemberVo selectMemberById(String memberId) throws Exception {
        return null;
    }

    @Override
    public List<MemberVo> selectAllMembers() throws Exception {
        return List.of();
    }

    @Override
    public int deleteMember(String memberId) throws Exception {
        return 0;
    }
}
