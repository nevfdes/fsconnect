
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
    "updatedDateField"
})
public class UpdatedDateFields implements Serializable
{

    @JsonProperty("updatedDateField")
    private UpdatedDateField updatedDateField;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5553020195570161078L;

    @JsonProperty("updatedDateField")
    public UpdatedDateField getUpdatedDateField() {
        return updatedDateField;
    }

    @JsonProperty("updatedDateField")
    public void setUpdatedDateField(UpdatedDateField updatedDateField) {
        this.updatedDateField = updatedDateField;
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
