package com.mert.MonolitSpotify.controller;

import com.mert.MonolitSpotify.dto.request.SaveMuzikRequestDto;
import com.mert.MonolitSpotify.dto.response.FindAllMuzikResponseDto;
import com.mert.MonolitSpotify.service.MuzikService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.mert.MonolitSpotify.constants.RestApi.*;

@RestController
@RequestMapping(MUZIK)
@RequiredArgsConstructor
public class MuzikController {
    private final MuzikService muzikService;
    @PostMapping(SAVE)
    public ResponseEntity<Void> saveMuzik(@RequestBody @Valid SaveMuzikRequestDto dto){
        muzikService.save(dto);
        return  ResponseEntity.ok().build();

    }
    @GetMapping(FINDALL)
    public ResponseEntity<FindAllMuzikResponseDto> findAll(){
        FindAllMuzikResponseDto result = muzikService.findAll();
        return ResponseEntity.ok(muzikService.findAll());
    }


}
