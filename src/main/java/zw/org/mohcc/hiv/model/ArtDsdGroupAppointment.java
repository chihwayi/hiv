package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_dsd_group_appointment")
public class ArtDsdGroupAppointment {

   @EmbeddedId
   private ArtDsdGroupAppointmentPK id;

    @Column(name = "art_dsd_group_id")
    private String artDsdGroupId;

    @Column(name = "month")
    private int month;

    @Column(name = "reason_id")
    private String reasonId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "visit_date")
    private LocalDateTime visitDate;

    @Column(name = "year")
    private int year;

    @Column(name = "site_id")
    private String siteId;
}

