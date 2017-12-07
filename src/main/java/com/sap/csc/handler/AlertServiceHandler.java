package com.sap.csc.handler;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.csc.model.AlertResponse;

@Path("/alert")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AlertServiceHandler {

	public static final Logger LOG = LoggerFactory.getLogger(AlertServiceHandler.class);

	@Context
	UriInfo uriInfo;

	@Context
	Request request;

	@GET
	public String getServerTime() {
		LOG.info("RESTful Service 'AlertService' is running ==> ping");
		return "Alert Service - received ping on " + new Date().toString();
	}

	@POST
	@Path("callback")
	public String alertCallback(AlertResponse response) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			LOG.info("alertCallback() - execution starts.");
			String serviceResponse = mapper.writeValueAsString(response);
			
			LOG.info("Alert Response - {}", serviceResponse);
			return serviceResponse;

		} catch (JsonProcessingException e) {
			LOG.error("alertCallback() - Issue while translating the response.");
			return "{ status : 500, reason : 'Response Processing Exception' }";
		}
	}

}
