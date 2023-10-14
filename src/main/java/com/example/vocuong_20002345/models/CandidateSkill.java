package com.example.vocuong_20002345.models;


import com.example.vocuong_20002345.enums.SkillLevels;
import com.example.vocuong_20002345.ids.Candidate_Skill_Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CandidateSkill")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CandidateSkill {
    @EmbeddedId
    private Candidate_Skill_Id id;
    @Column(name = "skill_level" , nullable = false)
    private SkillLevels skillLevel;
    @Column(name = "more_infor" , length = 255 , nullable = false)
    private String moreInfor;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @ManyToOne()
    @JoinColumn(name = "skill_id",insertable = false , updatable = false)
    private Skill skill;
}
