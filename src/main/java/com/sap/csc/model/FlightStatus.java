
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
    "flightId",
    "carrierFsCode",
    "flightNumber",
    "departureAirportFsCode",
    "arrivalAirportFsCode",
    "departureDate",
    "arrivalDate",
    "status",
    "schedule",
    "operationalTimes",
    "codeshares",
    "flightDurations",
    "flightEquipment",
    "flightStatusUpdates"
})
public class FlightStatus implements Serializable
{

    @JsonProperty("flightId")
    private String flightId;
    @JsonProperty("carrierFsCode")
    private String carrierFsCode;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("departureAirportFsCode")
    private String departureAirportFsCode;
    @JsonProperty("arrivalAirportFsCode")
    private String arrivalAirportFsCode;
    @JsonProperty("departureDate")
    private DepartureDate departureDate;
    @JsonProperty("arrivalDate")
    private ArrivalDate arrivalDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("schedule")
    private Schedule schedule;
    @JsonProperty("operationalTimes")
    private OperationalTimes operationalTimes;
    @JsonProperty("codeshares")
    private Codeshares codeshares;
    @JsonProperty("flightDurations")
    private FlightDurations flightDurations;
    @JsonProperty("flightEquipment")
    private FlightEquipment flightEquipment;
    @JsonProperty("flightStatusUpdates")
    private FlightStatusUpdates flightStatusUpdates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6379289897732296165L;

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
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

    @JsonProperty("departureDate")
    public DepartureDate getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("departureDate")
    public void setDepartureDate(DepartureDate departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("arrivalDate")
    public ArrivalDate getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("arrivalDate")
    public void setArrivalDate(ArrivalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("operationalTimes")
    public OperationalTimes getOperationalTimes() {
        return operationalTimes;
    }

    @JsonProperty("operationalTimes")
    public void setOperationalTimes(OperationalTimes operationalTimes) {
        this.operationalTimes = operationalTimes;
    }

    @JsonProperty("codeshares")
    public Codeshares getCodeshares() {
        return codeshares;
    }

    @JsonProperty("codeshares")
    public void setCodeshares(Codeshares codeshares) {
        this.codeshares = codeshares;
    }

    @JsonProperty("flightDurations")
    public FlightDurations getFlightDurations() {
        return flightDurations;
    }

    @JsonProperty("flightDurations")
    public void setFlightDurations(FlightDurations flightDurations) {
        this.flightDurations = flightDurations;
    }

    @JsonProperty("flightEquipment")
    public FlightEquipment getFlightEquipment() {
        return flightEquipment;
    }

    @JsonProperty("flightEquipment")
    public void setFlightEquipment(FlightEquipment flightEquipment) {
        this.flightEquipment = flightEquipment;
    }

    @JsonProperty("flightStatusUpdates")
    public FlightStatusUpdates getFlightStatusUpdates() {
        return flightStatusUpdates;
    }

    @JsonProperty("flightStatusUpdates")
    public void setFlightStatusUpdates(FlightStatusUpdates flightStatusUpdates) {
        this.flightStatusUpdates = flightStatusUpdates;
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
