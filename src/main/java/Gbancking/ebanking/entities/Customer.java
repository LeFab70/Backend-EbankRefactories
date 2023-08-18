package Gbancking.ebanking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Customer {
    @Id
    private String id;
    @Column(length = 100,nullable = false)
    private String name;
    @Column(length = 70,nullable = false)
    private String email;
    @Column(length = 100,nullable = false)
    private CustomerAddress customerAddress;
    @Column(length = 20,nullable = false)
    private String phoneNumber;
    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;
}
