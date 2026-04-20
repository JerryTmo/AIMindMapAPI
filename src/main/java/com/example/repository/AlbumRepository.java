package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dto.response.AlbumResponse.InnerAlbumResponse;
import com.example.entity.AlbumEntity;

@Repository
public interface AlbumRepository extends JpaRepository<AlbumEntity, String> {
    /**
     * 檢查當前用戶名下相冊是否存在
     * 
     * @param name   用戶名
     * @param userId 相冊
     * @return boolean結果
     */
    boolean existsByNameAndUserId(String name, String userId);

    @Query("select name,description,coverImageUrl,privacyType from AlbumEntity a where a.id=:id ")
    InnerAlbumResponse findInnerAlbumById(@Param("id") Long id);
}
