
package com.unblu.protodoc4j;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "longName",
        "fullName",
        "description",
        "label",
        "type",
        "longType",
        "fullType",
        "number",
        "defaultValue",
        "containingType",
        "containingLongType",
        "containingFullType",
        "scopeType",
        "scopeLongType",
        "scopeFullType"
})

public class Extension {

    private String name;

    private String longName;

    private String fullName;

    private String description;

    private String label;

    private String type;

    private String longType;

    private String fullType;

    private Integer number;

    private String defaultValue;

    private String containingType;

    private String containingLongType;

    private String containingFullType;

    private String scopeType;

    private String scopeLongType;

    private String scopeFullType;

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLongType() {
        return longType;
    }

    public void setLongType(String longType) {
        this.longType = longType;
    }

    public String getFullType() {
        return fullType;
    }

    public void setFullType(String fullType) {
        this.fullType = fullType;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getContainingType() {
        return containingType;
    }

    public void setContainingType(String containingType) {
        this.containingType = containingType;
    }

    public String getContainingLongType() {
        return containingLongType;
    }

    public void setContainingLongType(String containingLongType) {
        this.containingLongType = containingLongType;
    }

    public String getContainingFullType() {
        return containingFullType;
    }

    public void setContainingFullType(String containingFullType) {
        this.containingFullType = containingFullType;
    }

    public String getScopeType() {
        return scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public String getScopeLongType() {
        return scopeLongType;
    }

    public void setScopeLongType(String scopeLongType) {
        this.scopeLongType = scopeLongType;
    }

    public String getScopeFullType() {
        return scopeFullType;
    }

    public void setScopeFullType(String scopeFullType) {
        this.scopeFullType = scopeFullType;
    }

}
