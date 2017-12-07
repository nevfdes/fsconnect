package com.sap.csc.client;

import java.time.LocalDate;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.sap.csc.domain.ResponseRule;

public class FlightAlertsClient {
	public static final String AIRPORT = "airport";
	public static final String CODE_TYPE = "codeType";
	public static final String UTC = "utc";
	public static final String MAX_POSITIONS = "maxPositions";
	public static final String MAX_POSITION_AGE_MINUTES = "maxPositionAgeMinutes";
	public static final String HOUR_OF_DAY = "hourOfDay";
	public static final String NUM_HOURS = "numHours";
	public static final String INCLUDE_FLIGHT_PLAN = "includeFlightPlan";

	private String appKey;
	private String appId;

	public FlightAlertsClient(String appId, String appKey) {
		this.appKey = appKey;
		this.appId = appId;
	}

	public ResponseRule testAlert(String carrier, String flight, String arrAirport, String depAirport,
			Map<String, String> options) {
		UriBuilder builder = FlexHelper.createRequestUri(String.format("/alerts/rest/v1/json/testdelivery/%s/%s/from/%s/to/%s",
				carrier, flight, arrAirport, depAirport), options, appId, appKey);
		return FlexHelper.executeHttpGet(builder.build(), ResponseRule.class);
	}

	public Object createAlert(String carrier, String flight, String depAirport, LocalDate date,
			Map<String, String> options) {
		UriBuilder builder = FlexHelper.createRequestUri(String.format("/alerts/rest/v1/json/create/%s/%s/from/%s/departing/%s/%s/%s",
				carrier, flight, depAirport, date.getYear(), date.getMonthValue(), date.getDayOfMonth()),
				options, appId, appKey);
		return FlexHelper.executeHttpGet(builder.build(), Object.class);
	}

}
