package com.camunda.consulting.client.api;

import com.camunda.consulting.client.invoker.ApiClient;

import com.camunda.consulting.client.model.ExceptionDto;
import com.camunda.consulting.client.model.MetricsIntervalResultDto;
import com.camunda.consulting.client.model.MetricsResultDto;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T14:06:02.786934+02:00[Europe/Berlin]")
@Component("com.camunda.consulting.client.api.MetricsApi")
public class MetricsApi {
    private ApiClient apiClient;

    public MetricsApi() {
        this(new ApiClient());
    }

    @Autowired
    public MetricsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Retrieves the &#x60;sum&#x60; (count) for a given metric.
     * <p><b>200</b> - Request successful.
     * @param metricsName The name of the metric. (required)
     * @param startDate The start date (inclusive). (optional)
     * @param endDate The end date (exclusive). (optional)
     * @return MetricsResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MetricsResultDto getMetrics(String metricsName, OffsetDateTime startDate, OffsetDateTime endDate) throws RestClientException {
        return getMetricsWithHttpInfo(metricsName, startDate, endDate).getBody();
    }

    /**
     * 
     * Retrieves the &#x60;sum&#x60; (count) for a given metric.
     * <p><b>200</b> - Request successful.
     * @param metricsName The name of the metric. (required)
     * @param startDate The start date (inclusive). (optional)
     * @param endDate The end date (exclusive). (optional)
     * @return ResponseEntity&lt;MetricsResultDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MetricsResultDto> getMetricsWithHttpInfo(String metricsName, OffsetDateTime startDate, OffsetDateTime endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'metricsName' is set
        if (metricsName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'metricsName' when calling getMetrics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("metrics-name", metricsName);
        String path = apiClient.expandPath("/metrics/{metrics-name}/sum", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<MetricsResultDto> returnType = new ParameterizedTypeReference<MetricsResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieves a list of metrics, aggregated for a given interval.
     * <p><b>200</b> - Request successful.
     * <p><b>400</b> - Returned if some of the query parameters are invalid.
     * @param name The name of the metric. (optional)
     * @param reporter The name of the reporter (host), on which the metrics was logged. This will have value provided by the [hostname configuration property](https://docs.camunda.org/manual/7.13/reference/deployment-descriptors/tags/process-engine/#hostname). (optional)
     * @param startDate The start date (inclusive). (optional)
     * @param endDate The end date (exclusive). (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param interval The interval for which the metrics should be aggregated. Time unit is seconds. Default: The interval is set to 15 minutes (900 seconds). (optional, default to &quot;900&quot;)
     * @param aggregateByReporter Aggregate metrics by reporter. (optional)
     * @return List&lt;MetricsIntervalResultDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MetricsIntervalResultDto> interval(String name, String reporter, OffsetDateTime startDate, OffsetDateTime endDate, Integer firstResult, Integer maxResults, String interval, String aggregateByReporter) throws RestClientException {
        return intervalWithHttpInfo(name, reporter, startDate, endDate, firstResult, maxResults, interval, aggregateByReporter).getBody();
    }

    /**
     * 
     * Retrieves a list of metrics, aggregated for a given interval.
     * <p><b>200</b> - Request successful.
     * <p><b>400</b> - Returned if some of the query parameters are invalid.
     * @param name The name of the metric. (optional)
     * @param reporter The name of the reporter (host), on which the metrics was logged. This will have value provided by the [hostname configuration property](https://docs.camunda.org/manual/7.13/reference/deployment-descriptors/tags/process-engine/#hostname). (optional)
     * @param startDate The start date (inclusive). (optional)
     * @param endDate The end date (exclusive). (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param interval The interval for which the metrics should be aggregated. Time unit is seconds. Default: The interval is set to 15 minutes (900 seconds). (optional, default to &quot;900&quot;)
     * @param aggregateByReporter Aggregate metrics by reporter. (optional)
     * @return ResponseEntity&lt;List&lt;MetricsIntervalResultDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MetricsIntervalResultDto>> intervalWithHttpInfo(String name, String reporter, OffsetDateTime startDate, OffsetDateTime endDate, Integer firstResult, Integer maxResults, String interval, String aggregateByReporter) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/metrics", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reporter", reporter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstResult", firstResult));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "interval", interval));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "aggregateByReporter", aggregateByReporter));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<MetricsIntervalResultDto>> returnType = new ParameterizedTypeReference<List<MetricsIntervalResultDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
