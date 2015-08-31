package com.airhacks.cursos.boundary;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by expertojava on 31/08/15.
 */

@Path("cursos")
public class CursosResource {

    @GET
    @Produces("application/json")
    public JsonObject all(){
        return Json.createObjectBuilder().add("cursos","JavaEE, JavaScript, MongoDB").build();
    }

}
