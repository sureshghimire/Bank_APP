package com.kubkio.bank.repo;

import com.kubkio.bank.entity.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccountEntity, Long> {

    @Query(value = "select id from profiles where ssn=?1",nativeQuery = true)
        public Long acExists(String username);

}
