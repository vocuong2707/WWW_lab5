package com.example.vocuong_20002345.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "city" , length = 150)
    private String city;
    @Column(name = "number" , length = 150)
    private String number;
    @Column(name = "zip_code",length = 150)
    private String zipCode;
    @Column(name = "Street" ,length = 150)
    private String street;
    @Column(name = "country")
    private CountryCode countryCode;




//    @OneToOne(mappedBy = "address")
//    private Candidate candidate;
//    @OneToOne(mappedBy = "address")
//    private company company;

    public address(long id, String city, String number, String zipCode, CountryCode countryCode) {
        this.id = id;
        this.city = city;
        this.number = number;
        this.zipCode = zipCode;
        this.street = street;
        this.countryCode = countryCode;
    }
}
