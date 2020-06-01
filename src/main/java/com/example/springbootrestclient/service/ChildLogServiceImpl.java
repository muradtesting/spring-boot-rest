package com.example.springbootrestclient.service;

import com.example.springbootrestclient.entity.ChildLogEntity;
import com.example.springbootrestclient.model.ChildLogDto;
import com.example.springbootrestclient.repository.ChildLogRepository;
import liquibase.pro.packaged.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildLogServiceImpl implements ChildLogService{

    @Autowired
    private ChildLogRepository repository;

    @Override
    public ChildLogEntity addLog(ChildLogDto logDto) {
        return repository.save(logDto.toEntity());
    }
}
