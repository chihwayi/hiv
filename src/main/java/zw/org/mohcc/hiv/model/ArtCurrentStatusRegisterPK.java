package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class ArtCurrentStatusRegisterPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "art_status_id")
    private String artStatusId;

    @Column(name = "art_id")
    private String artId;
}