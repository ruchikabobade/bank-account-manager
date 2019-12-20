package com.hackerearth.esri.bank.repository;

import com.hackerearth.esri.bank.entity.BankTransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountManagerRepository extends JpaRepository<BankTransactionDetails, Integer> {
}
