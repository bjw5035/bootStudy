package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.UserDAO;
import com.study.boardStudy.vo.JoinVO;
import com.study.boardStudy.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserDAO userDAO; // DAO

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public JoinVO join(JoinVO joinVO) {
        return userDAO.join(joinVO);
    }

    public void login(LoginVO loginVO) throws Exception {
        logger.info("Impl 데이터 확인 : " + loginVO);
        userDAO.memberLogin(loginVO);
    }
}
