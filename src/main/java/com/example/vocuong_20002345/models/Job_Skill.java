package com.example.vocuong_20002345.models;

import com.example.vocuong_20002345.enums.SkillLevels;
import com.example.vocuong_20002345.ids.Job_Skill_Id;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "Job_Skill")
@Getter
@Setter
public class Job_Skill {
    @EmbeddedId
    private Job_Skill_Id id;
    @ManyToOne
    @JoinColumn(name = "job_id",insertable=false, updatable=false)
    private Job job;
    @ManyToOne
    @JoinColumn(name = "skill_id" ,insertable=false, updatable=false)
    private Skill skill;
    @Column(name = "skill_level")
    private SkillLevels skillLevels;
    @Column(name = "moreInfos" , length =  255 , nullable = false)
    private String moreInfos;

    public Job_Skill(Job job, Skill skill, SkillLevels skillLevels, String moreInfos) {
        this.job = job;
        this.skill = skill;
        this.skillLevels = skillLevels;
        this.moreInfos = moreInfos;
    }
}
