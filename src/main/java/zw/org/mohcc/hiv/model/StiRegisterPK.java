package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class StiRegisterPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "patientStiId")
    private String patient_sti_id;

    @Column(name = "patientId")
    private String patient_id;
}
