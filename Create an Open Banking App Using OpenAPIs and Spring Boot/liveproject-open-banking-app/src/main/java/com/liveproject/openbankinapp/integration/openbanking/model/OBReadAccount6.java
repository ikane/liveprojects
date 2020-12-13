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
 * OBReadAccount6
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-06T13:58:32.163760700+01:00[Europe/Paris]")
public class OBReadAccount6 {
  @JsonProperty("Data")
  private OBReadAccount6Data data = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  public OBReadAccount6 data(OBReadAccount6Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public OBReadAccount6Data getData() {
    return data;
  }

  public void setData(OBReadAccount6Data data) {
    this.data = data;
  }

  public OBReadAccount6 links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadAccount6 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadAccount6 obReadAccount6 = (OBReadAccount6) o;
    return Objects.equals(this.data, obReadAccount6.data) &&
        Objects.equals(this.links, obReadAccount6.links) &&
        Objects.equals(this.meta, obReadAccount6.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadAccount6 {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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