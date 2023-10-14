package com.example.vocuong_20002345.ids;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Candidate_Skill_Id implements Serializable {
    private long can_id;
    private long skill_id;
}
