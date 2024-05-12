package com.mert.MonolitSpotify.service;

import com.mert.MonolitSpotify.repository.FollowRepository;
import com.mert.MonolitSpotify.repository.entity.Follow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FollowService {
    private final FollowRepository repository;
    public void save(Follow follow){
        repository.save(follow);
    }
}
