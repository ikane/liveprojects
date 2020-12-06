/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.6
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.liveproject.openbankinapp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
 */
public enum OBCreditDebitCode2 {
  CREDIT("Credit"),
  DEBIT("Debit");

  private String value;

  OBCreditDebitCode2(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBCreditDebitCode2 fromValue(String text) {
    for (OBCreditDebitCode2 b : OBCreditDebitCode2.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
