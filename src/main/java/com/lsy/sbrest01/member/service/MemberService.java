package com.lsy.sbrest01.member.service;

import com.lsy.sbrest01.member.model.MemberVo;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface MemberService {

    public ResponseEntity insertMember(MemberVo memberVo, BindingResult br) throws Exception;
    MemberVo selectMemberById(String memberId) throws Exception;
    public List<MemberVo> selectAllMembers() throws Exception;
    public int deleteMember(String memberId) throws Exception;
}
