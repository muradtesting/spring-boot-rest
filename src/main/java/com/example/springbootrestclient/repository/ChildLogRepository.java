package com.example.springbootrestclient.repository;

import com.example.springbootrestclient.entity.ChildLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildLogRepository extends JpaRepository<ChildLogEntity,Long> {
}
