package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "art_dsd_group")
public class ArtDsdGroup {

    @EmbeddedId
    private ArtDsdGroupPK id;

    @Column(name = "club_number")
    private String clubNumber;

    @Column(name = "dsd_model_id")
    private String dsdModelId;

    @Column(name = "dsd_model")
    private String dsdModel;

    @Column(name = "month")
    private int month;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "site_id")
    private String siteId;
}

