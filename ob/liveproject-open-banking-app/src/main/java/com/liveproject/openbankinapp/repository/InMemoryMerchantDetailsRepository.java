package com.liveproject.openbankinapp.repository;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryMerchantDetailsRepository implements MerchantDetailsRepository {

	static final Map<String, String> merchantLogos = new HashMap();

	static {
		merchantLogos.put("acme", "acme-logo.png");
		merchantLogos.put("globex", "globex-logo.png");
		merchantLogos.put("morley", "morley-logo.png");
		merchantLogos.put("contoso", "contoso-logo.png");
	}

	@Override
	public String findLogo(String merchant) {
		return merchantLogos.get(merchant);
	}
}
