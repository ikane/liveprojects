package com.liveproject.openbankinapp.integration.openbanking.api;

import com.liveproject.openbankinapp.domain.Transaction;

import java.util.List;

public interface TransactionApiClient {

	 List<Transaction> findTransactions(String accountNumber);
}
