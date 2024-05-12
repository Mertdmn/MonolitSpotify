package com.mert.MonolitSpotify.service;

import com.mert.MonolitSpotify.repository.MuzikSanatciRepository;
import com.mert.MonolitSpotify.repository.entity.MuzikSanatci;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MuzikSanatciService {
    private final MuzikSanatciRepository repository;

    public void save(MuzikSanatci entity){
        repository.save(entity);
    }
}
