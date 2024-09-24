package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "cbs")
@Data
public class Cbs {

    @EmbeddedId
    private CbsPK id;

    @Column(name = "result")
    private String result;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @Column(name = "art_reason_not_initiated")
    private String artReasonNotInitiated;

    @Column(name = "art_regimen")
    private String artRegimen;

    @Column(name = "art_regimen_monther")
    private String artRegimenMonther;

    @Column(name = "art_status_mother")
    private String artStatusMother;

    @Column(name = "been_incarcerated_into_jail")
    private String beenIncarceratedIntoJail;

    @Column(name = "biological_mother_alive")
    private Boolean biologicalMotherAlive;

    @Column(name = "birth_defect")
    private String birthDefect;

    @Column(name = "birth_weight")
    private int birthWeight;

    @Column(name = "breast_feeding")
    private Boolean breastFeeding;

    @Column(name = "cbs_id")
    private String cbsId;

    @Column(name = "cd4at_notification")
    private String cd4atNotification;

    @Column(name = "cd4count")
    private int cd4count;

    @Column(name = "contact_of_index_case")
    private String contactOfIndexCase;

    @Column(name = "currently_breastfeeding_infant")
    private Boolean currentlyBreastfeedingInfant;

    @Column(name = "currently_on_art")
    private String currentlyOnArt;

    @Column(name = "date_of_diagnosis")
    private LocalDateTime dateOfDiagnosis;

    @Column(name = "date_of_initiation")
    private LocalDateTime dateOfInitiation;

    @Column(name = "date_of_most_recent_hiv_result")
    private LocalDateTime dateOfMostRecentHivResult;

    @Column(name = "delivered_by")
    private String deliveredBy;

    @Column(name = "education")
    private String education;

    @Column(name = "ever_been_on_arvart_excluding_prep")
    private String everBeenOnArvartExcludingPrep;

    @Column(name = "exclusive_breast_feeding_duration")
    private String exclusiveBreastFeedingDuration;

    @Column(name = "gender")
    private String gender;

    @Column(name = "gender_at_birth")
    private String genderAtBirth;

    @Column(name = "gestation")
    private int gestation;

    @Column(name = "gestation_atbooking")
    private int gestationAtBooking;

    @Column(name = "had_sex_for_money_or_goods")
    private String hadSexForMoneyOrGoods;

    @Column(name = "had_sex_with_female")
    private String hadSexWithFemale;

    @Column(name = "had_sex_with_male")
    private String hadSexWithMale;

    @Column(name = "have_you_ever_been_on_prep")
    private String haveYouEverBeenOnPrep;

    @Column(name = "highest_level_of_education")
    private String highestLevelOfEducation;

    @Column(name = "history_of_an_sti")
    private String historyOfAnSti;

    @Column(name = "index_case_hts_number")
    private String indexCaseHtsNumber;

    @Column(name = "initiated_art")
    private String initiatedArt;

    @Column(name = "injected_recreational_drugs")
    private String injectedRecreationalDrugs;

    @Column(name = "investigation_id")
    private String investigationId;

    @Column(name = "investigation_order_id")
    private String investigationOrderId;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "not_pregnant_orbreastfeeding")
    private Boolean notPregnantOrBreastfeeding;

    @Column(name = "number_of_anc_visits")
    private int numberOfAncVisits;

    @Column(name = "offline")
    private Boolean offline;

    @Column(name = "parity_at_booking")
    private int parityAtBooking;

    @Column(name = "place_of_delivery")
    private String placeOfDelivery;

    @Column(name = "pregnant")
    private Boolean pregnant;

    @Column(name = "prophylaxis")
    private String prophylaxis;

    @Column(name = "rapid_reason_not_done")
    private String rapidReasonNotDone;

    @Column(name = "rapid_test_for_recent_infection_done")
    private String rapidTestForRecentInfectionDone;

    @Column(name = "received_blood_transfusion")
    private String receivedBloodTransfusion;

    @Column(name = "received_medical_injections")
    private String receivedMedicalInjections;

    @Column(name = "religion")
    private String religion;

    @Column(name = "self_identified_gender")
    private String selfIdentifiedGender;

    @Column(name = "sexually_active")
    private String sexuallyActive;

    @Column(name = "specify_gestation_atdelivery")
    private int specifyGestationAtDelivery;

    @Column(name = "submitted")
    private Boolean submitted;

    @Column(name = "tattoed_with_unsterilised")
    private String tattoedWithUnsterilised;

    @Column(name = "test_one_method")
    private String testOneMethod;

    @Column(name = "test_one_result")
    private String testOneResult;

    @Column(name = "test_three_method")
    private String testThreeMethod;

    @Column(name = "test_three_result")
    private String testThreeResult;

    @Column(name = "test_two_method")
    private String testTwoMethod;

    @Column(name = "test_two_result")
    private String testTwoResult;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "timing_of_hiv_diagnosis")
    private LocalDateTime timingOfHivDiagnosis;

    @Column(name = "type_of_delivery")
    private String typeOfDelivery;

    @Column(name = "unprotected_sex")
    private String unprotectedSex;

    @Column(name = "victim_suspected_victim_of_sexual_abuse")
    private String victimSuspectedVictimOfSexualAbuse;

    @Column(name = "who_clinical_stage_at_notification")
    private String whoClinicalStageAtNotification;
}

