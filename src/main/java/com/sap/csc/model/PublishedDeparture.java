
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
    "dateLocal",
    "dateUtc"
})
public class PublishedDeparture implements Serializable
{

    @JsonProperty("dateLocal")
    private String dateLocal;
    @JsonProperty("dateUtc")
    private String dateUtc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2598813036698346046L;

    @JsonProperty("dateLocal")
    public String getDateLocal() {
        return dateLocal;
    }

    @JsonProperty("dateLocal")
    public void setDateLocal(String dateLocal) {
        this.dateLocal = dateLocal;
    }

    @JsonProperty("dateUtc")
    public String getDateUtc() {
        return dateUtc;
    }

    @JsonProperty("dateUtc")
    public void setDateUtc(String dateUtc) {
        this.dateUtc = dateUtc;
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
