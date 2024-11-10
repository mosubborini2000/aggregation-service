package org.acme.dto;

import lombok.Data;

@Data
public class AccountResDTO {
    private Long id;
    private String accountNumber;
    private String ownerName;
    private Double balance;
}