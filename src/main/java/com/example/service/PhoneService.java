package com.example.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.common.ServiceResult;

/**
 * 相冊模塊
 */
public interface PhoneService {

    /**
     * 初始化
     */
    void getInit();

    ServiceResult<Integer> insertPhone(List<MultipartFile> files);
}
