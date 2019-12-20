package com.hackerearth.esri.bank.controller;

import com.hackerearth.esri.bank.model.BankTransactionDetailsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountManagerController {
    private Logger logger = LoggerFactory.getLogger(BankAccountManagerController.class);

    public BankTransactionDetailsResponse getBankTransactionDetails(){
        return new BankTransactionDetailsResponse();
    }


}
