// AggregatedDataDTO.java
package org.acme.dto;

import lombok.Data;

@Data
public class AggregatedDataDTO {
    private String accountNumber;
    private String owner;
    private Double transactionAmount;
}
