// AggregationService.java
package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.dto.AccountResDTO;
import org.acme.dto.TransactionDTO;
import org.acme.dto.AggregatedDataDTO;
import org.acme.mapper.AggregatedDataMapper;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class AggregationService {

    @Inject
    @RestClient
    AccountServiceClient accountServiceClient;

    @Inject
    @RestClient
    TransactionServiceClient transactionServiceClient;

    @Inject
    AggregatedDataMapper mapper;

    public AggregatedDataDTO getAggregatedData(String accountNumber, Long transactionId) {
        AccountResDTO account = accountServiceClient.getAccountByAccountNumber(accountNumber);
        TransactionDTO transaction = transactionServiceClient.getTransactionById(transactionId);
        return mapper.toAggregatedData(account, transaction);
    }
}
