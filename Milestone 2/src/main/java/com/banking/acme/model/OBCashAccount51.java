package com.banking.acme.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Provides the details to identify the beneficiary account.
 */
@ApiModel(description = "Provides the details to identify the beneficiary account.")
@Validated



public class OBCashAccount51   {
  @JsonProperty("SchemeName")
  private String schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public OBCashAccount51 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Get schemeName
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccount51 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Beneficiary account identification.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Beneficiary account identification.")
      @NotNull

  @Size(min=1,max=256)   public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccount51 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=350)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccount51 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * Get secondaryIdentification
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=34)   public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccount51 obCashAccount51 = (OBCashAccount51) o;
    return Objects.equals(this.schemeName, obCashAccount51.schemeName) &&
        Objects.equals(this.identification, obCashAccount51.identification) &&
        Objects.equals(this.name, obCashAccount51.name) &&
        Objects.equals(this.secondaryIdentification, obCashAccount51.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccount51 {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
