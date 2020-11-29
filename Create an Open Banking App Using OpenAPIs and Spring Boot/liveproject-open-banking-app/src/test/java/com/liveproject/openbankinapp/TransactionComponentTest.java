package com.liveproject.openbankinapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.get;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TransactionComponentTest {

    @Test
    void should_fetch_transactions() {
        get("/transactions/1234").then().assertThat().statusCode(200);
    }
}
