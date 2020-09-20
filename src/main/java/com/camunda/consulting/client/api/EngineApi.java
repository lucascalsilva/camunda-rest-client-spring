package com.camunda.consulting.client.api;

import com.camunda.consulting.client.invoker.ApiClient;

import com.camunda.consulting.client.model.ProcessEngineDto;

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
@Component("com.camunda.consulting.client.api.EngineApi")
public class EngineApi {
    private ApiClient apiClient;

    public EngineApi() {
        this(new ApiClient());
    }

    @Autowired
    public EngineApi(ApiClient apiClient) {
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
     * Retrieves the names of all process engines available on your platform. **Note**: You cannot prepend &#x60;/engine/{name}&#x60; to this method.
     * <p><b>200</b> - Request successful.
     * @return List&lt;ProcessEngineDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProcessEngineDto> getProcessEngineNames() throws RestClientException {
        return getProcessEngineNamesWithHttpInfo().getBody();
    }

    /**
     * 
     * Retrieves the names of all process engines available on your platform. **Note**: You cannot prepend &#x60;/engine/{name}&#x60; to this method.
     * <p><b>200</b> - Request successful.
     * @return ResponseEntity&lt;List&lt;ProcessEngineDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProcessEngineDto>> getProcessEngineNamesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/engine", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ProcessEngineDto>> returnType = new ParameterizedTypeReference<List<ProcessEngineDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
