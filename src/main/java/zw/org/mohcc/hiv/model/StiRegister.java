package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "sti_register")
public class StiRegister {

    @EmbeddedId
    private StiRegisterPK stiRegisterPK;

    @Column(name = "comments")
    private String comments;

    @Column(name = "condom_information_given")
    private Boolean condomInformationGiven;

    @Column(name = "condoms_issued")
    private Boolean condomsIssued;

    @Column(name = "consent_to_list_contacts")
    private Boolean consentToListContacts;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "hiv_test_result")
    private String hivTestResult;

    @Column(name = "medicines")
    private String medicines;

    @Column(name = "month")
    private Integer month;

    @Column(name = "person_id")
    private String personId;

    @Column(name = "purpose_of_syphilis_testing")
    private String purposeOfSyphilisTesting;

    @Column(name = "recent_sexual_exposure")
    private Boolean recentSexualExposure;

    @Column(name = "repeat_sti")
    private Boolean repeatSti;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "slips_issued")
    private Boolean slipsIssued;

    @Column(name = "slips_received")
    private Boolean slipsReceived;

    @Column(name = "sti_syndrome")
    private String stiSyndrome;

    @Column(name = "syphilis_test_result")
    private String syphilisTestResult;

    @Column(name = "tested_for_hiv")
    private Boolean testedForHiv;

    @Column(name = "tested_for_syphilis")
    private Boolean testedForSyphilis;

    @Column(name = "year")
    private Integer year;

    @Column(name = "outcome")
    private String outcome;

    @Column(name = "client_profile")
    private String clientProfile;

    @Column(name = "client_type")
    private String clientType;

    @Column(name = "partner_type")
    private String partnerType;

    @Column(name = "sti_number")
    private String stiNumber;

    @Column(name = "contact")
    private Boolean contact;
}
