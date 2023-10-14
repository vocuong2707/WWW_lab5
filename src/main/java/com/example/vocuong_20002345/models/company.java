package com.example.vocuong_20002345.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "com_id" , length = 255)
    private long id;
    @Column(name = "about" , length = 255)
    private String about;
    @Column(name = "comp_name" , length = 255 , nullable = false)
    private String compName;
    @Column(name = "email" , length = 255 , nullable = false)
    private String email;
    @Column(name = "phone" , length = 255 , nullable = false)
    private String phone;
    @Column(name = "web_url" , length = 255 , nullable = false)
    private String webUrl;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id" , referencedColumnName = "id")
    private address address;
    @Column(name = "Jobs")
    @OneToMany(mappedBy = "company" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Job> listJob;

}
