package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "anc_register")
@Data
public class AncRegister {

    @EmbeddedId
    private AncRegisterPK id;

    @Column(name = "registered_date")
    private LocalDateTime registeredDate;

    @Column(name = "site_id")
    private String siteId;

    @Column(name = "anc_number")
    private String ancNumber;

    @Column(name = "art_initiated")
    private String artInitiated;

    @Column(name = "art_number")
    private String artNumber;

    @Column(name = "edd")
    private LocalDateTime edd;

    @Column(name = "hiv_status")
    private String hivStatus;

    @Column(name = "lnmp")
    private LocalDateTime lnmp;

}

