package com.example.springbootrestclient.service;

import com.example.springbootrestclient.entity.LogEntity;
import com.example.springbootrestclient.model.LogDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public interface LogService  {

    LogEntity addLog (LogDto logDto);
}
