
package com.unblu.protodoc4j;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "files",
        "scalarValueTypes"
})

public class Doc {

    private List<File> files;

    private List<ScalarValueType> scalarValueTypes;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<ScalarValueType> getScalarValueTypes() {
        return scalarValueTypes;
    }

    public void setScalarValueTypes(List<ScalarValueType> scalarValueTypes) {
        this.scalarValueTypes = scalarValueTypes;
    }

}
