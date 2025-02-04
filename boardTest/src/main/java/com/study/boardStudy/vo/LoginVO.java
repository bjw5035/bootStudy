package com.study.boardStudy.vo;

import lombok.Getter;
import lombok.Setter;

/*
* Annotation을 사용하지 않고 직접적으로 사용해 보기위함
* */
@Setter
@Getter
public class LoginVO {

    private String userId;
//    private String userName;
    private String userPw;

    public LoginVO(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }

//    public UserVO(UserVO userVO) {
//        this.userId = userVO.getUserId();
//        this.userPw = userVO.getUserPw();
//    }

    public LoginVO() {}

    @Override
    public String toString() {
        return "UserVO{" +
            "userId='" + userId + '\'' +
            ", userPw='" + userPw + '\'' +
            '}';
    }
}
