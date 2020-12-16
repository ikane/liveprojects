package com.liveproject.openbankinapp.integration.openbanking.api;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.integration.openbanking.model.OBReadDataTransaction6;
import com.liveproject.openbankinapp.integration.openbanking.model.OBReadTransaction6;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResTransactionApiClient implements TransactionApiClient {

	private final WebClient webClient;

	private final OBTransactionAdapter obTransactionAdapter;

	public ResTransactionApiClient(
					@Value("${open-banking.baseUri}") String baseUrl,
					OBTransactionAdapter obTransactionAdapter
	) {
		this.webClient = WebClient.builder().baseUrl(baseUrl).build();
		this.obTransactionAdapter = obTransactionAdapter;
	}


	@Override
	public List<Transaction> findTransactions(String accountNumber) {
		List<Transaction> transactions = new ArrayList<>();

		OBReadTransaction6 obReadTransaction6 = this.webClient.get()
		                                                         .uri("/accounts/{accountId}/transactions", accountNumber)
		                                                         .retrieve()
		                                                         .bodyToMono(OBReadTransaction6.class)
		                                                         .block();
		if(obReadTransaction6 != null) {
			obReadTransaction6.getData().getTransaction().forEach(obTransaction6 -> transactions.add(this.obTransactionAdapter.toTransaction(obTransaction6)));
		}

		return transactions;
	}
}
