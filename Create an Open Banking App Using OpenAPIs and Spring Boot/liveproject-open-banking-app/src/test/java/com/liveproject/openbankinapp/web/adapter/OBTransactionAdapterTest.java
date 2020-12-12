package com.liveproject.openbankinapp.web.adapter;

import com.liveproject.openbankinapp.domain.Transaction;
import com.liveproject.openbankinapp.model.OBTransaction6;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OBTransactionAdapterTest {

	OBTransactionAdapter obTransactionAdapter = new OBTransactionAdapter();

	@Test
	void toTransaction() {

		OBTransaction6 oBTransaction6 = new OBTransaction6();
		oBTransaction6.setAccountId("accountId");

		Transaction transaction = this.obTransactionAdapter.toTransaction(oBTransaction6);

		assertThat(transaction).isNotNull();

	}
}