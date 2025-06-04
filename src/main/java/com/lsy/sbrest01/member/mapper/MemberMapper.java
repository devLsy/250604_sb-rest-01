package com.lsy.sbrest01.member.mapper;

import com.lsy.sbrest01.member.model.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    int insertMember(MemberVo memberVo);
    MemberVo selectMemberById(String memberId);
    List<MemberVo> selectAllMembers();
    int deleteMember(String memberId);
}
