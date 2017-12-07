
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
@JsonPropertyOrder({ "event", "dataSource", "dateTimeRecorded", "rule", "flightStatus" })
public class Alert implements Serializable {

	@JsonProperty("event")
	private Event event;
	@JsonProperty("dataSource")
	private String dataSource;
	@JsonProperty("dateTimeRecorded")
	private String dateTimeRecorded;
	@JsonProperty("rule")
	private Rule rule;
	@JsonProperty("flightStatus")
	private FlightStatus flightStatus;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	private final static long serialVersionUID = -4046675206812238983L;

	@JsonProperty("event")
	public Event getEvent() {
		return event;
	}

	@JsonProperty("event")
	public void setEvent(Event event) {
		this.event = event;
	}

	@JsonProperty("dataSource")
	public String getDataSource() {
		return dataSource;
	}

	@JsonProperty("dataSource")
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	@JsonProperty("dateTimeRecorded")
	public String getDateTimeRecorded() {
		return dateTimeRecorded;
	}

	@JsonProperty("dateTimeRecorded")
	public void setDateTimeRecorded(String dateTimeRecorded) {
		this.dateTimeRecorded = dateTimeRecorded;
	}

	@JsonProperty("rule")
	public Rule getRule() {
		return rule;
	}

	@JsonProperty("rule")
	public void setRule(Rule rule) {
		this.rule = rule;
	}

	@JsonProperty("flightStatus")
	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	@JsonProperty("flightStatus")
	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
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
