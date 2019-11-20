package com.zyj.test.apitest;

import com.zyj.test.apitest.dto.BlogDTO;
import com.zyj.test.apitest.util.HttpClientUtil;
import org.junit.jupiter.api.Test;

/**
 * Author: zhouyajun
 * Date: 2019-11-20
 */
public class BlogTest {

    @Test
    void testCreateBlog(){

        BlogDTO newBlog = new BlogDTO()
                .setName("Example")
                .setDescription("Example")
                .setUrl("www.blogdomain.de");

        String location = HttpClientUtil.postWithObject("/blogs",newBlog);

    }
}
