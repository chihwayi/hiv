package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "hiv_positive_person")
@Data
public class HivPositivePerson {

    @EmbeddedId
    private HivPositivePersonPK id;

    @Column(name = "visit_date")
    private LocalDateTime visitDate;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "investigation_id")
    private String investigationId;

    @Column(name = "month")
    private int month;

    @Column(name = "result")
    private String result;

    @Column(name = "result_date")
    private LocalDateTime resultDate;

    @Column(name = "sex")
    private String sex;

    @Column(name = "status")
    private String status;

    @Column(name = "year")
    private int year;

    @Column(name = "hiv_positive_test_result")
    private String hivPositiveTestResult;

    @Column(name = "site_id")
    private String siteId;
}

