package com.zyj.test.apitest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)   // JsonIgnoreProperties在进行序列化和反序列化的时候忽略为空的字段
public class BlogDTO {

    private String name;
    private String description;
    private String url;


    public BlogDTO() {}

    //don't:
    public BlogDTO(String name, String description, String url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public BlogDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BlogDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public BlogDTO setUrl(String url) {
        this.url = url;
        return this;
    }
}
