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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Set of elements used to define the balance details.
 */
@Schema(description = "Set of elements used to define the balance details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-06T13:58:32.163760700+01:00[Europe/Paris]")
public class OBReadBalance1DataBalance {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode2 creditDebitIndicator = null;

  @JsonProperty("Type")
  private OBBalanceType1Code type = null;

  @JsonProperty("DateTime")
  private LocalDateTime dateTime = null;

  @JsonProperty("Amount")
  private OBReadBalance1DataAmount amount = null;

  @JsonProperty("CreditLine")
  private List<OBReadBalance1DataCreditLine> creditLine = null;

  public OBReadBalance1DataBalance accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(required = true, description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadBalance1DataBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @Schema(required = true, description = "")
  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBReadBalance1DataBalance type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBReadBalance1DataBalance dateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
  **/
  @Schema(required = true, description = "Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public OBReadBalance1DataBalance amount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(required = true, description = "")
  public OBReadBalance1DataAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataBalance creditLine(List<OBReadBalance1DataCreditLine> creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  public OBReadBalance1DataBalance addCreditLineItem(OBReadBalance1DataCreditLine creditLineItem) {
    if (this.creditLine == null) {
      this.creditLine = new ArrayList<>();
    }
    this.creditLine.add(creditLineItem);
    return this;
  }

   /**
   * Get creditLine
   * @return creditLine
  **/
  @Schema(description = "")
  public List<OBReadBalance1DataCreditLine> getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(List<OBReadBalance1DataCreditLine> creditLine) {
    this.creditLine = creditLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataBalance obReadBalance1DataBalance = (OBReadBalance1DataBalance) o;
    return Objects.equals(this.accountId, obReadBalance1DataBalance.accountId) &&
        Objects.equals(this.creditDebitIndicator, obReadBalance1DataBalance.creditDebitIndicator) &&
        Objects.equals(this.type, obReadBalance1DataBalance.type) &&
        Objects.equals(this.dateTime, obReadBalance1DataBalance.dateTime) &&
        Objects.equals(this.amount, obReadBalance1DataBalance.amount) &&
        Objects.equals(this.creditLine, obReadBalance1DataBalance.creditLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditDebitIndicator, type, dateTime, amount, creditLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalance {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
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