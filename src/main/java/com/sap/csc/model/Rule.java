
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
    "id",
    "name",
    "carrierFsCode",
    "flightNumber",
    "departureAirportFsCode",
    "arrivalAirportFsCode",
    "departure",
    "arrival",
    "ruleEvents",
    "nameValues",
    "delivery"
})
public class Rule implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("carrierFsCode")
    private String carrierFsCode;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("departureAirportFsCode")
    private String departureAirportFsCode;
    @JsonProperty("arrivalAirportFsCode")
    private String arrivalAirportFsCode;
    @JsonProperty("departure")
    private String departure;
    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("ruleEvents")
    private RuleEvents ruleEvents;
    @JsonProperty("nameValues")
    private Object nameValues;
    @JsonProperty("delivery")
    private Delivery delivery;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5348210063639311358L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("carrierFsCode")
    public String getCarrierFsCode() {
        return carrierFsCode;
    }

    @JsonProperty("carrierFsCode")
    public void setCarrierFsCode(String carrierFsCode) {
        this.carrierFsCode = carrierFsCode;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("departureAirportFsCode")
    public String getDepartureAirportFsCode() {
        return departureAirportFsCode;
    }

    @JsonProperty("departureAirportFsCode")
    public void setDepartureAirportFsCode(String departureAirportFsCode) {
        this.departureAirportFsCode = departureAirportFsCode;
    }

    @JsonProperty("arrivalAirportFsCode")
    public String getArrivalAirportFsCode() {
        return arrivalAirportFsCode;
    }

    @JsonProperty("arrivalAirportFsCode")
    public void setArrivalAirportFsCode(String arrivalAirportFsCode) {
        this.arrivalAirportFsCode = arrivalAirportFsCode;
    }

    @JsonProperty("departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @JsonProperty("arrival")
    public String getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("ruleEvents")
    public RuleEvents getRuleEvents() {
        return ruleEvents;
    }

    @JsonProperty("ruleEvents")
    public void setRuleEvents(RuleEvents ruleEvents) {
        this.ruleEvents = ruleEvents;
    }

    @JsonProperty("nameValues")
    public Object getNameValues() {
        return nameValues;
    }

    @JsonProperty("nameValues")
    public void setNameValues(Object nameValues) {
        this.nameValues = nameValues;
    }

    @JsonProperty("delivery")
    public Delivery getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
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
