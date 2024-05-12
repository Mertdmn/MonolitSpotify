package com.mert.MonolitSpotify.dto.request;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaveMuzikRequestDto {
    @NotNull // muzikUrl tanımlı olarak gelmemiş ise
    @NotBlank // muzikUrl = ""
    String muzikUrl;
    @NotNull
    @NotBlank
    String name;
    String kapakResmi;
    @NotNull
    @NotBlank
    String tur;
    int sure;
    String aciklama;

}
