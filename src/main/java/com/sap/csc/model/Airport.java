
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
    "fs",
    "iata",
    "icao",
    "faa",
    "name",
    "street1",
    "street2",
    "city",
    "cityCode",
    "stateCode",
    "postalCode",
    "countryCode",
    "countryName",
    "regionName",
    "timeZoneRegionName",
    "weatherZone",
    "localTime",
    "utcOffsetHours",
    "latitude",
    "longitude",
    "elevationFeet",
    "classification",
    "active"
})
public class Airport implements Serializable
{

    @JsonProperty("fs")
    private String fs;
    @JsonProperty("iata")
    private String iata;
    @JsonProperty("icao")
    private String icao;
    @JsonProperty("faa")
    private String faa;
    @JsonProperty("name")
    private String name;
    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("cityCode")
    private String cityCode;
    @JsonProperty("stateCode")
    private String stateCode;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("regionName")
    private String regionName;
    @JsonProperty("timeZoneRegionName")
    private String timeZoneRegionName;
    @JsonProperty("weatherZone")
    private String weatherZone;
    @JsonProperty("localTime")
    private String localTime;
    @JsonProperty("utcOffsetHours")
    private String utcOffsetHours;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("elevationFeet")
    private String elevationFeet;
    @JsonProperty("classification")
    private String classification;
    @JsonProperty("active")
    private String active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1008055376259416743L;

    @JsonProperty("fs")
    public String getFs() {
        return fs;
    }

    @JsonProperty("fs")
    public void setFs(String fs) {
        this.fs = fs;
    }

    @JsonProperty("iata")
    public String getIata() {
        return iata;
    }

    @JsonProperty("iata")
    public void setIata(String iata) {
        this.iata = iata;
    }

    @JsonProperty("icao")
    public String getIcao() {
        return icao;
    }

    @JsonProperty("icao")
    public void setIcao(String icao) {
        this.icao = icao;
    }

    @JsonProperty("faa")
    public String getFaa() {
        return faa;
    }

    @JsonProperty("faa")
    public void setFaa(String faa) {
        this.faa = faa;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("cityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("cityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("regionName")
    public String getRegionName() {
        return regionName;
    }

    @JsonProperty("regionName")
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @JsonProperty("timeZoneRegionName")
    public String getTimeZoneRegionName() {
        return timeZoneRegionName;
    }

    @JsonProperty("timeZoneRegionName")
    public void setTimeZoneRegionName(String timeZoneRegionName) {
        this.timeZoneRegionName = timeZoneRegionName;
    }

    @JsonProperty("weatherZone")
    public String getWeatherZone() {
        return weatherZone;
    }

    @JsonProperty("weatherZone")
    public void setWeatherZone(String weatherZone) {
        this.weatherZone = weatherZone;
    }

    @JsonProperty("localTime")
    public String getLocalTime() {
        return localTime;
    }

    @JsonProperty("localTime")
    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    @JsonProperty("utcOffsetHours")
    public String getUtcOffsetHours() {
        return utcOffsetHours;
    }

    @JsonProperty("utcOffsetHours")
    public void setUtcOffsetHours(String utcOffsetHours) {
        this.utcOffsetHours = utcOffsetHours;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("elevationFeet")
    public String getElevationFeet() {
        return elevationFeet;
    }

    @JsonProperty("elevationFeet")
    public void setElevationFeet(String elevationFeet) {
        this.elevationFeet = elevationFeet;
    }

    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }

    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
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
