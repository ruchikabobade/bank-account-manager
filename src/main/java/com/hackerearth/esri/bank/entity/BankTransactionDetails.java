package com.hackerearth.esri.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "BANK_TRANSACTION_DETAILS")
public class BankTransactionDetails {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber = "";

    @Column(name = "DATE")
    private String date = "";

    @Column(name = "TRANSACTION_DETAILS")
    private String transactionDetails = "";

    @Column(name = "VALUE_DATE")
    private String valueDate = "";

    @Column(name = "WITHDRAWAL_AMOUNT")
    private String withdrawalAmount = "";

    @Column(name = "DEPOSITE_AMOUNT")
    private String depositeAmount = "";

    @Column(name = "BALANCE_AMOUNT")
    private String balanceAmount = "";
}
