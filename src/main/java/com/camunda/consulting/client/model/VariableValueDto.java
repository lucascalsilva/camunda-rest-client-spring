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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * VariableValueDto
 */
@JsonPropertyOrder({
  VariableValueDto.JSON_PROPERTY_VALUE,
  VariableValueDto.JSON_PROPERTY_TYPE,
  VariableValueDto.JSON_PROPERTY_VALUE_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class VariableValueDto {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE_INFO = "valueInfo";
  private Map<String, Object> valueInfo = null;


  public VariableValueDto value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The variable&#39;s value. Value differs depending on the variable&#39;s type and on the deserializeValues parameter.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The variable's value. Value differs depending on the variable's type and on the deserializeValues parameter.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public VariableValueDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The value type of the variable.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value type of the variable.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VariableValueDto valueInfo(Map<String, Object> valueInfo) {
    
    this.valueInfo = valueInfo;
    return this;
  }

  public VariableValueDto putValueInfoItem(String key, Object valueInfoItem) {
    if (this.valueInfo == null) {
      this.valueInfo = new HashMap<String, Object>();
    }
    this.valueInfo.put(key, valueInfoItem);
    return this;
  }

   /**
   * A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * &#x60;objectTypeName&#x60;: A string representation of the object&#39;s type name. * &#x60;serializationDataFormat&#x60;: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * &#x60;filename&#x60;: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * &#x60;mimetype&#x60;: The MIME type of the file that is being uploaded. * &#x60;encoding&#x60;: The encoding of the file that is being uploaded.
   * @return valueInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * `filename`: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * `mimetype`: The MIME type of the file that is being uploaded. * `encoding`: The encoding of the file that is being uploaded.")
  @JsonProperty(JSON_PROPERTY_VALUE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getValueInfo() {
    return valueInfo;
  }


  public void setValueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableValueDto variableValueDto = (VariableValueDto) o;
    return Objects.equals(this.value, variableValueDto.value) &&
        Objects.equals(this.type, variableValueDto.type) &&
        Objects.equals(this.valueInfo, variableValueDto.valueInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type, valueInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableValueDto {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
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
