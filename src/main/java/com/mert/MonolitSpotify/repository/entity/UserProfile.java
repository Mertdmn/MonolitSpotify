package com.mert.MonolitSpotify.repository.entity;

import com.mert.MonolitSpotify.utility.enums.State;
import com.mert.MonolitSpotify.utility.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_userprofile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String resimUrl;
    int followercount;
    int followingcount;
    Long createAt;
    Long updateAt;
    @Enumerated(EnumType.STRING)
    UserType userType;
    @Enumerated(EnumType.STRING)
    State state;
}
