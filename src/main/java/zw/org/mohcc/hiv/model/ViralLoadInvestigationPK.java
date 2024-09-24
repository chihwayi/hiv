package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ViralLoadInvestigationPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "laboratory_investigation_id")
    private String laboratoryInvestigationId;

    @Column(name = "date")
    private LocalDateTime date;
}
