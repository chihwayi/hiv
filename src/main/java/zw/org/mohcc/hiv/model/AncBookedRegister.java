package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "anc_booked_register")
public class AncBookedRegister {

    @EmbeddedId
    private AncBookedRegisterPK id;

    @Column(name = "booked_date")
    private LocalDateTime bookedDate;

    @Column(name = "gestational_age")
    private String gestationalAge;

    @Column(name = "person_id")
    private String personId;

    @Column(name = "trimester")
    private String trimester;

    @Column(name = "site_id")
    private String siteId;
}


