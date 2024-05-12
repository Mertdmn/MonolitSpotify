package com.mert.MonolitSpotify.repository;

import com.mert.MonolitSpotify.repository.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow,Long> {
}
