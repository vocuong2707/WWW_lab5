package com.example.vocuong_20002345.models;

import com.example.vocuong_20002345.enums.SkillLevels;
import com.example.vocuong_20002345.enums.SkillTypes;
import com.example.vocuong_20002345.ids.Job_Skill_Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Skill")
public class Skill {
    @Id
    private long id;
    @Enumerated(EnumType.ORDINAL)
    private SkillTypes types;
    @Column(name = "skill_name" , length = 150 , nullable = false)
    private String skillName;
    @Enumerated(EnumType.ORDINAL)
    private SkillLevels skillLevels;
    @Column(name = "skill_description" , length = 150 , nullable = false)
    private String skillDescription;

    @Column(name = "job_skills")
    @OneToMany(mappedBy = "skill")
    private List<Job_Skill> jobSkills;


    @OneToMany(mappedBy = "skill")
    private List<CandidateSkill> candidateSkills;
}
