
package com.unblu.protodoc4j;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "deprecated",
        "validator.field",
        "google.api.http"
})

public class Options {

    private Boolean deprecated;
    @JsonProperty("validator.field")

    private List<ValidatorField> validatorField;

    @JsonProperty("google.api.http")

    private GoogleApiHttp googleApiHttp;

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public List<ValidatorField> getValidatorField() {
        return validatorField;
    }

    public void setValidatorField(List<ValidatorField> validatorField) {
        this.validatorField = validatorField;
    }

    public GoogleApiHttp getGoogleApiHttp() {
        return googleApiHttp;
    }

    public void setGoogleApiHttp(GoogleApiHttp googleApiHttp) {
        this.googleApiHttp = googleApiHttp;
    }

}
