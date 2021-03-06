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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The Party&#x27;s relationships with other resources.
 */
@Schema(description = "The Party's relationships with other resources.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-06T13:58:32.163760700+01:00[Europe/Paris]")
public class OBPartyRelationships1 {
  @JsonProperty("Account")
  private OBPartyRelationships1Account account = null;

  public OBPartyRelationships1 account(OBPartyRelationships1Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public OBPartyRelationships1Account getAccount() {
    return account;
  }

  public void setAccount(OBPartyRelationships1Account account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1 obPartyRelationships1 = (OBPartyRelationships1) o;
    return Objects.equals(this.account, obPartyRelationships1.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1 {\n");

    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
