package Gbancking.ebanking;

import Gbancking.ebanking.entities.*;
import Gbancking.ebanking.enums.AccountStatus;
import Gbancking.ebanking.enums.OperationType;
import Gbancking.ebanking.repositories.AccountOperationRepository;
import Gbancking.ebanking.repositories.BankAccountRepository;
import Gbancking.ebanking.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EbankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankingApplication.class, args);
	}

//	@Bean
//CommandLineRunner start(CustomerRepository customerRepository,BankAccountRepository bankAccountRepository, AccountOperationRepository accountOperationRepository){
//		return args -> {
//
//			Stream.of("Fabrice","Ethane","Owenn","cyrianne","mat").forEach(name->{
//
//				CustomerAddress customerAddress=new CustomerAddress();
//				customerAddress.setVille("Villeville");
//				customerAddress.setProvince("Provinceville");
//				customerAddress.setRue("Rue de la Rue");
//				customerAddress.setCodePostal("12345");
//				customerRepository.save(Customer.builder()
//								.phoneNumber("333")
//								.name(name)
//								.email(name+"gmail.com")
//								.customerAddress(customerAddress).build());
//			});
//				Customer customer=new Customer();
//				CustomerAddress customerAddress=new CustomerAddress();
//
//				customer.setName(name);
//				customer.setPhoneNumber("3333");
//				customer.setEmail(name+"@gmail.com");
//				customerAddress.setVille("Villeville");
//				customerAddress.setProvince("Provinceville");
//				customerAddress.setRue("Rue de la Rue");
//				customerAddress.setCodePostal("12345");
//				customer.setCustomerAddress(customerAddress);
//				customerRepository.save(customer);


//			customerRepository.findAll().forEach(customer -> {
//				//BankAccount bankAccount=new BankAccount();
////				CurrentAccount.builder()
////						.status(AccountStatus.CREATED)
////						.id(UUID.randomUUID().toString())
////						.createdAt(new Date())
////						.balance(1200)
////						.currency("$")
////						.customer(customer)
////						.build()
//				CurrentAccount currentAccount=new CurrentAccount();
//				currentAccount.setOverDraft(120);
//				currentAccount.setId(UUID.randomUUID().toString());
//				currentAccount.setCreatedAt(new Date());
//				currentAccount.setBalance(Math.random()*9000);
//				currentAccount.setCurrency("$");
//				currentAccount.setCustomer(customer);
//				currentAccount.setStatus(AccountStatus.CREATED);
//				bankAccountRepository.save(currentAccount);
//
//
//				SavingAccount savingAccount=new SavingAccount();
//				savingAccount.setInterestRate(120);
//				savingAccount.setId(UUID.randomUUID().toString());
//				savingAccount.setCreatedAt(new Date());
//				savingAccount.setBalance((Math.random()*9000));
//				savingAccount.setCurrency("$");
//				savingAccount.setCustomer(customer);
//				savingAccount.setStatus(AccountStatus.ACTIVATED);
//				bankAccountRepository.save(savingAccount);
//
//			});
//			bankAccountRepository.findAll().forEach(bankAccount ->
//					{
//
//						for (int i = 0; i < 5; i++) {
//							accountOperationRepository.save(AccountOperation.builder()
//									.bankAccount(bankAccount)
//									.amount(Math.random()*1200)
//									.date(new Date())
//									.type(Math.random()>0.5?OperationType.CREDIT:OperationType.DEBIT)
//									.build());
//
//						}
//
//
//
//					}
//
//
//
//
//					);
//			BankAccount bankAccount=bankAccountRepository.findById("2f1678b3-52d4-46b6-bdc1-7b5304692d4a").orElse(null);
//					if (bankAccount!=null){
//		//bankAccount -> {
//						System.out.println(bankAccount.getId());
//						System.out.println(bankAccount.getCustomer().getName());
//						System.out.println(bankAccount.getClass().getSimpleName());
//						if(bankAccount instanceof CurrentAccount)
//							System.out.println(((CurrentAccount) bankAccount).getOverDraft());
//						else if (bankAccount instanceof SavingAccount) {
//							System.out.println(((SavingAccount) bankAccount).getInterestRate());
//						}
//						bankAccount.getBalance();
////						bankAccount.getAccountOperations().forEach(
////								accountOperation -> {
////									System.out.println("========================");
////									System.out.println(accountOperation.getDate());
////									System.out.println(accountOperation.getType());
////									System.out.println(accountOperation.getAmount());
////								}
////						);
////					//}
////			);
//
//		};
//}



  }

