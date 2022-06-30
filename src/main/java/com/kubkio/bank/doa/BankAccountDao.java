package com.kubkio.bank.doa;

import com.kubkio.bank.entity.BankAccountEntity;
import com.kubkio.bank.model.BankAccountModel;
import com.kubkio.bank.repo.BankAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BankAccountDao {

    @Autowired
    BankAccountRepo accountRepo;

    public BankAccountEntity makeNewAcc(BankAccountEntity bankAccountEntity){
        return accountRepo.save(bankAccountEntity);
    }
}
