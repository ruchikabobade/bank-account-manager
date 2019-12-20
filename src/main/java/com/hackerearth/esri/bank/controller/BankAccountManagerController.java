package com.hackerearth.esri.bank.controller;

import com.hackerearth.esri.bank.model.BankTransactionDetailsResponse;
import com.hackerearth.esri.bank.service.BankAccountManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountManagerController {
    private Logger logger = LoggerFactory.getLogger(BankAccountManagerController.class);

    @Autowired
    private BankAccountManagerService service;

    public BankTransactionDetailsResponse getBankTransactionDetails() {
        return service.getBankTransactionDetails();
    }


}
