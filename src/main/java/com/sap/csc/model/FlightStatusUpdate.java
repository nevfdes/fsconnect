
package com.sap.csc.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updatedAt",
    "source",
    "updatedDateFields",
    "updatedTextFields"
})
public class FlightStatusUpdate implements Serializable
{

    @JsonProperty("updatedAt")
    private UpdatedAt updatedAt;
    @JsonProperty("source")
    private String source;
    @JsonProperty("updatedDateFields")
    private UpdatedDateFields updatedDateFields;
    @JsonProperty("updatedTextFields")
    private UpdatedTextFields updatedTextFields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8754543519474600741L;

    @JsonProperty("updatedAt")
    public UpdatedAt getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(UpdatedAt updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("updatedDateFields")
    public UpdatedDateFields getUpdatedDateFields() {
        return updatedDateFields;
    }

    @JsonProperty("updatedDateFields")
    public void setUpdatedDateFields(UpdatedDateFields updatedDateFields) {
        this.updatedDateFields = updatedDateFields;
    }

    @JsonProperty("updatedTextFields")
    public UpdatedTextFields getUpdatedTextFields() {
        return updatedTextFields;
    }

    @JsonProperty("updatedTextFields")
    public void setUpdatedTextFields(UpdatedTextFields updatedTextFields) {
        this.updatedTextFields = updatedTextFields;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
