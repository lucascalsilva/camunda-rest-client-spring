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
import com.camunda.consulting.client.model.ExecutionDto;
import com.camunda.consulting.client.model.ProcessInstanceDto;
import com.camunda.consulting.client.model.VariableValueDto;
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
 * The &#x60;processInstance&#x60; property only has a value if the resultType is set to &#x60;ProcessDefinition&#x60;. The processInstance with the properties as described in the [get single instance](https://docs.camunda.org/manual/7.13/reference/rest/process-instance/get/) method.  The &#x60;execution&#x60; property only has a value if the resultType is set to &#x60;Execution&#x60;. The execution with the properties as described in the [get single execution](https://docs.camunda.org/manual/7.13/reference/rest/execution/get/) method.
 */
@ApiModel(description = "The `processInstance` property only has a value if the resultType is set to `ProcessDefinition`. The processInstance with the properties as described in the [get single instance](https://docs.camunda.org/manual/7.13/reference/rest/process-instance/get/) method.  The `execution` property only has a value if the resultType is set to `Execution`. The execution with the properties as described in the [get single execution](https://docs.camunda.org/manual/7.13/reference/rest/execution/get/) method.")
@JsonPropertyOrder({
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_RESULT_TYPE,
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_PROCESS_INSTANCE,
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_EXECUTION,
  MessageCorrelationResultWithVariableDto.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class MessageCorrelationResultWithVariableDto {
  /**
   * Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  &#x60;ProcessDefinition&#x60; and otherwise &#x60;Execution&#x60;.
   */
  public enum ResultTypeEnum {
    EXECUTION("Execution"),
    
    PROCESSDEFINITION("ProcessDefinition");

    private String value;

    ResultTypeEnum(String value) {
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
    public static ResultTypeEnum fromValue(String value) {
      for (ResultTypeEnum b : ResultTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT_TYPE = "resultType";
  private ResultTypeEnum resultType;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE = "processInstance";
  private ProcessInstanceDto processInstance = null;

  public static final String JSON_PROPERTY_EXECUTION = "execution";
  private ExecutionDto execution;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, VariableValueDto> variables = null;


  public MessageCorrelationResultWithVariableDto resultType(ResultTypeEnum resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  &#x60;ProcessDefinition&#x60; and otherwise &#x60;Execution&#x60;.
   * @return resultType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  `ProcessDefinition` and otherwise `Execution`.")
  @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultTypeEnum getResultType() {
    return resultType;
  }


  public void setResultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
  }


  public MessageCorrelationResultWithVariableDto processInstance(ProcessInstanceDto processInstance) {
    
    this.processInstance = processInstance;
    return this;
  }

   /**
   * Get processInstance
   * @return processInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessInstanceDto getProcessInstance() {
    return processInstance;
  }


  public void setProcessInstance(ProcessInstanceDto processInstance) {
    this.processInstance = processInstance;
  }


  public MessageCorrelationResultWithVariableDto execution(ExecutionDto execution) {
    
    this.execution = execution;
    return this;
  }

   /**
   * Get execution
   * @return execution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExecutionDto getExecution() {
    return execution;
  }


  public void setExecution(ExecutionDto execution) {
    this.execution = execution;
  }


  public MessageCorrelationResultWithVariableDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public MessageCorrelationResultWithVariableDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * This property is returned if the &#x60;variablesInResultEnabled&#x60; is set to &#x60;true&#x60;. Contains a list of the process variables. 
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is returned if the `variablesInResultEnabled` is set to `true`. Contains a list of the process variables. ")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageCorrelationResultWithVariableDto messageCorrelationResultWithVariableDto = (MessageCorrelationResultWithVariableDto) o;
    return Objects.equals(this.resultType, messageCorrelationResultWithVariableDto.resultType) &&
        Objects.equals(this.processInstance, messageCorrelationResultWithVariableDto.processInstance) &&
        Objects.equals(this.execution, messageCorrelationResultWithVariableDto.execution) &&
        Objects.equals(this.variables, messageCorrelationResultWithVariableDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultType, processInstance, execution, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCorrelationResultWithVariableDto {\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    processInstance: ").append(toIndentedString(processInstance)).append("\n");
    sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

