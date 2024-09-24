package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "hts_screening_register")
@Data
public class HtsScreeningRegister {

    @EmbeddedId
    private HtsScreeningRegisterPK id;

    @Column(name = "art")
    private Boolean art;

    @Column(name = "art_number")
    private String artNumber;

    @Column(name = "been_on_prep")
    private Boolean beenOnPrep;

    @Column(name = "cd4done")
    private String cd4done;

    @Column(name = "date_last_tested")
    private LocalDateTime dateLastTested;

    @Column(name = "prep_option")
    private String prepOption;

    @Column(name = "result")
    private String result;

    @Column(name = "tested_before")
    private Boolean testedBefore;

    @Column(name = "viral_load_done")
    private String viralLoadDone;

    @Column(name = "hts_screening_result")
    private String htsScreeningResult;

    @Column(name = "site_id")
    private String siteId;
}

