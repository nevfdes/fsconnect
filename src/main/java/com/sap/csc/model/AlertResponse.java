
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
@JsonPropertyOrder({ "alert", "appendix" })
public class AlertResponse implements Serializable {

	@JsonProperty("alert")
	private Alert alert;
	@JsonProperty("appendix")
	private Appendix appendix;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8304767972439347129L;

	@JsonProperty("alert")
	public Alert getAlert() {
		return alert;
	}

	@JsonProperty("alert")
	public void setAlert(Alert alert) {
		this.alert = alert;
	}

	@JsonProperty("appendix")
	public Appendix getAppendix() {
		return appendix;
	}

	@JsonProperty("appendix")
	public void setAppendix(Appendix appendix) {
		this.appendix = appendix;
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
