package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        String text = "Hi my name is";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}