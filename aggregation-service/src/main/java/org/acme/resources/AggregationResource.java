package org.acme.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.dto.AggregatedDataDTO;
import org.acme.service.AggregationService;

@Path("/aggregated")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AggregationResource {

    @Inject
    AggregationService aggregationService;

    @GET
    @Path("/{accountNumber}/{transactionId}")
    public AggregatedDataDTO getAggregatedData(@PathParam("accountNumber") String accountNumber, 
                                               @PathParam("transactionId") Long transactionId) {
        return aggregationService.getAggregatedData(accountNumber, transactionId);
    }
}
