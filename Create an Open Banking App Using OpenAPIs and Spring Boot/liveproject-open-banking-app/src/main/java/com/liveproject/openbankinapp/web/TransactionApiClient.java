package com.liveproject.openbankinapp.web;

import com.liveproject.openbankinapp.domain.Transaction;

import java.util.List;

public interface TransactionApiClient {

	 List<Transaction> findTransactions(String accountNumber);
}
