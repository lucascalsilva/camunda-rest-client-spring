package com.camunda.consulting.client.api;

import com.camunda.consulting.client.invoker.ApiClient;

import com.camunda.consulting.client.model.AuthorizationExceptionDto;
import com.camunda.consulting.client.model.CommentDto;
import com.camunda.consulting.client.model.ExceptionDto;

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
@Component("com.camunda.consulting.client.api.TaskCommentApi")
public class TaskCommentApi {
    private ApiClient apiClient;

    public TaskCommentApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskCommentApi(ApiClient apiClient) {
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
     * Creates a comment for a task by id.
     * <p><b>200</b> - Request successful.
     * <p><b>400</b> - The task does not exist or no comment message was submitted. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * <p><b>403</b> - The history of the engine is disabled. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param id The id of the task to add the comment to. (required)
     * @param commentDto **Note:** Only the &#x60;message&#x60; property will be used. Every other property passed to this endpoint will be ignored. (optional)
     * @return CommentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentDto createComment(String id, CommentDto commentDto) throws RestClientException {
        return createCommentWithHttpInfo(id, commentDto).getBody();
    }

    /**
     * 
     * Creates a comment for a task by id.
     * <p><b>200</b> - Request successful.
     * <p><b>400</b> - The task does not exist or no comment message was submitted. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * <p><b>403</b> - The history of the engine is disabled. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param id The id of the task to add the comment to. (required)
     * @param commentDto **Note:** Only the &#x60;message&#x60; property will be used. Every other property passed to this endpoint will be ignored. (optional)
     * @return ResponseEntity&lt;CommentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentDto> createCommentWithHttpInfo(String id, CommentDto commentDto) throws RestClientException {
        Object postBody = commentDto;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/task/{id}/comment/create", uriVariables);

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

        ParameterizedTypeReference<CommentDto> returnType = new ParameterizedTypeReference<CommentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieves a task comment by task id and comment id.
     * <p><b>200</b> - Request successful.
     * <p><b>404</b> - The task or comment with given task and comment id does not exist, or the history of the engine is disabled. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param id The id of the task. (required)
     * @param commentId The id of the comment to be retrieved. (required)
     * @return CommentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentDto getComment(String id, String commentId) throws RestClientException {
        return getCommentWithHttpInfo(id, commentId).getBody();
    }

    /**
     * 
     * Retrieves a task comment by task id and comment id.
     * <p><b>200</b> - Request successful.
     * <p><b>404</b> - The task or comment with given task and comment id does not exist, or the history of the engine is disabled. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param id The id of the task. (required)
     * @param commentId The id of the comment to be retrieved. (required)
     * @return ResponseEntity&lt;CommentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentDto> getCommentWithHttpInfo(String id, String commentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getComment");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling getComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("commentId", commentId);
        String path = apiClient.expandPath("/task/{id}/comment/{commentId}", uriVariables);

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

        ParameterizedTypeReference<CommentDto> returnType = new ParameterizedTypeReference<CommentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the comments for a task by id.
     * <p><b>200</b> - Request successful.
     * <p><b>404</b> - No task exists for the given task id. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param id The id of the task to retrieve the comments for. (required)
     * @return List&lt;CommentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CommentDto> getComments(String id) throws RestClientException {
        return getCommentsWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Gets the comments for a task by id.
     * <p><b>200</b> - Request successful.
     * <p><b>404</b> - No task exists for the given task id. See the [Introduction](https://docs.camunda.org/manual/7.13/reference/rest/overview/#error-handling) for the error response format.
     * @param id The id of the task to retrieve the comments for. (required)
     * @return ResponseEntity&lt;List&lt;CommentDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CommentDto>> getCommentsWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getComments");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/task/{id}/comment", uriVariables);

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

        ParameterizedTypeReference<List<CommentDto>> returnType = new ParameterizedTypeReference<List<CommentDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
