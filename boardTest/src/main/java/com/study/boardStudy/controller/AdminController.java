package com.study.boardStudy.controller;

import com.study.boardStudy.service.UserService;
import com.study.boardStudy.vo.JoinVO;
import com.study.boardStudy.vo.LoginVO;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    /*
     * 로그인 페이지
     * */
    @GetMapping(value = "/auth/Login")
    public String loginPage() throws Exception {
        logger.info("Login Page 이동입니다.");
        return "/auth/Login";
    }

    /**
     * 로그인 기능 로직
     *
     * @param userId
     * @param userPw
     * @param model
     * @param session
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/auth/Login")
    public void login(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw, Model model, HttpSession session) throws Exception {
        logger.info("userId : " + userId);
        logger.info("Data userId: " + userId + "userPw : " + userPw);

        LoginVO loginVO = new LoginVO();
        loginVO.setUserId(userId);
        loginVO.setUserPw(userPw);
        logger.info("userVO : " + loginVO);

        userService.login(loginVO);

    }

    /**
     * 회원가입
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/auth/Signup")
    public String join() throws Exception {
        return "/auth/Signup";
    }
    
    @PostMapping(value = "/auth/Signup")
    public String join(@RequestParam("joinId") Long joinId, @RequestParam("joinPw") String joinPw, @RequestParam("joinName") String joinName) throws Exception {
        logger.info("joinId : " + joinId + "joinPw : " + joinPw + "joinName : " + joinName);
        JoinVO joinVO = new JoinVO();
        joinVO.setJoinId(joinId);
        joinVO.setJoinPw(joinPw);
        joinVO.setJoinName(joinName);

        userService.join(joinVO);
        return "redirect:/board";
    }
}
