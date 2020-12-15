package com.liveproject.openbankinapp.service;


import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.repository.MerchantDetailsRepository;
import com.liveproject.openbankinapp.integration.openbanking.api.TransactionApiClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    static final Logger LOGGER = LoggerFactory.getLogger(TransactionService.class);

    private static final String BACKEND = "openBanking";


    final MerchantDetailsRepository merchantDetailsRepository;

    final TransactionApiClient transactionApiClient;

    public TransactionService(
            MerchantDetailsRepository merchantDetailsRepository,
            TransactionApiClient transactionApiClient
    ) {
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.transactionApiClient = transactionApiClient;
    }

    @CircuitBreaker(name = BACKEND, fallbackMethod = "fallback")
    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return this.transactionApiClient.findTransactions(accountNumber);
    }

    public List<Transaction> fallback(String accountNumber) {
        LOGGER.info("CircuitBreaker Open: calling fallback method...");
        return Collections.emptyList();
    }
}
