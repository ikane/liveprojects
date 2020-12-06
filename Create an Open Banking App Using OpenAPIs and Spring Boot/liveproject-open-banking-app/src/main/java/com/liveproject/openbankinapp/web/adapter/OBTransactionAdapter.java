package com.liveproject.openbankinapp.web.adapter;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.model.OBTransaction6;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OBTransactionAdapter {

	/*`
	private WebClient webClient = WebClient.create("https://www.openbanking.org.uk//open-banking/v3.1/aisp");


	// /accounts/{accountId}/transactions
	public List<Transaction> findTransaction(String accountId) {
		Flux<OBTransaction6> obTransaction6Flux = this.webClient.get()
		                                                        .uri("/accounts/{accountId}/transactions", accountId)
		                                                        .retrieve()
		                                                        .bodyToFlux(OBTransaction6.class);

		//obTransaction6Flux.

		return null;
	}
	 */

	public Transaction toTransaction (OBTransaction6 oBTransaction6) {
		Transaction transaction = Transaction.builder().build();
		transaction.setAccountNumber(oBTransaction6.getAccountId());
		transaction.setType(oBTransaction6.getCreditDebitIndicator().getValue());
		transaction.setCurrency(oBTransaction6.getCurrencyExchange().getUnitCurrency());

		BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(oBTransaction6.getAmount().getAmount()));
		BigDecimal exchangeRate = oBTransaction6.getCurrencyExchange().getExchangeRate();
		transaction.setAmount(amount.multiply(exchangeRate));

		transaction.setMerchantName(oBTransaction6.getMerchantDetails().getMerchantName());

		return transaction;
	}




}
