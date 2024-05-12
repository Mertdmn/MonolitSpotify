package com.mert.MonolitSpotify.service;

import com.mert.MonolitSpotify.repository.MuzikTuruRepository;
import com.mert.MonolitSpotify.repository.entity.MuzikTuru;
import com.mert.MonolitSpotify.utility.manager.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MuzikTuruService {
    private final MuzikTuruRepository repository;
//    public MuzikTuruService(MuzikTuruRepository repository){
//        super(repository);
//        this.repository = repository;
//    }
}
