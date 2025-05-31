
package com.unblu.protodoc4j;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "longName",
        "fullName",
        "description",
        "hasExtensions",
        "hasFields",
        "hasOneofs",
        "extensions",
        "fields"
})

public class Message {

    private String name;

    private String longName;

    private String fullName;

    private String description;

    private Boolean hasExtensions;

    private Boolean hasFields;

    private Boolean hasOneofs;

    private List<Extension> extensions;

    private List<Field> fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHasExtensions() {
        return hasExtensions;
    }

    public void setHasExtensions(Boolean hasExtensions) {
        this.hasExtensions = hasExtensions;
    }

    public Boolean getHasFields() {
        return hasFields;
    }

    public void setHasFields(Boolean hasFields) {
        this.hasFields = hasFields;
    }

    public Boolean getHasOneofs() {
        return hasOneofs;
    }

    public void setHasOneofs(Boolean hasOneofs) {
        this.hasOneofs = hasOneofs;
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

}
