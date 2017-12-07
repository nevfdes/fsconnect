
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
    "airlines",
    "airports"
})
public class Appendix implements Serializable
{

    @JsonProperty("airlines")
    private Airlines airlines;
    @JsonProperty("airports")
    private Airports airports;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -61117051402950137L;

    @JsonProperty("airlines")
    public Airlines getAirlines() {
        return airlines;
    }

    @JsonProperty("airlines")
    public void setAirlines(Airlines airlines) {
        this.airlines = airlines;
    }

    @JsonProperty("airports")
    public Airports getAirports() {
        return airports;
    }

    @JsonProperty("airports")
    public void setAirports(Airports airports) {
        this.airports = airports;
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
