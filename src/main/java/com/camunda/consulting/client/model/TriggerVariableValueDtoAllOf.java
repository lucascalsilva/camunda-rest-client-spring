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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TriggerVariableValueDtoAllOf
 */
@JsonPropertyOrder({
  TriggerVariableValueDtoAllOf.JSON_PROPERTY_LOCAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class TriggerVariableValueDtoAllOf {
  public static final String JSON_PROPERTY_LOCAL = "local";
  private JsonNullable<Boolean> local = JsonNullable.<Boolean>undefined();


  public TriggerVariableValueDtoAllOf local(Boolean local) {
    this.local = JsonNullable.<Boolean>of(local);
    
    return this;
  }

   /**
   * Indicates whether the variable should be a local variable or not. If set to true, the variable becomes a local variable of the execution entering the target activity.
   * @return local
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the variable should be a local variable or not. If set to true, the variable becomes a local variable of the execution entering the target activity.")
  @JsonIgnore

  public Boolean getLocal() {
        return local.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getLocal_JsonNullable() {
    return local;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCAL)
  public void setLocal_JsonNullable(JsonNullable<Boolean> local) {
    this.local = local;
  }

  public void setLocal(Boolean local) {
    this.local = JsonNullable.<Boolean>of(local);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerVariableValueDtoAllOf triggerVariableValueDtoAllOf = (TriggerVariableValueDtoAllOf) o;
    return Objects.equals(this.local, triggerVariableValueDtoAllOf.local);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerVariableValueDtoAllOf {\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
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
