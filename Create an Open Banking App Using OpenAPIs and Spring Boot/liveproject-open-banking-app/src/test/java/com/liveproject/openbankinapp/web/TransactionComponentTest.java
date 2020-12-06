package com.liveproject.openbankinapp.web;

import com.liveproject.openbankinapp.service.TransactionService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;


public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    void testApplicationEndToEnd() {
        RestAssuredMockMvc.given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:%s/transactions/1234", this.port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
