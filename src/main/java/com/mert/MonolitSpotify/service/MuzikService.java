package com.mert.MonolitSpotify.service;

import com.mert.MonolitSpotify.dto.request.SaveMuzikRequestDto;
import com.mert.MonolitSpotify.dto.response.FindAllMuzikResponseDto;
import com.mert.MonolitSpotify.mapper.MuzikMapper;
import com.mert.MonolitSpotify.repository.MuzikRepository;
import com.mert.MonolitSpotify.repository.entity.Muzik;
import com.mert.MonolitSpotify.utility.enums.State;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MuzikService {
    private final MuzikRepository repository;

    public void save(SaveMuzikRequestDto dto){
//        Muzik muzik = Muzik.builder()
//                .muzikUrl(dto.getMuzikUrl())
//                .aciklama(dto.getMuzikUrl())
//                .tur(dto.getTur())
//                .name(dto.getName())
//                .sure(dto.getSure())
//                .kapakResmi(dto.getKapakResmi())
//                .build();
//        Muzik muzik = new Muzik();
//        muzik.setMuzikUrl(dto.getMuzikUrl());
//        muzik.setName(dto.getName());

        Muzik muzik = MuzikMapper.INSTANCE.muzikFromDto(dto);
        muzik.setState(State.PENDING);
        repository.save(muzik);
//        repository.save(MuzikMapper.INSTANCE.muzikFromDto(dto));
    }


    public FindAllMuzikResponseDto findAll() {
        return FindAllMuzikResponseDto.builder()
                .statusCode(100)
                .message("Müzik listesi getirildi")
                .data(repository.findAll())
                .build();
    }
}
