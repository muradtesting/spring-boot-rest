package com.example.springbootrestclient.entity;


import org.springframework.stereotype.Component;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_logging")
@Component
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "insert_date")
    private LocalDate insertDate;


    @PrePersist
    protected void onCreate() {

        insertDate = LocalDate.now();
    }
    public LogEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
