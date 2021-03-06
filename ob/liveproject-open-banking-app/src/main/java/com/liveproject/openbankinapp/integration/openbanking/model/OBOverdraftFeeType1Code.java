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
 * Overdraft fee type
 */
public enum OBOverdraftFeeType1Code {
  FBAO("FBAO"),
  FBAR("FBAR"),
  FBEB("FBEB"),
  FBIT("FBIT"),
  FBOR("FBOR"),
  FBOS("FBOS"),
  FBSC("FBSC"),
  FBTO("FBTO"),
  FBUB("FBUB"),
  FBUT("FBUT"),
  FTOT("FTOT"),
  FTUT("FTUT");

  private String value;

  OBOverdraftFeeType1Code(String value) {
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
  public static OBOverdraftFeeType1Code fromValue(String text) {
    for (OBOverdraftFeeType1Code b : OBOverdraftFeeType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
