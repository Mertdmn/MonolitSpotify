package com.mert.MonolitSpotify.service;

import com.mert.MonolitSpotify.repository.CalmaListesiRepository;
import com.mert.MonolitSpotify.repository.entity.CalmaListesi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalmaListesiService {
    private final CalmaListesiRepository repository;
    public void save(CalmaListesi entity){
        repository.save(entity);
    }
}
