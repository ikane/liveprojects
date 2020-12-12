package com.liveproject.openbankinapp.web;

import com.liveproject.openbankinapp.repository.InMemoryMerchantDetailsRepository;
import com.liveproject.openbankinapp.service.TransactionService;
import com.liveproject.openbankinapp.web.adapter.OBTransactionAdapter;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import okhttp3.HttpUrl;
import okhttp3.mockwebserver.MockWebServer;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;


public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    void testApplicationEndToEnd() throws IOException {

        MockWebServer server = new MockWebServer();
        HttpUrl url = server.url("http://localhost:9999/open-banking/v3.1/aisp");

       /*

        TransactionApiClient transactionApiClient = new ResTransactionApiClient(url.toString(),
                                                                                new OBTransactionAdapter());
        TransactionService transactionService = new TransactionService(
                new InMemoryMerchantDetailsRepository(),
                transactionApiClient
        );

        //WebClient webClient = Mockito.spy(WebClient.create(server.url("/").toString()));

        RestAssuredMockMvc.given().standaloneSetup(new TransactionController(transactionService))
                .when()
                .get(String.format("http://localhost:%s/transactions/1234", this.port))
                .then()
                .statusCode(Matchers.is(200));

        */
        server.shutdown();

    }
}
