package com.example.springbootrestclient.model;
import com.example.springbootrestclient.entity.ChildLogEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.IOException;
@Component
public class ChildLogDto {
    @NotNull
    private Long id;
    @NotNull
    private MultipartFile multipartFile;
    @NotNull
    private Long parent_id;


    public ChildLogDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public ChildLogEntity toEntity(){
        ChildLogEntity entity=new ChildLogEntity();
        entity.setId(getId());
        Byte[] byteObjects;
        try {
            byteObjects = new Byte[multipartFile.getBytes().length];
            int i = 0;

            for (byte b : multipartFile.getBytes()) {
                byteObjects[i++] = b;
            }
            entity.setFile(byteObjects);
        } catch (IOException e) {
            e.printStackTrace();
        }
        entity.setParent_id(getParent_id());
        return entity;
    }
    }

