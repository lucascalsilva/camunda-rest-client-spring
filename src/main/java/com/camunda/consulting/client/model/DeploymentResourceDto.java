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
 * A JSON object corresponding to the &#x60;Resource&#x60; interface in the engine. Its properties are as follows:
 */
@ApiModel(description = "A JSON object corresponding to the `Resource` interface in the engine. Its properties are as follows:")
@JsonPropertyOrder({
  DeploymentResourceDto.JSON_PROPERTY_ID,
  DeploymentResourceDto.JSON_PROPERTY_NAME,
  DeploymentResourceDto.JSON_PROPERTY_DEPLOYMENT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class DeploymentResourceDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
  private String deploymentId;


  public DeploymentResourceDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the deployment resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deployment resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DeploymentResourceDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the deployment resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the deployment resource")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeploymentResourceDto deploymentId(String deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The id of the deployment.
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deployment.")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeploymentId() {
    return deploymentId;
  }


  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResourceDto deploymentResourceDto = (DeploymentResourceDto) o;
    return Objects.equals(this.id, deploymentResourceDto.id) &&
        Objects.equals(this.name, deploymentResourceDto.name) &&
        Objects.equals(this.deploymentId, deploymentResourceDto.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deploymentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResourceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
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

