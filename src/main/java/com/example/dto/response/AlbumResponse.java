package com.example.dto.response;

import lombok.Data;

public class AlbumResponse {

    @Data
    public static class InnerAlbumResponse {
        private String name;

        private String description; // 描述可以為空，去掉 @NotBlank

        private String coverImageUrl; // 封面可以為空，去掉 @NotBlank

        private Integer privacyType; // 改用 @NotNull
    }
}
