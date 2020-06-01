package com.example.springbootrestclient.service;

import com.example.springbootrestclient.model.ChildLogDto;
import com.example.springbootrestclient.model.LogDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.tempuri.Calculator;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    Logger logger = LoggerFactory.getLogger(CalculatorServiceImpl.class);
    Calculator calculator = new Calculator();
    @Autowired
    LogService logService;
    @Autowired
    ChildLogService childLogService;
    @Autowired
    LogDto logDto;
    @Autowired
    ChildLogDto childLogDto;
    Long i = Long.valueOf(1);

    @Override
    public String getStringAdd(int value1, int value2) {
        logger.info(" Call " + i + " Request to SOAP");
        String result = String.valueOf(calculator.getCalculatorSoap().add(value1, value2));
        logger.info(" Call " + i + " Response from SOAP");
        i++;
        return result;
    }


    @Override
    public String getStringDivide(int value1, int value2) {
        logger.info(" Call " + i + " Request to SOAP");
        String result = String.valueOf(calculator.getCalculatorSoap().divide(value1, value2));
        logger.info(" Call " + i + " Response from SOAP");
        i++;
        return result;
    }


    @Override
    public String getStringMultiple(int value1, int value2) {

        logger.info(" Call " + i + " Request to SOAP");
        String result = String.valueOf(calculator.getCalculatorSoap().multiply(value1, value2));
        logger.info(" Call " + i + " Response from SOAP");
        i++;
        return result;

    }

    @Override
    public String getStringSubtract(int value1, int value2) {
        logger.info(" Call " + i + " Request to SOAP");
        String result = String.valueOf(calculator.getCalculatorSoap().subtract(value1, value2));
        logger.info(" Call " + i + " Response from SOAP");
        i++;
        return result;

    }
}
