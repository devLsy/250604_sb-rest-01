package com.lsy.sbrest01.member.service;

import com.lsy.sbrest01.member.mapper.MemberMapper;
import com.lsy.sbrest01.member.model.MemberVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.lsy.sbrest01.common.utils.ValidationUtil.invokeErrors;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    public final MemberMapper memberMapper;

    @Override
    public ResponseEntity insertMember(MemberVo memberVo, BindingResult br) throws Exception {
        // validation check
        if(br.hasErrors()) {
            invokeErrors(this.getClass().getName(), br);
        }

        Map<String, Object> returnMap = new HashMap<String, Object>();

        int result = memberMapper.insertMember(memberVo);

        returnMap.put("result", result > 0 ? "success" : "fail");
        return new ResponseEntity<>(returnMap, HttpStatus.OK);
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
