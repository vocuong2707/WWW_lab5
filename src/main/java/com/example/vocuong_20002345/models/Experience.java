package com.example.vocuong_20002345.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "Experience")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    @Id
    private long id;
    @Column(name = "to_date" , nullable = false)
    private LocalDate toDate;
    @Column(name = "from_date" , nullable = false)
    private LocalDate fromDate;
    @Column(name = "company_name",length = 150, nullable = false)
    private String companyName;
    @Column(name = "role",length = 150, nullable = false)
    private String role;
    @Column(name = "work_desciption",length = 150, nullable = false)
    private String workDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    private Candidate candidate;



}
