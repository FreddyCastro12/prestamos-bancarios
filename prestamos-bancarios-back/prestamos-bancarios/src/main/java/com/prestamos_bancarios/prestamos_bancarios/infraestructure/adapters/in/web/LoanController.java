package com.prestamos_bancarios.prestamos_bancarios.infraestructure.adapters.in.web;

import com.prestamos_bancarios.prestamos_bancarios.domain.models.Loan;
import com.prestamos_bancarios.prestamos_bancarios.domain.ports.in.LoanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class LoanController {
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/prestamo")
    public Loan requestLoan(@RequestBody Loan loan) {
        return loanService.requestLoan(loan);
    }

    @GetMapping
    public List<Loan> findAll() {
        return loanService.findAll();
    }

    @GetMapping("/usuario/{userId}")
    public List<Loan> findAllByUser(@PathVariable Long userId) {
        return loanService.findAllByUserId(userId);
    }

    @GetMapping("/{id}")
    public Loan findById(@PathVariable Long id) {
        return loanService.findById(id);
    }

    @PutMapping("/aprobar/{id}")
    public Loan approveLoan(@PathVariable Long id) {
        return loanService.approveLoan(id);
    }

    @PutMapping("/rechazar/{id}")
    public Loan rejectLoan(@PathVariable Long id) {
        return loanService.rejectLoan(id);
    }
}
