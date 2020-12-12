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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of capital repayment holiday if any
 */
@Schema(description = "Details of capital repayment holiday if any")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-06T13:58:32.163760700+01:00[Europe/Paris]")
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday {
  @JsonProperty("MaxHolidayLength")
  private Integer maxHolidayLength = null;

  /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   */
  public enum MaxHolidayPeriodEnum {
    PACT("PACT"),
    PDAY("PDAY"),
    PHYR("PHYR"),
    PMTH("PMTH"),
    PQTR("PQTR"),
    PWEK("PWEK"),
    PYER("PYER");

    private String value;

    MaxHolidayPeriodEnum(String value) {
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
    public static MaxHolidayPeriodEnum fromValue(String text) {
      for (MaxHolidayPeriodEnum b : MaxHolidayPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("MaxHolidayPeriod")
  private MaxHolidayPeriodEnum maxHolidayPeriod = null;

  @JsonProperty("Notes")
  private List<String> notes = null;

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday maxHolidayLength(Integer maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
    return this;
  }

   /**
   * The maximum length/duration of a Repayment Holiday
   * @return maxHolidayLength
  **/
  @Schema(description = "The maximum length/duration of a Repayment Holiday")
  public Integer getMaxHolidayLength() {
    return maxHolidayLength;
  }

  public void setMaxHolidayLength(Integer maxHolidayLength) {
    this.maxHolidayLength = maxHolidayLength;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday maxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
    return this;
  }

   /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   * @return maxHolidayPeriod
  **/
  @Schema(description = "The unit of period (days, weeks, months etc.) of the repayment holiday")
  public MaxHolidayPeriodEnum getMaxHolidayPeriod() {
    return maxHolidayPeriod;
  }

  public void setMaxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
    this.maxHolidayPeriod = maxHolidayPeriod;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @Schema(description = "")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday = (OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday) o;
    return Objects.equals(this.maxHolidayLength, obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.maxHolidayLength) &&
        Objects.equals(this.maxHolidayPeriod, obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.maxHolidayPeriod) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHolidayLength, maxHolidayPeriod, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday {\n");

    sb.append("    maxHolidayLength: ").append(toIndentedString(maxHolidayLength)).append("\n");
    sb.append("    maxHolidayPeriod: ").append(toIndentedString(maxHolidayPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
