package com.liveproject.openbankinapp;

import com.liveproject.openbankinapp.service.TransactionService;
import com.liveproject.openbankinapp.web.TransactionController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
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
