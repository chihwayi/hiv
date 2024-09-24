package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Embeddable
public class ArtAppointmentPK  implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "art_appointment_register_id")
    private String artAppointmentRegisterId;

    @Column(name = "art_id")
    private String artId;

}
