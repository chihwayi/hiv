package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class AncRegisterPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "anc_id")
    private String ancId;

    @Column(name = "person_id")
    private String personId;
}
