package com.sanghun.springboot.service;

import com.sanghun.springboot.domain.posts.PostsRepository;
import com.sanghun.springboot.web.dto.PostsSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDTO requestDTO) {
        return postsRepository.save(requestDTO.toEntity()).getId();
    }
}
