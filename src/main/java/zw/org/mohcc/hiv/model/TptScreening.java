package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tpt_screening")
@Data
public class TptScreening {

    @EmbeddedId
    private TptScreeningPK id;

    @Column(name = "completed_ipt_in_the_last_three_years")
    private Boolean completedIptInTheLastThreeYears;

    @Column(name = "eligible")
    private Boolean eligible;

    @Column(name = "heavy_alcohol_use")
    private Boolean heavyAlcoholUse;

    @Column(name = "patient_currently_on_tb_treatment")
    private Boolean patientCurrentlyOnTbTreatment;

    @Column(name = "severe_peripheral_neuropathy")
    private Boolean severePeripheralNeuropathy;

    @Column(name = "sign_and_symptoms_of_active_tb")
    private Boolean signAndSymptomsOfActiveTb;

    @Column(name = "signs_of_active_liver_disease")
    private Boolean signsOfActiveLiverDisease;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "patient_register_id")
    private String patientRegisterId;
}

