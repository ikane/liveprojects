package com.liveproject.openbankinapp.service;

import com.liveproject.openbankinapp.domain.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    private TransactionService transactionService;

    @BeforeEach
    void setup() {
        this.transactionService = new TransactionService();
    }

    @Test
    void findAllByAccountNumber() {
        //Given
        String accountNumber = "1234566789";

        //When
        List<Transaction> transactions = this.transactionService.findAllByAccountNumber(accountNumber);

        //Then
        assertThat(transactions).isNotEmpty();
    }
}