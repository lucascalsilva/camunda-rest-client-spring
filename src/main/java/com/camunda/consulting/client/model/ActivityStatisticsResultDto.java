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
import com.camunda.consulting.client.model.IncidentStatisticsResultDto;
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
 * ActivityStatisticsResultDto
 */
@JsonPropertyOrder({
  ActivityStatisticsResultDto.JSON_PROPERTY_ID,
  ActivityStatisticsResultDto.JSON_PROPERTY_INSTANCES,
  ActivityStatisticsResultDto.JSON_PROPERTY_FAILED_JOBS,
  ActivityStatisticsResultDto.JSON_PROPERTY_INCIDENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
public class ActivityStatisticsResultDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INSTANCES = "instances";
  private Integer instances;

  public static final String JSON_PROPERTY_FAILED_JOBS = "failedJobs";
  private Integer failedJobs;

  public static final String JSON_PROPERTY_INCIDENTS = "incidents";
  private List<IncidentStatisticsResultDto> incidents = null;


  public ActivityStatisticsResultDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the activity the results are aggregated for.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity the results are aggregated for.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ActivityStatisticsResultDto instances(Integer instances) {
    
    this.instances = instances;
    return this;
  }

   /**
   * The total number of running process instances of this activity.
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of running process instances of this activity.")
  @JsonProperty(JSON_PROPERTY_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInstances() {
    return instances;
  }


  public void setInstances(Integer instances) {
    this.instances = instances;
  }


  public ActivityStatisticsResultDto failedJobs(Integer failedJobs) {
    
    this.failedJobs = failedJobs;
    return this;
  }

   /**
   * The total number of failed jobs for the running instances. **Note**: Will be &#x60;0&#x60; (not &#x60;null&#x60;), if failed jobs were excluded.
   * @return failedJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of failed jobs for the running instances. **Note**: Will be `0` (not `null`), if failed jobs were excluded.")
  @JsonProperty(JSON_PROPERTY_FAILED_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedJobs() {
    return failedJobs;
  }


  public void setFailedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
  }


  public ActivityStatisticsResultDto incidents(List<IncidentStatisticsResultDto> incidents) {
    
    this.incidents = incidents;
    return this;
  }

  public ActivityStatisticsResultDto addIncidentsItem(IncidentStatisticsResultDto incidentsItem) {
    if (this.incidents == null) {
      this.incidents = new ArrayList<IncidentStatisticsResultDto>();
    }
    this.incidents.add(incidentsItem);
    return this;
  }

   /**
   * Each item in the resulting array is an object which contains &#x60;incidentType&#x60; and &#x60;incidentCount&#x60;. **Note**: Will be an empty array, if &#x60;incidents&#x60; or &#x60;incidentsForType&#x60; were excluded. Furthermore, the array will be also empty if no incidents were found.
   * @return incidents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Each item in the resulting array is an object which contains `incidentType` and `incidentCount`. **Note**: Will be an empty array, if `incidents` or `incidentsForType` were excluded. Furthermore, the array will be also empty if no incidents were found.")
  @JsonProperty(JSON_PROPERTY_INCIDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IncidentStatisticsResultDto> getIncidents() {
    return incidents;
  }


  public void setIncidents(List<IncidentStatisticsResultDto> incidents) {
    this.incidents = incidents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityStatisticsResultDto activityStatisticsResultDto = (ActivityStatisticsResultDto) o;
    return Objects.equals(this.id, activityStatisticsResultDto.id) &&
        Objects.equals(this.instances, activityStatisticsResultDto.instances) &&
        Objects.equals(this.failedJobs, activityStatisticsResultDto.failedJobs) &&
        Objects.equals(this.incidents, activityStatisticsResultDto.incidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instances, failedJobs, incidents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityStatisticsResultDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
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

