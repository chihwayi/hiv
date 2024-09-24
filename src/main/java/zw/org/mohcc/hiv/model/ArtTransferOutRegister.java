package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "art_transfer_out_register")
@Data
public class ArtTransferOutRegister {

    @EmbeddedId
    private ArtTransferOutRegisterPK id;

    @Column(name = "transfer_out_date")
    private LocalDateTime transferOutDate;

    @Column(name = "transfer_facility_id")
    private String transferFacilityId;

    @Column(name = "transfer_reason")
    private String transferReason;

    @Column(name = "site_id")
    private String siteId;
}

