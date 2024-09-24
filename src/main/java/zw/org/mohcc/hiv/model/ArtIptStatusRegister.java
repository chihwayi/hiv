package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_ipt_status_register")
public class ArtIptStatusRegister {

    @EmbeddedId
    private ArtIptStatusRegisterPK id;

    @Column(name = "visit_date")
    private LocalDateTime visitDate;

    @Column(name = "tpt_status")
    private String tptStatus;

    @Column(name = "site_id")
    private String siteId;
}

