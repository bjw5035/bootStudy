package com.study.boardStudy.service;

import com.study.boardStudy.dao.admin.BoardDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    private Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);

    private BoardDAO boardDAO;

    public String content(int id, String title, String content, String author) {

//        try{
//            boardRepository.boardInsert(id, title, content, author);
//            logger.info("Post Success");
//        }catch (Exception e){
//            logger.error(e.getMessage() + "Post Error");
//        }

        return "Post Success";
    };
}
