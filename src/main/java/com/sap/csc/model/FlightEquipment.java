
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
    "scheduledEquipmentIataCode",
    "actualEquipmentIataCode"
})
public class FlightEquipment implements Serializable
{

    @JsonProperty("scheduledEquipmentIataCode")
    private String scheduledEquipmentIataCode;
    @JsonProperty("actualEquipmentIataCode")
    private String actualEquipmentIataCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 26532909434005127L;

    @JsonProperty("scheduledEquipmentIataCode")
    public String getScheduledEquipmentIataCode() {
        return scheduledEquipmentIataCode;
    }

    @JsonProperty("scheduledEquipmentIataCode")
    public void setScheduledEquipmentIataCode(String scheduledEquipmentIataCode) {
        this.scheduledEquipmentIataCode = scheduledEquipmentIataCode;
    }

    @JsonProperty("actualEquipmentIataCode")
    public String getActualEquipmentIataCode() {
        return actualEquipmentIataCode;
    }

    @JsonProperty("actualEquipmentIataCode")
    public void setActualEquipmentIataCode(String actualEquipmentIataCode) {
        this.actualEquipmentIataCode = actualEquipmentIataCode;
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
