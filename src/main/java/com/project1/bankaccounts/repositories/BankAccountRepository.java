package com.project1.bankaccounts.repositories;

import com.project1.bankaccounts.models.BankAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends ReactiveMongoRepository<BankAccount, String> {
    
}