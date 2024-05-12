package com.mert.MonolitSpotify.dto.response;

import com.mert.MonolitSpotify.repository.view.VwUserProfile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindAllUserProfileResponseDto {
//    Long id;
//    String userName;
//    String resimUrl;

    int statucCode;
    String message;
    int currentPage;
    boolean hasNext;
    List<VwUserProfile> data;
}
