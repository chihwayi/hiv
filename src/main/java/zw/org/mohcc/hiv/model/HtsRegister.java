package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "hts_register")
@Data
public class HtsRegister {

    @EmbeddedId
    private HtsRegisterPK id;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "already_on_art")
    private Boolean alreadyOnArt;

    @Column(name = "already_positive")
    private Boolean alreadyPositive;

    @Column(name = "approach")
    private String approach;

    @Column(name = "client_profile")
    private String clientProfile;

    @Column(name = "couple")
    private Boolean couple;

    @Column(name = "date")
    private String date;

    @Column(name = "group_education")
    private Boolean groupEducation;

    @Column(name = "htc_model")
    private String htcModel;

    @Column(name = "hts_model_sub_type")
    private String htsModelSubType;

    @Column(name = "lactating")
    private Boolean lactating;

    @Column(name = "opt")
    private Boolean opt;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "person_id")
    private String personId;

    @Column(name = "post_test_counselling")
    private Boolean postTestCounselling;

    @Column(name = "pre_test_counselling")
    private Boolean preTestCounselling;

    @Column(name = "pregnancytest")
    private String pregnancyTest;

    @Column(name = "pregnant")
    private Boolean pregnant;

    @Column(name = "rbf_number")
    private String rbfNumber;

    @Column(name = "reason_for_not_initiating_art")
    private String reasonForNotInitiatingArt;

    @Column(name = "reason_for_not_issuing_result")
    private String reasonForNotIssuingResult;

    @Column(name = "reason_for_not_performing_test")
    private String reasonForNotPerformingTest;

    @Column(name = "refered_service")
    private String referredService;

    @Column(name = "result")
    private String result;

    @Column(name = "results_issued")
    private Boolean resultsIssued;

    @Column(name = "retest")
    private Boolean retest;

    @Column(name = "test_purpose")
    private String testPurpose;

    @Column(name = "test_type")
    private String testType;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "partner_person_id")
    private String partnerPersonId;

    @Column(name = "laboratory_investigation_id")
    private String laboratoryInvestigationId;

    @Column(name = "client_assisted_self_test")
    private Boolean clientAssistedSelfTest;

    @Column(name = "client_tested_on_site")
    private Boolean clientTestedOnSite;

    @Column(name = "linkages")
    private String linkages;

    @Column(name = "consent_to_index_testing")
    private String consentToIndexTesting;

    @Column(name = "hts_number")
    private String htsNumber;

    @Column(name = "is_index_contact")
    private String isIndexContact;

    @Column(name = "logged_in_user")
    private String loggedInUser;

    @Column(name = "care_giver_result_date")
    private String careGiverResultDate;

    @Column(name = "client_disclosed_result")
    private String clientDisclosedResult;

    @Column(name = "note")
    private String note;

    @Column(name = "test_kit_distributor")
    private String testKitDistributor;
}

