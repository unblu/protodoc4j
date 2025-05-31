
package com.unblu.protodoc4j;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "protoType",
        "notes",
        "cppType",
        "csType",
        "goType",
        "javaType",
        "phpType",
        "pythonType",
        "rubyType"
})

public class ScalarValueType {

    private String protoType;

    private String notes;

    private String cppType;

    private String csType;

    private String goType;

    private String javaType;

    private String phpType;

    private String pythonType;

    private String rubyType;

    public String getProtoType() {
        return protoType;
    }

    public void setProtoType(String protoType) {
        this.protoType = protoType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCppType() {
        return cppType;
    }

    public void setCppType(String cppType) {
        this.cppType = cppType;
    }

    public String getCsType() {
        return csType;
    }

    public void setCsType(String csType) {
        this.csType = csType;
    }

    public String getGoType() {
        return goType;
    }

    public void setGoType(String goType) {
        this.goType = goType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getPhpType() {
        return phpType;
    }

    public void setPhpType(String phpType) {
        this.phpType = phpType;
    }

    public String getPythonType() {
        return pythonType;
    }

    public void setPythonType(String pythonType) {
        this.pythonType = pythonType;
    }

    public String getRubyType() {
        return rubyType;
    }

    public void setRubyType(String rubyType) {
        this.rubyType = rubyType;
    }

}
