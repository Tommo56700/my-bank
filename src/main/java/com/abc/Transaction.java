package com.abc;

import java.time.LocalDate;

public class Transaction {
	
    private final double amount;

    private LocalDate transactionDate;

    public Transaction(double amount) {
        this.amount = amount;
        this.transactionDate = LocalDate.now();
    }
    
    public Transaction(double amount, LocalDate date) {
        this.amount = amount;
        this.transactionDate = date;
    }

	public double getAmount() {
		return amount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}
 
}
