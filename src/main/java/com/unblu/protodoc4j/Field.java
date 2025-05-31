
package com.unblu.protodoc4j;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "description",
        "label",
        "type",
        "longType",
        "fullType",
        "ismap",
        "isoneof",
        "oneofdecl",
        "defaultValue",
        "options"
})

public class Field {

    private String name;

    private String description;

    private String label;

    private String type;

    private String longType;

    private String fullType;

    private Boolean ismap;

    private Boolean isoneof;

    private String oneofdecl;

    private String defaultValue;

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

    public Boolean getIsmap() {
        return ismap;
    }

    public void setIsmap(Boolean ismap) {
        this.ismap = ismap;
    }

    public Boolean getIsoneof() {
        return isoneof;
    }

    public void setIsoneof(Boolean isoneof) {
        this.isoneof = isoneof;
    }

    public String getOneofdecl() {
        return oneofdecl;
    }

    public void setOneofdecl(String oneofdecl) {
        this.oneofdecl = oneofdecl;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

}
