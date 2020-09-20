package com.camunda.consulting.client.api;

import com.camunda.consulting.client.invoker.ApiClient;

import com.camunda.consulting.client.model.CorrelationMessageDto;
import com.camunda.consulting.client.model.ExceptionDto;
import com.camunda.consulting.client.model.MessageCorrelationResultWithVariableDto;

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
@Component("com.camunda.consulting.client.api.MessageApi")
public class MessageApi {
    private ApiClient apiClient;

    public MessageApi() {
        this(new ApiClient());
    }

    @Autowired
    public MessageApi(ApiClient apiClient) {
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
     * Correlates a message to the process engine to either trigger a message start event or an intermediate message  catching event. Internally this maps to the engine&#39;s message correlation builder methods &#x60;MessageCorrelationBuilder#correlateWithResult()&#x60; and &#x60;MessageCorrelationBuilder#correlateAllWithResult()&#x60;. For more information about the correlation behavior, see the [Message Events](https://docs.camunda.org/manual/7.13/bpmn20/events/message-events/) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.13/reference/bpmn20/).
     * <p><b>200</b> - Request successful. The property &#x60;resultEnabled&#x60; in the request body was &#x60;true&#x60;. The &#x60;variables&#x60; property is only returned, if the property variablesInResultEnable&#x60; was set to &#x60;true&#x60; in the request.
     * <p><b>204</b> - Request successful. The property &#x60;resultEnabled&#x60; in the request body was &#x60;false&#x60; (Default).
     * <p><b>400</b> - Returned if: * no &#x60;messageName&#x60; was supplied * both &#x60;tenantId&#x60; and &#x60;withoutTenantId&#x60; are supplied * the message has not been correlated to exactly one entity (execution or process definition) * the variable value or type is invalid, for example if the value could not be parsed to an Integer value or the passed variable type is not supported.  See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param correlationMessageDto  (optional)
     * @return List&lt;MessageCorrelationResultWithVariableDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MessageCorrelationResultWithVariableDto> deliverMessage(CorrelationMessageDto correlationMessageDto) throws RestClientException {
        return deliverMessageWithHttpInfo(correlationMessageDto).getBody();
    }

    /**
     * 
     * Correlates a message to the process engine to either trigger a message start event or an intermediate message  catching event. Internally this maps to the engine&#39;s message correlation builder methods &#x60;MessageCorrelationBuilder#correlateWithResult()&#x60; and &#x60;MessageCorrelationBuilder#correlateAllWithResult()&#x60;. For more information about the correlation behavior, see the [Message Events](https://docs.camunda.org/manual/7.13/bpmn20/events/message-events/) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.13/reference/bpmn20/).
     * <p><b>200</b> - Request successful. The property &#x60;resultEnabled&#x60; in the request body was &#x60;true&#x60;. The &#x60;variables&#x60; property is only returned, if the property variablesInResultEnable&#x60; was set to &#x60;true&#x60; in the request.
     * <p><b>204</b> - Request successful. The property &#x60;resultEnabled&#x60; in the request body was &#x60;false&#x60; (Default).
     * <p><b>400</b> - Returned if: * no &#x60;messageName&#x60; was supplied * both &#x60;tenantId&#x60; and &#x60;withoutTenantId&#x60; are supplied * the message has not been correlated to exactly one entity (execution or process definition) * the variable value or type is invalid, for example if the value could not be parsed to an Integer value or the passed variable type is not supported.  See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param correlationMessageDto  (optional)
     * @return ResponseEntity&lt;List&lt;MessageCorrelationResultWithVariableDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MessageCorrelationResultWithVariableDto>> deliverMessageWithHttpInfo(CorrelationMessageDto correlationMessageDto) throws RestClientException {
        Object postBody = correlationMessageDto;
        
        String path = apiClient.expandPath("/message", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<MessageCorrelationResultWithVariableDto>> returnType = new ParameterizedTypeReference<List<MessageCorrelationResultWithVariableDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
