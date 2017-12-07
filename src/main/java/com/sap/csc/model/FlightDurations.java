
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
    "scheduledBlockMinutes",
    "blockMinutes",
    "scheduledAirMinutes",
    "airMinutes",
    "scheduledTaxiOutMinutes",
    "taxiOutMinutes",
    "scheduledTaxiInMinutes",
    "taxiInMinutes"
})
public class FlightDurations implements Serializable
{

    @JsonProperty("scheduledBlockMinutes")
    private String scheduledBlockMinutes;
    @JsonProperty("blockMinutes")
    private String blockMinutes;
    @JsonProperty("scheduledAirMinutes")
    private String scheduledAirMinutes;
    @JsonProperty("airMinutes")
    private String airMinutes;
    @JsonProperty("scheduledTaxiOutMinutes")
    private String scheduledTaxiOutMinutes;
    @JsonProperty("taxiOutMinutes")
    private String taxiOutMinutes;
    @JsonProperty("scheduledTaxiInMinutes")
    private String scheduledTaxiInMinutes;
    @JsonProperty("taxiInMinutes")
    private String taxiInMinutes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3445344220898308434L;

    @JsonProperty("scheduledBlockMinutes")
    public String getScheduledBlockMinutes() {
        return scheduledBlockMinutes;
    }

    @JsonProperty("scheduledBlockMinutes")
    public void setScheduledBlockMinutes(String scheduledBlockMinutes) {
        this.scheduledBlockMinutes = scheduledBlockMinutes;
    }

    @JsonProperty("blockMinutes")
    public String getBlockMinutes() {
        return blockMinutes;
    }

    @JsonProperty("blockMinutes")
    public void setBlockMinutes(String blockMinutes) {
        this.blockMinutes = blockMinutes;
    }

    @JsonProperty("scheduledAirMinutes")
    public String getScheduledAirMinutes() {
        return scheduledAirMinutes;
    }

    @JsonProperty("scheduledAirMinutes")
    public void setScheduledAirMinutes(String scheduledAirMinutes) {
        this.scheduledAirMinutes = scheduledAirMinutes;
    }

    @JsonProperty("airMinutes")
    public String getAirMinutes() {
        return airMinutes;
    }

    @JsonProperty("airMinutes")
    public void setAirMinutes(String airMinutes) {
        this.airMinutes = airMinutes;
    }

    @JsonProperty("scheduledTaxiOutMinutes")
    public String getScheduledTaxiOutMinutes() {
        return scheduledTaxiOutMinutes;
    }

    @JsonProperty("scheduledTaxiOutMinutes")
    public void setScheduledTaxiOutMinutes(String scheduledTaxiOutMinutes) {
        this.scheduledTaxiOutMinutes = scheduledTaxiOutMinutes;
    }

    @JsonProperty("taxiOutMinutes")
    public String getTaxiOutMinutes() {
        return taxiOutMinutes;
    }

    @JsonProperty("taxiOutMinutes")
    public void setTaxiOutMinutes(String taxiOutMinutes) {
        this.taxiOutMinutes = taxiOutMinutes;
    }

    @JsonProperty("scheduledTaxiInMinutes")
    public String getScheduledTaxiInMinutes() {
        return scheduledTaxiInMinutes;
    }

    @JsonProperty("scheduledTaxiInMinutes")
    public void setScheduledTaxiInMinutes(String scheduledTaxiInMinutes) {
        this.scheduledTaxiInMinutes = scheduledTaxiInMinutes;
    }

    @JsonProperty("taxiInMinutes")
    public String getTaxiInMinutes() {
        return taxiInMinutes;
    }

    @JsonProperty("taxiInMinutes")
    public void setTaxiInMinutes(String taxiInMinutes) {
        this.taxiInMinutes = taxiInMinutes;
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
