package com.liveproject.openbankinapp.integration.openbanking.api;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.integration.openbanking.model.OBTransaction6;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OBTransactionAdapter {

	public Transaction toTransaction (OBTransaction6 oBTransaction6) {
		Transaction transaction = Transaction.builder().build();
		transaction.setAccountNumber(oBTransaction6.getAccountId());
		transaction.setType(oBTransaction6.getCreditDebitIndicator()!=null ?
						                    oBTransaction6.getCreditDebitIndicator().getValue() : null);
		transaction.setCurrency(oBTransaction6.getCurrencyExchange()!=null ?
						                        oBTransaction6.getCurrencyExchange().getUnitCurrency() : null);

		if(oBTransaction6.getAmount()!=null) {
			BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(oBTransaction6.getAmount().getAmount()));
			BigDecimal exchangeRate =
							oBTransaction6.getCurrencyExchange()!=null ? oBTransaction6.getCurrencyExchange().getExchangeRate(): BigDecimal.ONE;
			transaction.setAmount(amount.multiply(exchangeRate));
		}

		transaction.setMerchantName(oBTransaction6.getMerchantDetails()!=null ?
						                            oBTransaction6.getMerchantDetails().getMerchantName(): null);

		return transaction;
	}




}
