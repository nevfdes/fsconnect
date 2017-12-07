
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
    "ruleEvent"
})
public class RuleEvents implements Serializable
{

    @JsonProperty("ruleEvent")
    private RuleEvent ruleEvent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 829648986536906496L;

    @JsonProperty("ruleEvent")
    public RuleEvent getRuleEvent() {
        return ruleEvent;
    }

    @JsonProperty("ruleEvent")
    public void setRuleEvent(RuleEvent ruleEvent) {
        this.ruleEvent = ruleEvent;
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
