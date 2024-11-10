package org.acme.dto;

import lombok.Data;

@Data
public class TransactionDTO {
    private Long id;
    private String fromAccount;
    private String toAccount;
    private Double amount;
}