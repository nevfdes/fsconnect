
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
    "newText",
    "originalText"
})
public class UpdatedTextField implements Serializable
{

    @JsonProperty("field")
    private String field;
    @JsonProperty("newText")
    private String newText;
    @JsonProperty("originalText")
    private String originalText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2953964600489701059L;

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("newText")
    public String getNewText() {
        return newText;
    }

    @JsonProperty("newText")
    public void setNewText(String newText) {
        this.newText = newText;
    }

    @JsonProperty("originalText")
    public String getOriginalText() {
        return originalText;
    }

    @JsonProperty("originalText")
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
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
