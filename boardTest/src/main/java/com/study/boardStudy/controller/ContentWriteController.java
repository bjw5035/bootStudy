package com.study.boardStudy.controller;

import com.study.boardStudy.service.BoardService;
import com.study.boardStudy.vo.PostVO;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller(value = "/contentWrite")
@RequiredArgsConstructor
public class ContentWriteController {

    private BoardService boardService;

    /**
     * 글쓰기 화면
     * @param model
     * @return
     */
    @GetMapping(value = "/Write")
    public String writeView(Model model) {
        return "/contentWrite/Write";
    }

    /**
     * 글쓰기 기능 로직
     * @param userId
     * @param model
     * @return
     */
    @PostMapping(value = "/Write")
    public String contentWrite(@SessionAttribute(name = "userId", required = false) String userId, Model model) {

        if (userId == null) {
            return "/auth/Login";
        }

        List<PostVO> postList = new ArrayList<>();
        postList.add(new PostVO(1, "테스트1", "글쓰기 테스트1", "2024-12-13"));
        postList.add(new PostVO(2, "테스트2", "글쓰기 테스트2", "2024-12-12"));

        model.addAttribute("postList", postList);
//        return "Write";
        return model.toString();
    }

}
