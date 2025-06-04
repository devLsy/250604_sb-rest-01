package com.lsy.sbrest01.member.service;

import com.lsy.sbrest01.member.model.MemberVo;

import java.util.List;

public interface MemberService {

    public int insertMember() throws Exception;
    MemberVo selectMemberById(String memberId) throws Exception;
    public List<MemberVo> selectAllMembers() throws Exception;
    public int deleteMember(String memberId) throws Exception;
}
