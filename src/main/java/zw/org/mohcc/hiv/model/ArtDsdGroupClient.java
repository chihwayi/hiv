package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_dsd_group_client")
public class ArtDsdGroupClient {

    @EmbeddedId
    private ArtDsdGroupClientPK id;

    @Column(name = "date_joined")
    private LocalDateTime dateJoined;

    @Column(name = "date_left")
    private LocalDateTime dateLeft;

    @Column(name = "member_number")
    private String memberNumber;

    @Column(name = "reason_for_leaving")
    private String reasonForLeaving;

    @Column(name = "art_dsd_grp_report_id")
    private String artDsdGrpReportId;

    @Column(name = "art_register_id")
    private String artRegisterId;

    @Column(name = "person_demograhic_id")
    private String personDemographicId;

    @Column(name = "site_id")
    private String siteId;
}

