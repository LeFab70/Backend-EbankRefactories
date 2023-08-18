package Gbancking.ebanking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class CustomerAddress {
    @Column(length = 70)
    private String ville;
    @Column(length = 70)
    private String province;
    @Column(length = 70)
    private String rue;
    @Column(length = 70)
    private String codePostal;
}
