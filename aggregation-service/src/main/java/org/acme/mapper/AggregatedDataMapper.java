package org.acme.mapper;
import org.acme.dto.AccountResDTO;
import org.acme.dto.TransactionDTO;
import org.acme.dto.AggregatedDataDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface AggregatedDataMapper {

    @Mapping(source = "account.accountNumber", target = "accountNumber")
    @Mapping(source = "account.ownerName", target = "owner")
    @Mapping(source = "transaction.amount", target = "transactionAmount")
    AggregatedDataDTO toAggregatedData(AccountResDTO account, TransactionDTO transaction);
}
