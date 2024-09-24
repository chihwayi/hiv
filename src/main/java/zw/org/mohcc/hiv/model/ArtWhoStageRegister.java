package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "art_who_stage_register")
@Data
public class ArtWhoStageRegister {


    @EmbeddedId
    private ArtWhoStageRegisterPK id;

    @Column(name = "visit_date")
    private LocalDateTime visitDate;

    @Column(name = "follow_up_status_at_who_stage")
    private String followUpStatusAtWhoStage;

    @Column(name = "who_stage")
    private String whoStage;

    @Column(name = "site_id")
    private String siteId;
}

