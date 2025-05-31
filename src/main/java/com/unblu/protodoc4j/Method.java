
package com.unblu.protodoc4j;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "description",
        "requestType",
        "requestLongType",
        "requestFullType",
        "requestStreaming",
        "responseType",
        "responseLongType",
        "responseFullType",
        "responseStreaming",
        "options"
})

public class Method {

    private String name;

    private String description;

    private String requestType;

    private String requestLongType;

    private String requestFullType;

    private Boolean requestStreaming;

    private String responseType;

    private String responseLongType;

    private String responseFullType;

    private Boolean responseStreaming;

    private Options options;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestLongType() {
        return requestLongType;
    }

    public void setRequestLongType(String requestLongType) {
        this.requestLongType = requestLongType;
    }

    public String getRequestFullType() {
        return requestFullType;
    }

    public void setRequestFullType(String requestFullType) {
        this.requestFullType = requestFullType;
    }

    public Boolean getRequestStreaming() {
        return requestStreaming;
    }

    public void setRequestStreaming(Boolean requestStreaming) {
        this.requestStreaming = requestStreaming;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getResponseLongType() {
        return responseLongType;
    }

    public void setResponseLongType(String responseLongType) {
        this.responseLongType = responseLongType;
    }

    public String getResponseFullType() {
        return responseFullType;
    }

    public void setResponseFullType(String responseFullType) {
        this.responseFullType = responseFullType;
    }

    public Boolean getResponseStreaming() {
        return responseStreaming;
    }

    public void setResponseStreaming(Boolean responseStreaming) {
        this.responseStreaming = responseStreaming;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

}
