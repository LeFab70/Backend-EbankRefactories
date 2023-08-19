package Gbancking.ebanking.entities;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@DiscriminatorValue("CUR")
public class CurrentAccount extends BankAccount{

    private double overDraft;
}
