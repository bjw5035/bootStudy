package com.bootStudy.board.controller;

import com.bootStudy.board.entity.Post;
import com.bootStudy.board.service.PostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final PostService postService;

    /*
     * 글 목록
     * */
    @GetMapping
    public List<Post> getAllPost() {
        return postService.findAll();
    }

    /*
     * 글 상세
     * */
    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        return postService.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());

    }

    /*
     * 글 작성
     * */
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savePost = postService.save(post);
        return ResponseEntity.ok(savePost);
    }

    /*
     * 글 삭제
     * */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        postService.delete(id);
        return ResponseEntity.ok().build();
    }

}
