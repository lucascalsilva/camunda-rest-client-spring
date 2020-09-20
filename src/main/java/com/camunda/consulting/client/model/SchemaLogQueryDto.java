/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.camunda.consulting.client.model.SchemaLogQueryDtoSorting;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SchemaLogQueryDto
 */
@JsonPropertyOrder({
  SchemaLogQueryDto.JSON_PROPERTY_VERSION,
  SchemaLogQueryDto.JSON_PROPERTY_SORTING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class SchemaLogQueryDto {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_SORTING = "sorting";
  private List<SchemaLogQueryDtoSorting> sorting = null;


  public SchemaLogQueryDto version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the schema.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the schema.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public SchemaLogQueryDto sorting(List<SchemaLogQueryDtoSorting> sorting) {
    
    this.sorting = sorting;
    return this;
  }

  public SchemaLogQueryDto addSortingItem(SchemaLogQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<SchemaLogQueryDtoSorting>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

   /**
   * A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. 
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. ")
  @JsonProperty(JSON_PROPERTY_SORTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SchemaLogQueryDtoSorting> getSorting() {
    return sorting;
  }


  public void setSorting(List<SchemaLogQueryDtoSorting> sorting) {
    this.sorting = sorting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaLogQueryDto schemaLogQueryDto = (SchemaLogQueryDto) o;
    return Objects.equals(this.version, schemaLogQueryDto.version) &&
        Objects.equals(this.sorting, schemaLogQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, sorting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaLogQueryDto {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

