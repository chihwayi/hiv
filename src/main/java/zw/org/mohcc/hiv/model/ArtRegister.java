package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_register")
public class ArtRegister {

    @EmbeddedId
    private ArtRegisterPK id;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "art_number")
    private String artNumber;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "central_nervous_system")
    private String centralNervousSystem;

    @Column(name = "consent_to_personal_follow_up")
    private Boolean consentToPersonalFollowUp;

    @Column(name = "cyanosis")
    private Boolean cyanosis;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "date_enrolled")
    private LocalDateTime dateEnrolled;

    @Column(name = "date_of_hiv_test")
    private LocalDateTime dateOfHivTest;

    @Column(name = "enlarged_lymph_node")
    private Boolean enlargedLymphNode;

    @Column(name = "jaundice")
    private Boolean jaundice;

    @Column(name = "mental_status")
    private String mentalStatus;

    @Column(name = "month")
    private int month;

    @Column(name = "pallor")
    private Boolean pallor;

    @Column(name = "sex")
    private String sex;

    @Column(name = "year")
    private int year;

    @Column(name = "art_cohort_number")
    private String artCohortNumber;

    @Column(name = "hpv_test_result")
    private String hpvTestResult;

    @Column(name = "hpv_viac_treatment")
    private String hpvViacTreatment;

    @Column(name = "viac_result")
    private String viacResult;

    @Column(name = "consent_to_personal_tracing")
    private String consentToPersonalTracing;

    @Column(name = "art_initiation_category")
    private String artInitiationCategory;

    @Column(name = "consent_to_index_testing")
    private String consentToIndexTesting;
}

