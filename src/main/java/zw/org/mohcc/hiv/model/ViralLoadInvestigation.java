package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "viral_load_investigation")
@Data
public class ViralLoadInvestigation {

    @EmbeddedId
    private ViralLoadInvestigationPK id;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "investigation_id")
    private String investigationId;

    @Column(name = "investigation_type")
    private String investigationType;

    @Column(name = "month")
    private int month;

    @Column(name = "note")
    private String note;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "person_id")
    private String personId;

    @Column(name = "result")
    private String result;

    @Column(name = "result_date")
    private LocalDateTime resultDate;

    @Column(name = "result_issued")
    private Boolean resultIssued;

    @Column(name = "sample_id")
    private String sampleId;

    @Column(name = "sample")
    private String sample;

    @Column(name = "sex")
    private String sex;

    @Column(name = "status")
    private String status;

    @Column(name = "test_id")
    private String testId;

    @Column(name = "test")
    private String test;

    @Column(name = "year")
    private int year;

    @Column(name = "reason")
    private String reason;

    @Column(name = "test_reason")
    private String testReason;

    @Column(name = "site_id")
    private String siteId;
}

