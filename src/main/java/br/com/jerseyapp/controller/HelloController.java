package br.com.jerseyapp.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController {
	
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  @Path("/ola")
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }

}
