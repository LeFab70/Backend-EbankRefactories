package Gbancking.ebanking.services;

import Gbancking.ebanking.entities.BankAccount;
import Gbancking.ebanking.entities.Customer;

import java.util.List;

public interface BankAccountServices {
  Customer saveCustomer(Customer customer);
    BankAccount saveBankAccount(double initialBalance,String typeOfAccount, Long customerId);
    List<Customer> getAllCustomer();
    BankAccount getBankAccount(String accountId);
    void debit(String accountId,double amount,String description);
     void credit(String accountId,double amount,String description);
    void transfer(String accountIdSource,String accountIdDestination, double amount);
}
