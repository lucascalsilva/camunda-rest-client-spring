package com.camunda.consulting.client.api;

import com.camunda.consulting.client.invoker.ApiClient;

import com.camunda.consulting.client.model.SchemaLogEntryDto;
import com.camunda.consulting.client.model.SchemaLogQueryDto;

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
@Component("com.camunda.consulting.client.api.SchemaLogApi")
public class SchemaLogApi {
    private ApiClient apiClient;

    public SchemaLogApi() {
        this(new ApiClient());
    }

    @Autowired
    public SchemaLogApi(ApiClient apiClient) {
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
     * Queries for schema log entries that fulfill given parameters.
     * <p><b>200</b> - Request successful. **Note**: In order to get any results a user of group &#x60;camunda-admin&#x60; must be authenticated.
     * @param version Only return schema log entries with a specific version. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return List&lt;SchemaLogEntryDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SchemaLogEntryDto> getSchemaLog(String version, Integer firstResult, Integer maxResults) throws RestClientException {
        return getSchemaLogWithHttpInfo(version, firstResult, maxResults).getBody();
    }

    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * <p><b>200</b> - Request successful. **Note**: In order to get any results a user of group &#x60;camunda-admin&#x60; must be authenticated.
     * @param version Only return schema log entries with a specific version. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return ResponseEntity&lt;List&lt;SchemaLogEntryDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SchemaLogEntryDto>> getSchemaLogWithHttpInfo(String version, Integer firstResult, Integer maxResults) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/schema/log", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstResult", firstResult));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SchemaLogEntryDto>> returnType = new ParameterizedTypeReference<List<SchemaLogEntryDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * <p><b>200</b> - Request successful. **Note**: In order to get any results a user of group camunda-admin must be authenticated.
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param schemaLogQueryDto  (optional)
     * @return List&lt;SchemaLogEntryDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SchemaLogEntryDto> querySchemaLog(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto) throws RestClientException {
        return querySchemaLogWithHttpInfo(firstResult, maxResults, schemaLogQueryDto).getBody();
    }

    /**
     * 
     * Queries for schema log entries that fulfill given parameters.
     * <p><b>200</b> - Request successful. **Note**: In order to get any results a user of group camunda-admin must be authenticated.
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param schemaLogQueryDto  (optional)
     * @return ResponseEntity&lt;List&lt;SchemaLogEntryDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SchemaLogEntryDto>> querySchemaLogWithHttpInfo(Integer firstResult, Integer maxResults, SchemaLogQueryDto schemaLogQueryDto) throws RestClientException {
        Object postBody = schemaLogQueryDto;
        
        String path = apiClient.expandPath("/schema/log", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstResult", firstResult));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SchemaLogEntryDto>> returnType = new ParameterizedTypeReference<List<SchemaLogEntryDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
