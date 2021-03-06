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
 * ExternalTaskFailureDto
 */
@JsonPropertyOrder({
  ExternalTaskFailureDto.JSON_PROPERTY_WORKER_ID,
  ExternalTaskFailureDto.JSON_PROPERTY_ERROR_MESSAGE,
  ExternalTaskFailureDto.JSON_PROPERTY_ERROR_DETAILS,
  ExternalTaskFailureDto.JSON_PROPERTY_RETRIES,
  ExternalTaskFailureDto.JSON_PROPERTY_RETRY_TIMEOUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class ExternalTaskFailureDto {
  public static final String JSON_PROPERTY_WORKER_ID = "workerId";
  private String workerId;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private Integer retries;

  public static final String JSON_PROPERTY_RETRY_TIMEOUT = "retryTimeout";
  private Long retryTimeout;


  public ExternalTaskFailureDto workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * The id of the worker that reports the failure. Must match the id of the worker who has most recently locked the task.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the worker that reports the failure. Must match the id of the worker who has most recently locked the task.")
  @JsonProperty(JSON_PROPERTY_WORKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public ExternalTaskFailureDto errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * An message indicating the reason of the failure.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An message indicating the reason of the failure.")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ExternalTaskFailureDto errorDetails(String errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * A detailed error description.
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed error description.")
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }


  public ExternalTaskFailureDto retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * A number of how often the task should be retried. Must be &gt;&#x3D; 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. The incident&#39;s message is set to the &#x60;errorMessage&#x60; parameter.
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A number of how often the task should be retried. Must be >= 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. The incident's message is set to the `errorMessage` parameter.")
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public ExternalTaskFailureDto retryTimeout(Long retryTimeout) {
    
    this.retryTimeout = retryTimeout;
    return this;
  }

   /**
   * A timeout in milliseconds before the external task becomes available again for fetching. Must be &gt;&#x3D; 0.
   * @return retryTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timeout in milliseconds before the external task becomes available again for fetching. Must be >= 0.")
  @JsonProperty(JSON_PROPERTY_RETRY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRetryTimeout() {
    return retryTimeout;
  }


  public void setRetryTimeout(Long retryTimeout) {
    this.retryTimeout = retryTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskFailureDto externalTaskFailureDto = (ExternalTaskFailureDto) o;
    return Objects.equals(this.workerId, externalTaskFailureDto.workerId) &&
        Objects.equals(this.errorMessage, externalTaskFailureDto.errorMessage) &&
        Objects.equals(this.errorDetails, externalTaskFailureDto.errorDetails) &&
        Objects.equals(this.retries, externalTaskFailureDto.retries) &&
        Objects.equals(this.retryTimeout, externalTaskFailureDto.retryTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, errorMessage, errorDetails, retries, retryTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskFailureDto {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
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

