package com.kubkio.bank.service;

import com.kubkio.bank.entity.BankAccountEntity;
import com.kubkio.bank.model.AccountType;
import com.kubkio.bank.model.BankAccountModel;
import com.kubkio.bank.model.ProfileModel;

public interface BankAccountServiceIf {

    //create bank account using existing profile
    public BankAccountModel createBankAc(BankAccountModel model);

    
}
