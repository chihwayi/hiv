package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "art_appointment")
@Data
public class ArtAppointment {

    @EmbeddedId
    private ArtAppointmentPK id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "appointment_outcome_id")
    private String appointmentOutcomeId;

    @Column(name = "appointment_outcome")
    private String appointmentOutcome;

    @Column(name = "appointment_outcome_date")
    private LocalDateTime appointmentOutcomeDate;

    @Column(name = "followup_date")
    private LocalDateTime followupDate;

    @Column(name = "followup_reason_id")
    private String followupReasonId;

    @Column(name = "followup_reason")
    private String followupReason;

    @Column(name = "month")
    private int month;

    @Column(name = "reason_id")
    private String reasonId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "year")
    private int year;

    @Column(name = "date_appointment_given")
    private LocalDateTime dateAppointmentGiven;

    @Column(name = "name_of_cbw")
    private String nameOfCbw;

    @Column(name = "name_of_hcw")
    private String nameOfHcw;

    @Column(name = "reason_for_defaulting")
    private String reasonForDefaulting;

    @Column(name = "site_id")
    private String siteId;
}


