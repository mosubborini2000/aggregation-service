// AccountServiceClient.java
package org.acme.service;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.dto.AccountResDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8081/accounts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AccountServiceClient {

    @GET
    @Path("/account/{accountNumber}")
    AccountResDTO getAccountByAccountNumber(@PathParam("accountNumber") String accountNumber);
}
