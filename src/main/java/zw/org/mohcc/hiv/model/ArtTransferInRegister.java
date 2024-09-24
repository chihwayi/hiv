package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "art_transfer_in_register")
@Data
public class ArtTransferInRegister {

    @EmbeddedId
    private ArtTransferInRegisterPK id;

    @Column(name = "date_of_transfer_in")
    private LocalDateTime dateOfTransferIn;

    @Column(name = "transfer_facility_id")
    private String transferFacilityId;

    @Column(name = "site_id")
    private String siteId;
}

