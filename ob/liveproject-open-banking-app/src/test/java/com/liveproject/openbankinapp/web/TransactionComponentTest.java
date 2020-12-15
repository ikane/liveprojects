package com.liveproject.openbankinapp.web;

import com.liveproject.openbankinapp.integration.openbanking.api.TransactionApiClient;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import okhttp3.HttpUrl;
import okhttp3.mockwebserver.MockWebServer;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.io.IOException;

@SpringBootTest
public class TransactionComponentTest {

    //@LocalServerPort
    private int port = 8080;

    @Autowired
    TransactionApiClient transactionApiClient;

    @Test
    void testApplicationEndToEnd() throws IOException {

        MockWebServer server = new MockWebServer();
        //HttpUrl url = server.url("http://localhost:9999/open-banking/v3.1/aisp");

        server.start(8090);

       /*

        TransactionApiClient transactionApiClient = new ResTransactionApiClient(url.toString(),
                                                                                new OBTransactionAdapter());
        TransactionService transactionService = new TransactionService(
                new InMemoryMerchantDetailsRepository(),
                transactionApiClient
        );

        //WebClient webClient = Mockito.spy(WebClient.create(server.url("/").toString()));

        RestAssuredMockMvc.given().standaloneSetup(this.transactionApiClient)
                          .when()
                          .get(String.format("http://localhost:%s/transactions/1234", this.port))
                          .then()
                          .statusCode(Matchers.is(200));
*/

        server.shutdown();
    }
}
