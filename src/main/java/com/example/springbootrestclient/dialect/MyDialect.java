package com.example.springbootrestclient.dialect;

import com.example.springbootrestclient.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDialect {
    @Autowired
    CalculatorService calculatorService;

    public String getStringAdd(int value1,int value2){
        return calculatorService.getStringAdd(value1,value2);
    }
    public String getStringDivide(int value1,int value2){
        return calculatorService.getStringDivide(value1,value2);
    }
    public String getStringMultiple(int value1,int value2){
        return calculatorService.getStringMultiple(value1,value2);
    }

    public String getStringSubtract(int value1,int value2){
        return calculatorService.getStringSubtract(value1,value2);
    }
}
