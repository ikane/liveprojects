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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on a statement resource.
 */
@Schema(description = "Provides further details on a statement resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-06T13:58:32.163760700+01:00[Europe/Paris]")
public class OBStatement2Detail {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StatementId")
  private String statementId = null;

  @JsonProperty("StatementReference")
  private String statementReference = null;

  @JsonProperty("Type")
  private OBExternalStatementType1Code type = null;

  @JsonProperty("StartDateTime")
  private LocalDateTime startDateTime = null;

  @JsonProperty("EndDateTime")
  private LocalDateTime endDateTime = null;

  @JsonProperty("CreationDateTime")
  private LocalDateTime creationDateTime = null;

  @JsonProperty("StatementDescription")
  private List<String> statementDescription = null;

  @JsonProperty("StatementBenefit")
  private List<OBStatement2StatementBenefit> statementBenefit = null;

  @JsonProperty("StatementFee")
  private List<OBStatement2StatementFee> statementFee = null;

  @JsonProperty("StatementInterest")
  private List<OBStatement2StatementInterest> statementInterest = null;

  @JsonProperty("StatementAmount")
  private List<OBStatement2StatementAmount> statementAmount = null;

  @JsonProperty("StatementDateTime")
  private List<OBStatement2StatementDateTime> statementDateTime = null;

  @JsonProperty("StatementRate")
  private List<OBStatement2StatementRate> statementRate = null;

  @JsonProperty("StatementValue")
  private List<OBStatement2StatementValue> statementValue = null;

  public OBStatement2Detail accountId(String accountId) {
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

  public OBStatement2Detail statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

   /**
   * Get statementId
   * @return statementId
  **/
  @Schema(description = "")
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement2Detail statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

   /**
   * Get statementReference
   * @return statementReference
  **/
  @Schema(description = "")
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement2Detail type(OBExternalStatementType1Code type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public OBExternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementType1Code type) {
    this.type = type;
  }

  public OBStatement2Detail startDateTime(LocalDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @Schema(required = true, description = "")
  public LocalDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(LocalDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement2Detail endDateTime(LocalDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @Schema(required = true, description = "")
  public LocalDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(LocalDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement2Detail creationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @Schema(required = true, description = "")
  public LocalDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2Detail statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2Detail addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

   /**
   * Get statementDescription
   * @return statementDescription
  **/
  @Schema(description = "")
  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement2Detail statementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2Detail addStatementBenefitItem(OBStatement2StatementBenefit statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

   /**
   * Get statementBenefit
   * @return statementBenefit
  **/
  @Schema(description = "")
  public List<OBStatement2StatementBenefit> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement2Detail statementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2Detail addStatementFeeItem(OBStatement2StatementFee statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

   /**
   * Get statementFee
   * @return statementFee
  **/
  @Schema(description = "")
  public List<OBStatement2StatementFee> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement2Detail statementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2Detail addStatementInterestItem(OBStatement2StatementInterest statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

   /**
   * Get statementInterest
   * @return statementInterest
  **/
  @Schema(description = "")
  public List<OBStatement2StatementInterest> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement2Detail statementAmount(List<OBStatement2StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
    return this;
  }

  public OBStatement2Detail addStatementAmountItem(OBStatement2StatementAmount statementAmountItem) {
    if (this.statementAmount == null) {
      this.statementAmount = new ArrayList<>();
    }
    this.statementAmount.add(statementAmountItem);
    return this;
  }

   /**
   * Get statementAmount
   * @return statementAmount
  **/
  @Schema(description = "")
  public List<OBStatement2StatementAmount> getStatementAmount() {
    return statementAmount;
  }

  public void setStatementAmount(List<OBStatement2StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
  }

  public OBStatement2Detail statementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2Detail addStatementDateTimeItem(OBStatement2StatementDateTime statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

   /**
   * Get statementDateTime
   * @return statementDateTime
  **/
  @Schema(description = "")
  public List<OBStatement2StatementDateTime> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement2Detail statementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2Detail addStatementRateItem(OBStatement2StatementRate statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

   /**
   * Get statementRate
   * @return statementRate
  **/
  @Schema(description = "")
  public List<OBStatement2StatementRate> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement2Detail statementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2Detail addStatementValueItem(OBStatement2StatementValue statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

   /**
   * Get statementValue
   * @return statementValue
  **/
  @Schema(description = "")
  public List<OBStatement2StatementValue> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2Detail obStatement2Detail = (OBStatement2Detail) o;
    return Objects.equals(this.accountId, obStatement2Detail.accountId) &&
        Objects.equals(this.statementId, obStatement2Detail.statementId) &&
        Objects.equals(this.statementReference, obStatement2Detail.statementReference) &&
        Objects.equals(this.type, obStatement2Detail.type) &&
        Objects.equals(this.startDateTime, obStatement2Detail.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement2Detail.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement2Detail.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement2Detail.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement2Detail.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement2Detail.statementFee) &&
        Objects.equals(this.statementInterest, obStatement2Detail.statementInterest) &&
        Objects.equals(this.statementAmount, obStatement2Detail.statementAmount) &&
        Objects.equals(this.statementDateTime, obStatement2Detail.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement2Detail.statementRate) &&
        Objects.equals(this.statementValue, obStatement2Detail.statementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementAmount, statementDateTime, statementRate, statementValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2Detail {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
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
