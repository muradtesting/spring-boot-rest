package com.example.springbootrestclient.service;

import com.example.springbootrestclient.entity.LogEntity;
import com.example.springbootrestclient.model.LogDto;
import com.example.springbootrestclient.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository repository;
    @Override
    public LogEntity addLog(LogDto logDto) {
        return repository.save(logDto.toEntity());
    }

}
