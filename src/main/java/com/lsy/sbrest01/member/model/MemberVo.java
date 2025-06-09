package com.lsy.sbrest01.member.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberVo {
    // 통합회원
    @NotBlank
    private String memberId;

    @NotBlank
    private String name;

    @NotBlank @Email
    private String email;

    @Schema(hidden = true)
    private LocalDateTime createdAt;
}
