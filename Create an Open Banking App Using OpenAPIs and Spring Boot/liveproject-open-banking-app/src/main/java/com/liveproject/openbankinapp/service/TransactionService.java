package com.liveproject.openbankinapp.service;


import com.liveproject.openbankinapp.domain.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        Transaction transaction = Transaction.builder()
                .accountNumber("123456")
                .build();
        return  asList(transaction);
    }
}
