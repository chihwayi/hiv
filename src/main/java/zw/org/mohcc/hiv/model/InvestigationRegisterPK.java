package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class InvestigationRegisterPK  implements Serializable{

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "laboratory_investigation_id", nullable = false)
    private String laboratoryInvestigationId;

    @Column(name = "site_id", nullable = false)
    private String siteId;
}
