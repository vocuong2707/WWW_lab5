package com.example.vocuong_20002345.ids;

import com.example.vocuong_20002345.models.Job;
import com.example.vocuong_20002345.models.Skill;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
@EqualsAndHashCode
public class Job_Skill_Id implements Serializable {
    private static final long serialVerUID = 1;

    private long job_id;

    private long skill_id;
}
