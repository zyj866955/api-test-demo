package com.zyj.test.apitest.util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

/**
 * Author: zhouyajun
 * Date: 2019-11-20
 */
public class HttpClientUtil {

    private static RequestSpecification spec;

    static {
        spec = new RequestSpecBuilder()
                .setBaseUri("")
                .setContentType(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public static String postWithObject(String path, Object bodyPayload) {
        return given().spec(spec)
                .body(bodyPayload)
                .when()
                .post(path)
                .then()
                .statusCode(200)
                .extract().header("location");
    }

    public static <T> T getWithParams(String path, Class<T> responseClass){
        return given().spec(spec)
                .when()
                .get(path)
                .then()
                .statusCode(200)
                .extract()
                .as(responseClass);
    }
}
