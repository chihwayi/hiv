package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class ArtDsdGroupClientPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "art_dsd_group_id")
    private String artDsdGroupId;

    @Column(name = "art_id")
    private String artId;
}
