package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_visit_register")
public class ArtVisitRegister {

    @EmbeddedId
    private ArtVisitRegisterPK id;

    @Column(name = "visit_date")
    private LocalDateTime visitDate;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "art_id")
    private String artId;

    @Column(name = "visit_status")
    private String visitStatus;

    @Column(name = "visit_type")
    private String visitType;

    @Column(name = "functional_status")
    private String functionalStatus;

    @Column(name = "family_planning_status")
    private String familyPlanningStatus;

    @Column(name = "lactating_status")
    private String lactatingStatus;
}

