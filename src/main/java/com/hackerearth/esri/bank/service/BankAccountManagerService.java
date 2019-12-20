package com.hackerearth.esri.bank.service;

import com.hackerearth.esri.bank.model.BankTransactionDetailsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccountManagerService {

    private Logger logger = LoggerFactory.getLogger(BankAccountManagerService.class);

    public BankTransactionDetailsResponse getBankTransactionDetails(){
        return new BankTransactionDetailsResponse();
    }
}
