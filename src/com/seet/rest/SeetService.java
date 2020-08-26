package com.seet.rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest")
public class SeetService {
	
	@GET
	@Path("/html")
	@Produces("text/html")
	
	public String aaahtml() {
		return "<p>SSSSSSSSSSSSSSSSS HTML</p>";
	}

	
	@GET
	@Path("/text")
	@Produces("text/plain")
	
	public String aaatext() {
		return "SSSSSSSSSSSS TEXT";
	}
	

	@GET
	@Path("/json")
	@Produces("application/JSON")
	
	public String aaajson() {
		JsonObject value = Json.createObjectBuilder()
				.add("info","json message")
				.add("message", "SSSSSSSSSSS")
				.build();
				
				return value.toString();
	}
	
	
	
}
