package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PhotoEntity;

@Repository
public interface PhoneRepository extends JpaRepository<PhotoEntity, String> {

}
