package com.study.boardStudy.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
@RequestMapping("/error")
public class ErrorController {

    private Logger logger = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping(value = "LoginError", method = RequestMethod.GET)
    public String loginErrorPage() {
        logger.info("Login Error Page 테스트");
        return "/LoginError";
    }


}
