package com.study.boardStudy.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JoinVO {

    private Long joinId;
    private String joinName;
    private String joinPw;

    public JoinVO() {}

    public JoinVO(Long joinId, String joinName, String joinPw) {
        this.joinId = joinId;
        this.joinName = joinName;
        this.joinPw = joinPw;
    }

    @Override
    public String toString() {
        return "JoinVO{" +
            "joinId=" + joinId +
            ", joinName='" + joinName + '\'' +
            ", joinPw='" + joinPw + '\'' +
            '}';
    }
}
