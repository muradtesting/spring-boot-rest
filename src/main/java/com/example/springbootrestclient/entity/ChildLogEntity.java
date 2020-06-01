package com.example.springbootrestclient.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_child_logging")
public class ChildLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "insert_date")
    private LocalDate insertDate;
    @NotNull
    @Column(name = "parent_id")
    private Long parent_id;

    @NotNull
    @Column(name = "file")
    private Byte[] file;

    @PrePersist
    protected void onCreate() {

        insertDate = LocalDate.now();
    }

    public ChildLogEntity() {
    }


    public ChildLogEntity(Long id,Long parent_id) {
        this.parent_id = parent_id;
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public Byte[] getFile() {
        return file;
    }

    public void setFile(Byte[] file) {
        this.file = file;
    }
}
