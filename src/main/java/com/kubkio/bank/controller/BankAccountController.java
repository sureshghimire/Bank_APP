package com.kubkio.bank.controller;

import com.kubkio.bank.entity.BankAccountEntity;
import com.kubkio.bank.model.AccountType;
import com.kubkio.bank.model.BankAccountModel;
import com.kubkio.bank.service.BankAcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class BankAccountController {

    @Autowired
    BankAcService service;

    @RequestMapping(value = "/createBankAc", method = RequestMethod.POST)
    public BankAccountModel signUpBankAc(@RequestBody BankAccountModel bankAccountModel){
        return service.createBankAc(bankAccountModel);
    }


}
