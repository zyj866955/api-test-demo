package com.zyj.test.apitest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogListDTO {

    //we leave out offset and limit, because we are not interested in this fields.
    public int count;
    public List<BlogReference> blogs;

    public static class BlogReference{
        public int id;
        public String name;
        public String href;
    }
}
