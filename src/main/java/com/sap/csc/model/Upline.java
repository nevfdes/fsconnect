
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
    "fsCode",
    "flightId"
})
public class Upline implements Serializable
{

    @JsonProperty("fsCode")
    private String fsCode;
    @JsonProperty("flightId")
    private String flightId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7354065679242859115L;

    @JsonProperty("fsCode")
    public String getFsCode() {
        return fsCode;
    }

    @JsonProperty("fsCode")
    public void setFsCode(String fsCode) {
        this.fsCode = fsCode;
    }

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
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
