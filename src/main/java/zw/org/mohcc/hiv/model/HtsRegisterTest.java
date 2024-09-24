package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "hts_register_test")
@Data
public class HtsRegisterTest {

    @EmbeddedId
    private HtsRegisterTestPK id;

    @Column(name = "test_kit")
    private String testKit;

    @Column(name = "time_tested")
    private LocalDateTime timeTested;

    @Column(name = "hts_register_test_result")
    private String htsRegisterTestResult;

    @Column(name = "site_id")
    private String siteId;
}

