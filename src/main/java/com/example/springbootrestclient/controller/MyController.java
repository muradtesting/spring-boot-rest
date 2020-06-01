package com.example.springbootrestclient.controller;
import com.example.springbootrestclient.dialect.MyDialect;
import com.example.springbootrestclient.entity.LogEntity;
import com.example.springbootrestclient.model.ChildLogDto;
import com.example.springbootrestclient.service.ChildLogService;
import com.example.springbootrestclient.service.LogService;
import com.example.springbootrestclient.model.CalcRequest;
import com.example.springbootrestclient.model.LogDto;
import liquibase.pro.packaged.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/calculator")
public class MyController {
    @Autowired
    LogService logService;
    @Autowired
    ChildLogService childLogService;

    @Autowired
    MyDialect myDialect;
    @Autowired
    LogDto logDto;
    @Autowired
    ChildLogDto childLogDto;
    Logger logger = LoggerFactory.getLogger(MyController.class);
    Long i= Long.valueOf(1);
    @PostMapping(value = "/do-add",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendAdd(@RequestBody CalcRequest request){
       try {

           logger.info(" Call " + i + " Request to JSON");
           String addResult = myDialect.getStringAdd(request.getValue1(), request.getValue2());
           MultipartFile multipartFile = new MockMultipartFile("api.log", new FileInputStream(new File("src/main/resources/logs/api.log")));
           logService.addLog(logDto);
           childLogDto.setMultipartFile(multipartFile);
           childLogDto.setParent_id(i);
           childLogService.addLog(childLogDto);
           i++;
           return   addResult;
       } catch (Exception e){
           return null;
       }

    }

    @PostMapping(value = "/do-divide",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendDivide(@RequestBody CalcRequest request){
        try {

            logger.info(" Call " + i + " Request to JSON");
            String  addResultDivide=  myDialect.getStringDivide(request.getValue1(),request.getValue2());
            MultipartFile multipartFile = new MockMultipartFile("api.log", new FileInputStream(new File("src/main/resources/logs/api.log")));
            logService.addLog(logDto);
            childLogDto.setMultipartFile(multipartFile);
            childLogDto.setParent_id(i);
            childLogService.addLog(childLogDto);
            i++;
            return   addResultDivide;
        } catch (Exception e){
            return null;
        }
    }

    @PostMapping(value = "/do-multiple",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendMultiple(@RequestBody CalcRequest request){
        try {

            logger.info(" Call " + i + " Request to JSON");
            String  result=  myDialect.getStringMultiple(request.getValue1(),request.getValue2());
            logService.addLog(logDto);
            MultipartFile multipartFile = new MockMultipartFile("api.log", new FileInputStream(new File("src/main/resources/logs/api.log")));
            childLogDto.setMultipartFile(multipartFile);
            childLogDto.setParent_id(i);
            childLogService.addLog(childLogDto);
            i++;
            return   result;
        } catch (Exception e){
            return null;
        }
    }


    @PostMapping(value = "/do-subtract",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendSubtract(@RequestBody CalcRequest request) {
        try {

            logger.info(" Call " + i + " Request to JSON");
            String result = myDialect.getStringSubtract(request.getValue1(), request.getValue2());
            logService.addLog(logDto);
            MultipartFile multipartFile = new MockMultipartFile("api.log", new FileInputStream(new File("src/main/resources/logs/api.log")));
            childLogDto.setMultipartFile(multipartFile);
            childLogDto.setParent_id(i);
            childLogService.addLog(childLogDto);
            i++;
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
