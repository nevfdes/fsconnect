
package com.sap.csc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flightStatusUpdate"
})
public class FlightStatusUpdates implements Serializable
{

    @JsonProperty("flightStatusUpdate")
    private FlightStatusUpdate flightStatusUpdate;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4238971572659827833L;

//    @JsonProperty("flightStatusUpdate")
//    public List<FlightStatusUpdate> getFlightStatusUpdate() {
//        return flightStatusUpdate;
//    }

//    @JsonProperty("flightStatusUpdate")
//    public void setFlightStatusUpdate(List<FlightStatusUpdate> flightStatusUpdate) {
//        this.flightStatusUpdate = flightStatusUpdate;
//    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
