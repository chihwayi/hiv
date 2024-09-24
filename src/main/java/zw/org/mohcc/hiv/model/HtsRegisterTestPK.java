package zw.org.mohcc.hiv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
public class HtsRegisterTestPK implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    @Column(name = "order_test_id")
    private String orderTestId;

    @Column(name = "hts_id")
    private String htsId;
}
