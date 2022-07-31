package com.sanghun.springboot.web;

import com.sanghun.springboot.service.PostsService;
import com.sanghun.springboot.web.dto.PostsSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class PostsApiController {
private final PostsService postsService;
@PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDTO requestDTO){
    return postsService.save(requestDTO);
}
}
