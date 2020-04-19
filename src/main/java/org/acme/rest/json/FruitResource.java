package org.acme.rest.json;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruits")
public class FruitResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/fail")
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.TEXT_PLAIN)
    public String fail() {
        throw new RuntimeException("test");
    }
}