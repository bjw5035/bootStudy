package com.study.boardStudy.service;

import com.study.boardStudy.vo.JoinVO;
import com.study.boardStudy.vo.LoginVO;

public interface UserService {

    JoinVO join(JoinVO joinVO);
    void login(LoginVO loginVO) throws Exception;

}

