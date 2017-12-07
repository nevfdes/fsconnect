
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
    "publishedDeparture",
    "publishedArrival",
    "scheduledGateDeparture",
    "estimatedGateDeparture",
    "actualGateDeparture",
    "flightPlanPlannedDeparture",
    "estimatedRunwayDeparture",
    "actualRunwayDeparture",
    "scheduledGateArrival",
    "estimatedGateArrival",
    "actualGateArrival",
    "flightPlanPlannedArrival",
    "estimatedRunwayArrival",
    "actualRunwayArrival"
})
public class OperationalTimes implements Serializable
{

    @JsonProperty("publishedDeparture")
    private PublishedDeparture publishedDeparture;
    @JsonProperty("publishedArrival")
    private PublishedArrival publishedArrival;
    @JsonProperty("scheduledGateDeparture")
    private ScheduledGateDeparture scheduledGateDeparture;
    @JsonProperty("estimatedGateDeparture")
    private EstimatedGateDeparture estimatedGateDeparture;
    @JsonProperty("actualGateDeparture")
    private ActualGateDeparture actualGateDeparture;
    @JsonProperty("flightPlanPlannedDeparture")
    private FlightPlanPlannedDeparture flightPlanPlannedDeparture;
    @JsonProperty("estimatedRunwayDeparture")
    private EstimatedRunwayDeparture estimatedRunwayDeparture;
    @JsonProperty("actualRunwayDeparture")
    private ActualRunwayDeparture actualRunwayDeparture;
    @JsonProperty("scheduledGateArrival")
    private ScheduledGateArrival scheduledGateArrival;
    @JsonProperty("estimatedGateArrival")
    private EstimatedGateArrival estimatedGateArrival;
    @JsonProperty("actualGateArrival")
    private ActualGateArrival actualGateArrival;
    @JsonProperty("flightPlanPlannedArrival")
    private FlightPlanPlannedArrival flightPlanPlannedArrival;
    @JsonProperty("estimatedRunwayArrival")
    private EstimatedRunwayArrival estimatedRunwayArrival;
    @JsonProperty("actualRunwayArrival")
    private ActualRunwayArrival actualRunwayArrival;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1085166929476457058L;

    @JsonProperty("publishedDeparture")
    public PublishedDeparture getPublishedDeparture() {
        return publishedDeparture;
    }

    @JsonProperty("publishedDeparture")
    public void setPublishedDeparture(PublishedDeparture publishedDeparture) {
        this.publishedDeparture = publishedDeparture;
    }

    @JsonProperty("publishedArrival")
    public PublishedArrival getPublishedArrival() {
        return publishedArrival;
    }

    @JsonProperty("publishedArrival")
    public void setPublishedArrival(PublishedArrival publishedArrival) {
        this.publishedArrival = publishedArrival;
    }

    @JsonProperty("scheduledGateDeparture")
    public ScheduledGateDeparture getScheduledGateDeparture() {
        return scheduledGateDeparture;
    }

    @JsonProperty("scheduledGateDeparture")
    public void setScheduledGateDeparture(ScheduledGateDeparture scheduledGateDeparture) {
        this.scheduledGateDeparture = scheduledGateDeparture;
    }

    @JsonProperty("estimatedGateDeparture")
    public EstimatedGateDeparture getEstimatedGateDeparture() {
        return estimatedGateDeparture;
    }

    @JsonProperty("estimatedGateDeparture")
    public void setEstimatedGateDeparture(EstimatedGateDeparture estimatedGateDeparture) {
        this.estimatedGateDeparture = estimatedGateDeparture;
    }

    @JsonProperty("actualGateDeparture")
    public ActualGateDeparture getActualGateDeparture() {
        return actualGateDeparture;
    }

    @JsonProperty("actualGateDeparture")
    public void setActualGateDeparture(ActualGateDeparture actualGateDeparture) {
        this.actualGateDeparture = actualGateDeparture;
    }

    @JsonProperty("flightPlanPlannedDeparture")
    public FlightPlanPlannedDeparture getFlightPlanPlannedDeparture() {
        return flightPlanPlannedDeparture;
    }

    @JsonProperty("flightPlanPlannedDeparture")
    public void setFlightPlanPlannedDeparture(FlightPlanPlannedDeparture flightPlanPlannedDeparture) {
        this.flightPlanPlannedDeparture = flightPlanPlannedDeparture;
    }

    @JsonProperty("estimatedRunwayDeparture")
    public EstimatedRunwayDeparture getEstimatedRunwayDeparture() {
        return estimatedRunwayDeparture;
    }

    @JsonProperty("estimatedRunwayDeparture")
    public void setEstimatedRunwayDeparture(EstimatedRunwayDeparture estimatedRunwayDeparture) {
        this.estimatedRunwayDeparture = estimatedRunwayDeparture;
    }

    @JsonProperty("actualRunwayDeparture")
    public ActualRunwayDeparture getActualRunwayDeparture() {
        return actualRunwayDeparture;
    }

    @JsonProperty("actualRunwayDeparture")
    public void setActualRunwayDeparture(ActualRunwayDeparture actualRunwayDeparture) {
        this.actualRunwayDeparture = actualRunwayDeparture;
    }

    @JsonProperty("scheduledGateArrival")
    public ScheduledGateArrival getScheduledGateArrival() {
        return scheduledGateArrival;
    }

    @JsonProperty("scheduledGateArrival")
    public void setScheduledGateArrival(ScheduledGateArrival scheduledGateArrival) {
        this.scheduledGateArrival = scheduledGateArrival;
    }

    @JsonProperty("estimatedGateArrival")
    public EstimatedGateArrival getEstimatedGateArrival() {
        return estimatedGateArrival;
    }

    @JsonProperty("estimatedGateArrival")
    public void setEstimatedGateArrival(EstimatedGateArrival estimatedGateArrival) {
        this.estimatedGateArrival = estimatedGateArrival;
    }

    @JsonProperty("actualGateArrival")
    public ActualGateArrival getActualGateArrival() {
        return actualGateArrival;
    }

    @JsonProperty("actualGateArrival")
    public void setActualGateArrival(ActualGateArrival actualGateArrival) {
        this.actualGateArrival = actualGateArrival;
    }

    @JsonProperty("flightPlanPlannedArrival")
    public FlightPlanPlannedArrival getFlightPlanPlannedArrival() {
        return flightPlanPlannedArrival;
    }

    @JsonProperty("flightPlanPlannedArrival")
    public void setFlightPlanPlannedArrival(FlightPlanPlannedArrival flightPlanPlannedArrival) {
        this.flightPlanPlannedArrival = flightPlanPlannedArrival;
    }

    @JsonProperty("estimatedRunwayArrival")
    public EstimatedRunwayArrival getEstimatedRunwayArrival() {
        return estimatedRunwayArrival;
    }

    @JsonProperty("estimatedRunwayArrival")
    public void setEstimatedRunwayArrival(EstimatedRunwayArrival estimatedRunwayArrival) {
        this.estimatedRunwayArrival = estimatedRunwayArrival;
    }

    @JsonProperty("actualRunwayArrival")
    public ActualRunwayArrival getActualRunwayArrival() {
        return actualRunwayArrival;
    }

    @JsonProperty("actualRunwayArrival")
    public void setActualRunwayArrival(ActualRunwayArrival actualRunwayArrival) {
        this.actualRunwayArrival = actualRunwayArrival;
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
