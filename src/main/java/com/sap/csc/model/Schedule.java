
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
    "flightType",
    "serviceClasses",
    "restrictions",
    "uplines"
})
public class Schedule implements Serializable
{

    @JsonProperty("flightType")
    private String flightType;
    @JsonProperty("serviceClasses")
    private String serviceClasses;
    @JsonProperty("restrictions")
    private String restrictions;
    @JsonProperty("uplines")
    private Uplines uplines;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7521382540250320743L;

    @JsonProperty("flightType")
    public String getFlightType() {
        return flightType;
    }

    @JsonProperty("flightType")
    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    @JsonProperty("serviceClasses")
    public String getServiceClasses() {
        return serviceClasses;
    }

    @JsonProperty("serviceClasses")
    public void setServiceClasses(String serviceClasses) {
        this.serviceClasses = serviceClasses;
    }

    @JsonProperty("restrictions")
    public String getRestrictions() {
        return restrictions;
    }

    @JsonProperty("restrictions")
    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    @JsonProperty("uplines")
    public Uplines getUplines() {
        return uplines;
    }

    @JsonProperty("uplines")
    public void setUplines(Uplines uplines) {
        this.uplines = uplines;
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
