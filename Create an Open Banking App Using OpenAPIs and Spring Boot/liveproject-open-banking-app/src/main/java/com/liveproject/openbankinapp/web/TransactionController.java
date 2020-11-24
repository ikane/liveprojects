package com.liveproject.openbankinapp.web;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(path = "/transactions/{accountNumber}")
    public ResponseEntity<List<Transaction>> findTransactions(@PathVariable String accountNumber) {
        return ResponseEntity.ok(this.transactionService.findAllByAccountNumber(accountNumber));
    }
}
