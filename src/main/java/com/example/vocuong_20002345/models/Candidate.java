package com.example.vocuong_20002345.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Candidate")
public class Candidate {
    @Id
    private long id;
    @Column(name = "phone" , length = 50 , nullable = false)
    private String phone;
    @Column(name = "email" , length = 150 , nullable = false)
    private String email;
    @Column(name = "full_name" , length = 150)
    private String fullName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id" , referencedColumnName = "id")
    private address address;
    @Column(name = "dob" , nullable = false)
    private LocalDate dob;

    @OneToMany(mappedBy = "candidate" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkills;

}
