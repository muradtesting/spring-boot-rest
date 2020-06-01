package com.example.springbootrestclient.repository;

import com.example.springbootrestclient.entity.LogEntity;
import com.example.springbootrestclient.model.LogDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<LogEntity,Long> {
}
