
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
    "field",
    "originalDateLocal",
    "newDateLocal"
})
public class UpdatedDateField implements Serializable
{

    @JsonProperty("field")
    private String field;
    @JsonProperty("originalDateLocal")
    private String originalDateLocal;
    @JsonProperty("newDateLocal")
    private String newDateLocal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2910675369914129111L;

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("originalDateLocal")
    public String getOriginalDateLocal() {
        return originalDateLocal;
    }

    @JsonProperty("originalDateLocal")
    public void setOriginalDateLocal(String originalDateLocal) {
        this.originalDateLocal = originalDateLocal;
    }

    @JsonProperty("newDateLocal")
    public String getNewDateLocal() {
        return newDateLocal;
    }

    @JsonProperty("newDateLocal")
    public void setNewDateLocal(String newDateLocal) {
        this.newDateLocal = newDateLocal;
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
