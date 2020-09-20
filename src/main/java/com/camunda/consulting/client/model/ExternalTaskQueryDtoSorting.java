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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ExternalTaskQueryDtoSorting
 */
@JsonPropertyOrder({
  ExternalTaskQueryDtoSorting.JSON_PROPERTY_SORT_BY,
  ExternalTaskQueryDtoSorting.JSON_PROPERTY_SORT_ORDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class ExternalTaskQueryDtoSorting {
  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   */
  public enum SortByEnum {
    ID("id"),
    
    LOCKEXPIRATIONTIME("lockExpirationTime"),
    
    PROCESSINSTANCEID("processInstanceId"),
    
    PROCESSDEFINITIONID("processDefinitionId"),
    
    PROCESSDEFINITIONKEY("processDefinitionKey"),
    
    TASKPRIORITY("taskPriority"),
    
    TENANTID("tenantId");

    private String value;

    SortByEnum(String value) {
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
    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private SortByEnum sortBy;

  /**
   * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
   */
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
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
    public static SortOrderEnum fromValue(String value) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private SortOrderEnum sortOrder;


  public ExternalTaskQueryDtoSorting sortBy(SortByEnum sortBy) {
    
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.")
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SortByEnum getSortBy() {
    return sortBy;
  }


  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  public ExternalTaskQueryDtoSorting sortOrder(SortOrderEnum sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.")
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskQueryDtoSorting externalTaskQueryDtoSorting = (ExternalTaskQueryDtoSorting) o;
    return Objects.equals(this.sortBy, externalTaskQueryDtoSorting.sortBy) &&
        Objects.equals(this.sortOrder, externalTaskQueryDtoSorting.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskQueryDtoSorting {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
