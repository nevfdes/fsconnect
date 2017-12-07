package com.sap.csc.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class FlexHelper {
	public static final String FLEX_BASE = "https://api.flightstats.com/flex";
	public static final String APP_ID = "appId";
	public static final String APP_KEY = "appKey";
	public static final String EXTENDED_OPTIONS = "extendedOptions";
	public static final String INCLUDE_NEW_FIELDS = "includeNewFields";
	public static final String INCLUDE_DELTAS = "includeDeltas";
	public static final String INCLUDE_DIRECTS = "includeDirects";
	public static final String INCLUDE_CARGO = "includeCargo";
	public static final String INCLUDE_SURFACE = "includeSurface";
	public static final String EXCLUDE_APPENDIX = "excludeAppendix";
	public static final String LANGUAGE_CODE = "languageCode:%s";
	private static final Client httpClient = ClientBuilder.newClient().register(JacksonJsonProvider.class);

	private FlexHelper() {
		super();
	}

	public static <X> X executeHttpGet(URI uri, Class<X> clazz) {
		Response response = httpClient.target(uri).request("application/json;charset=UTF-8").get(Response.class);
		checkForError(uri, response);
		return response.readEntity(clazz);
	}

	private static void checkForError(URI source, Response response) {
		if (response.getStatus() >= 300) {
			throw new RuntimeException("http status=" + response.getStatus() + ", source: " + source + ": "
					+ response.readEntity(String.class));
		}
	}

	public static UriBuilder createRequestUri(String path, Map<String, String> options, String appId, String appKey) {
		UriBuilder builder = UriBuilder.fromPath(FLEX_BASE + path).queryParam(APP_ID, appId).queryParam(APP_KEY,
				appKey);
		appendQueryParams(options, builder);
		return builder;
	}

	private static void appendQueryParams(Map<String, String> options, UriBuilder builder) {
		options = options == null ? new HashMap<>() : options;
		if (options.containsKey(EXTENDED_OPTIONS)) {
			options.put(EXTENDED_OPTIONS, options.get(EXTENDED_OPTIONS) + ",useHttpErrors");
		} else {
			options.put(EXTENDED_OPTIONS, "useHttpErrors");
		}
		for (Map.Entry<String, String> option : options.entrySet()) {
			builder.queryParam(option.getKey(), option.getValue());
		}
	}
}
