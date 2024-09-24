package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "prep_register")
public class PrepRegister {

    @EmbeddedId
    private PrepRegisterPK prepRegisterPK;

    @Column(name = "client_agree_prep_initiation")
    private Boolean clientAgreePrepInitiation;

    @Column(name = "client_eligible_or_offered_prep")
    private Boolean clientEligibleOrOfferedPrep;

    @Column(name = "client_first_initiation_this_year")
    private Boolean clientFirstInitiationThisYear;

    @Column(name = "client_profile")
    private String clientProfile;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "date_testedhiv")
    private LocalDateTime dateTestedHiv;

    @Column(name = "hiv_test_result")
    private String hivTestResult;

    @Column(name = "initiation_date")
    private LocalDateTime initiationDate;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "prep_number")
    private String prepNumber;

    @Column(name = "purpose_of_prep")
    private String purposeOfPrep;

    @Column(name = "risk_assessment_done")
    private Boolean riskAssessmentDone;

    @Column(name = "risk_assessment_outcome")
    private String riskAssessmentOutcome;

    @Column(name = "withdrawal_date")
    private LocalDateTime withdrawalDate;

    @Column(name = "client_eligible_for_prep")
    private Boolean clientEligibleForPrep;

    @Column(name = "client_first_time_on_prep")
    private Boolean clientFirstTimeOnPrep;

    @Column(name = "client_offered_prep")
    private Boolean clientOfferedPrep;

    @Column(name = "consent_date")
    private LocalDateTime consentDate;

    @Column(name = "last_date_of_taking_prep")
    private LocalDateTime lastDateOfTakingPrep;

    @Column(name = "prep_type")
    private String prepType;

    @Column(name = "reason_for_not_taking_prep_id")
    private String reasonForNotTakingPrepId;

    @Column(name = "withdrawal_reason")
    private String withdrawalReason;

    @Column(name = "previous_prep_initiation_date")
    private LocalDateTime previousPrepInitiationDate;

    @Column(name = "is_sero_conversion")
    private Boolean isSeroConversion;

    @Column(name = "result")
    private String result;

    @Column(name = "sero_conversion_date")
    private LocalDateTime seroConversionDate;
}
