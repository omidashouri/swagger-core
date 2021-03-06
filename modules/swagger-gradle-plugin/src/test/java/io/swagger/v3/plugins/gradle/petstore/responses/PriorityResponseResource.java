package io.swagger.v3.plugins.gradle.petstore.responses;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.plugins.gradle.resources.exception.NotFoundException;
import io.swagger.v3.plugins.gradle.resources.model.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Resource with a Response at Method Level and Operation Level.
 */
public class PriorityResponseResource {
    @GET
    @Path("/priorityresponses")
    @Operation(summary = "Find pets",
            description = "Returns the Pets",
            responses = {@ApiResponse(responseCode = "200", description = "Inside Operation Response")})
    @ApiResponse(responseCode = "200", description = "Inside Method Operation")
    public Response getPets() throws NotFoundException {
        return Response.ok().entity(new Pet()).build();
    }
}
