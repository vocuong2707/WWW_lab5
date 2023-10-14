package com.example.vocuong_20002345.models;

import com.example.vocuong_20002345.ids.Job_Skill_Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Job")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name" , length = 250 , nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private company company;
    @Column(name = "description" , length = 250 , nullable = false)
    private String decscription;
    @OneToMany(mappedBy = "job" , cascade = CascadeType.ALL)
    private List<Job_Skill> jobSkill;
}
