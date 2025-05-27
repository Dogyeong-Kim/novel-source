package com.example.novels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.novels.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {

}
