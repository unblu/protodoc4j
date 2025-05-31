
package com.unblu.protodoc4j;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {

    private String name;

    private String description;

    @JsonProperty("package")
    private String _package;

    private Boolean hasEnums;

    private Boolean hasExtensions;

    private Boolean hasMessages;

    private Boolean hasServices;

    private List<Enum> enums;

    private List<Extension> extensions;

    private List<Message> messages;

    private List<Service> services;

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

    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public Boolean getHasEnums() {
        return hasEnums;
    }

    public void setHasEnums(Boolean hasEnums) {
        this.hasEnums = hasEnums;
    }

    public Boolean getHasExtensions() {
        return hasExtensions;
    }

    public void setHasExtensions(Boolean hasExtensions) {
        this.hasExtensions = hasExtensions;
    }

    public Boolean getHasMessages() {
        return hasMessages;
    }

    public void setHasMessages(Boolean hasMessages) {
        this.hasMessages = hasMessages;
    }

    public Boolean getHasServices() {
        return hasServices;
    }

    public void setHasServices(Boolean hasServices) {
        this.hasServices = hasServices;
    }

    public List<Enum> getEnums() {
        return enums;
    }

    public void setEnums(List<Enum> enums) {
        this.enums = enums;
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

}
