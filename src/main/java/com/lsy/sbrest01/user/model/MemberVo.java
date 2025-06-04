package com.lsy.sbrest01.user.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberVo {
    // 통합회원
    private String memberId;
    private String name;
    private String email;
    private LocalDateTime createdAt;
}
