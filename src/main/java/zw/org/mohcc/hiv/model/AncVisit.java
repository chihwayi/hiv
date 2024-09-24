package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "anc_visit")
public class AncVisit {

    @EmbeddedId
    private AncVisitPK id;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "art_initiated")
    private String artInitiated;

    @Column(name = "art_number")
    private String artNumber;

    @Column(name = "blood_group_results")
    private String bloodGroupResults;

    @Column(name = "calcium_supplement")
    private Boolean calciumSupplement;

    @Column(name = "cd4drawn")
    private String cd4drawn;

    @Column(name = "cd4result")
    private String cd4result;

    @Column(name = "comments")
    private String comments;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "delivery_plan")
    private String deliveryPlan;

    @Column(name = "first_booking")
    private String firstBooking;

    @Column(name = "glucose_results")
    private String glucoseResults;

    @Column(name = "hb_results")
    private String hbResults;

    @Column(name = "height_of_fundus")
    private String heightOfFundus;

    @Column(name = "history_visit")
    private Boolean historyVisit;

    @Column(name = "hiv_result")
    private String hivResult;

    @Column(name = "iron_supplements")
    private String ironSupplements;

    @Column(name = "iycf_done")
    private String iycfDone;

    @Column(name = "malaria_prophylaxis")
    private String malariaProphylaxis;

    @Column(name = "nutrition_counselling")
    private String nutritionCounselling;

    @Column(name = "pallor")
    private String pallor;

    @Column(name = "partner_hiv_result")
    private String partnerHivResult;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "position")
    private String position;

    @Column(name = "presentation")
    private String presentation;

    @Column(name = "protein_supplement")
    private Boolean proteinSupplement;

    @Column(name = "rh_results")
    private String rhResults;

    @Column(name = "syphilis_result")
    private String syphilisResult;

    @Column(name = "tb_screening")
    private String tbScreening;

    @Column(name = "tetanus_toxiod")
    private String tetanusToxiod;

    @Column(name = "viral_load_result")
    private String viralLoadResult;

    @Column(name = "visit_number")
    private int visitNumber;

    @Column(name = "edd")
    private String edd;

    @Column(name = "no_of_babies")
    private String noOfBabies;

    @Column(name = "scan_result")
    private String scanResult;

    @Column(name = "uss_done")
    private String ussDone;

}

