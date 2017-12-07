package com.sap.csc.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;

import com.sap.csc.client.FlexCredentials;
import com.sap.csc.client.FlightAlertsClient;

/**
 * Servlet implementation class AlertHandler
 */
@WebServlet("/AlertService")
public class AlertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlertServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> options = new HashMap<>();
		options.put("type", "JSON");
		options.put("deliverTo", "smtp://neville.fernandes@sap.com");
		
		FlightAlertsClient flightAlertsClient = new FlightAlertsClient(FlexCredentials.APP_ID, FlexCredentials.APP_KEY);
		flightAlertsClient.testAlert("AA", "100", "JFK", "LHR", options);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
