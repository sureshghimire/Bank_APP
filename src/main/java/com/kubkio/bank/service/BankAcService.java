package com.kubkio.bank.service;

import com.kubkio.bank.doa.BankAccountDao;
import com.kubkio.bank.entity.BankAccountEntity;
import com.kubkio.bank.entity.ProfileEntity;
import com.kubkio.bank.mapper.AcMapper;
import com.kubkio.bank.model.AccountType;
import com.kubkio.bank.model.BankAccountModel;
import com.kubkio.bank.repo.BankAccountRepo;
import com.kubkio.bank.repo.ProfileRepo;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAcService implements BankAccountServiceIf{

    @Autowired
   BankAccountRepo acRepo;
   ProfileRepo profileRepo;

   @Autowired
   BankAccountDao acDao;


   private boolean checkAcExists(String ssn){
      Long existId = acRepo.acExists(ssn);
      if(existId!=null)
          return true;
      return false;
   }



    @Override
    public BankAccountModel createBankAc(BankAccountModel model){
       if(!(checkAcExists(model.getAccountSSN()))){
           return new BankAccountModel("Account with ssn"+model.getAccountSSN()+"does not exists");
       }else {
           BankAccountModel model2save = new BankAccountModel();
           model2save.setAccountSSN(model.getAccountSSN());
           model2save.setAccountType(model.getAccountType());

           //Map to entity
           BankAccountEntity entity2save = AcMapper.accountMap(model2save);
           acDao.makeNewAcc(entity2save);
           return model2save;
       }

    }

}
