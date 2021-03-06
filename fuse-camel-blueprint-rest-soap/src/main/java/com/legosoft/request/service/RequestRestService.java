package com.legosoft.request.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.legosoft.model.request.pojo.Persona;

@Path("/")
public interface RequestRestService {

	@POST
	@Path(value = "/legosoft")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response process(Persona persona);

}
