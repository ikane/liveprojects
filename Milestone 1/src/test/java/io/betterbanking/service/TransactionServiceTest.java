package io.betterbanking.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }
}