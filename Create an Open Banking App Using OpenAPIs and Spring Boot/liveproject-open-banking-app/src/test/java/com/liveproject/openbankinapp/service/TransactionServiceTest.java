package com.liveproject.openbankinapp.service;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.integration.openbanking.api.TransactionApiClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.codehaus.groovy.runtime.InvokerHelper.asList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

    @InjectMocks
    private TransactionService transactionService;

    @Mock
    TransactionApiClient transactionApiClient;


    @Test
    void findAllByAccountNumber() {
        //Given
        String accountNumber = "1234566789";
        Transaction transaction = Transaction.builder()
                                             .accountNumber(accountNumber)
                                             .build();
        when(transactionApiClient.findTransactions(anyString())).thenReturn(asList(transaction));

        //When
        List<Transaction> transactions = this.transactionService.findAllByAccountNumber(accountNumber);

        //Then
        assertThat(transactions).isNotEmpty();
    }
}