package com.example.springbootrestclient.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

       String  getStringAdd(int value1,int value2);

       String  getStringDivide(int value1,int value2);

       String  getStringMultiple(int value1,int value2);

       String  getStringSubtract(int value1,int value2);
}
