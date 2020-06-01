package com.example.springbootrestclient.service;

import com.example.springbootrestclient.entity.ChildLogEntity;
import com.example.springbootrestclient.entity.LogEntity;
import com.example.springbootrestclient.model.ChildLogDto;
import com.example.springbootrestclient.model.LogDto;
import org.springframework.stereotype.Service;


@Service
public interface ChildLogService {

    ChildLogEntity addLog(ChildLogDto childLogDto);
}
