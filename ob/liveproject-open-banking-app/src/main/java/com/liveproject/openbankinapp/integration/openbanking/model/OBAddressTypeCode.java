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

package com.liveproject.openbankinapp.integration.openbanking.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Identifies the nature of the postal address.
 */
public enum OBAddressTypeCode {
  BUSINESS("Business"),
  CORRESPONDENCE("Correspondence"),
  DELIVERYTO("DeliveryTo"),
  MAILTO("MailTo"),
  POBOX("POBox"),
  POSTAL("Postal"),
  RESIDENTIAL("Residential"),
  STATEMENT("Statement");

  private String value;

  OBAddressTypeCode(String value) {
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
  public static OBAddressTypeCode fromValue(String text) {
    for (OBAddressTypeCode b : OBAddressTypeCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
