package com.example.springbootrestclient.model;

import com.example.springbootrestclient.entity.LogEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.IOException;

@Component

public class LogDto {
    @NotNull
    private Long id;

    public LogDto() {
    }

    public LogDto(LogEntity entity) {
        this.id = entity.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LogEntity toEntity() {
        LogEntity entity = new LogEntity();
        entity.setId(getId());

        return entity;
    }
}

