package com.prestamos_bancarios.prestamos_bancarios.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    private Long id;
    private Long userId;
    private BigDecimal amount;
    private int termMonths;
    private LoanStatus status;
    private LocalDateTime requestDate;
}
