package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@Data
public class ArtDsdGroupAppointmentPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "id")
    private String id;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;
}
