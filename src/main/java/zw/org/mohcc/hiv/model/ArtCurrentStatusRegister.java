package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_current_status_register")
public class ArtCurrentStatusRegister {

    @EmbeddedId
    private ArtCurrentStatusRegisterPK id;

    @Column(name = "visit_date")
    private LocalDateTime visitDate;

    @Column(name = "adverse_event_status")
    private String adverseEventStatus;

    @Column(name = "reason")
    private String reason;

    @Column(name = "reason_for_regimen_substitution")
    private String reasonForRegimenSubstitution;

    @Column(name = "regimen")
    private String regimen;

    @Column(name = "regimen_from")
    private String regimenFrom;

    @Column(name = "regimen_line_name")
    private String regimenLineName;

    @Column(name = "arv_status")
    private String arvStatus;

    @Column(name = "treatment_failure_reason")
    private String treatmentFailureReason;

    @Column(name = "site_id")
    private String siteId;
}

