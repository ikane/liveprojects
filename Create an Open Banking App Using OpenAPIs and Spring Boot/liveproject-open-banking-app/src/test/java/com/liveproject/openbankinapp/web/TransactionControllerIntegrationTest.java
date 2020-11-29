package com.liveproject.openbankinapp.web;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TransactionController.class)
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService transactionService;

    @Test
    void findTransactions() throws Exception {
        //Transaction transaction = Transaction.builder().accountNumber("12345").build();
        //when(this.transactionService.findAllByAccountNumber(any())).thenReturn(asList(transaction));

        mockMvc.perform(MockMvcRequestBuilders.get("/transactions/12345"))
                .andExpect(status().isOk());
    }
}