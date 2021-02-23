package com.codeclan.example.Spring_Annotation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file")
    private String name;

    @Column(name = "file_extension")
    private String fileExtension;

    @Column(name = "file_size")
    private String fileSize;

    @ManyToOne
    @JsonIgnoreProperties({"files"})
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String fileExtension, String fileSize, Folder folder) {
        this.name = name;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.folder = folder;
    }

    public File(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String name) {
        this.name = fileExtension;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
