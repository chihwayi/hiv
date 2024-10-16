package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "investigation_register")
public class InvestigationRegister {

    @EmbeddedId
    private InvestigationRegisterPK investigationRegisterPK;

    @Column(name = "date")
    private Date date;

    @Column(name = "investigation_id")
    private String investigationId;

    @Column(name = "investigation_type")
    private String investigationType;

    @Column(name = "month")
    private Integer month;

    @Column(name = "note")
    private String note;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "person_id")
    private String personId;

    @Column(name = "result")
    private String result;

    @Column(name = "result_date")
    private Date resultDate;

    @Column(name = "result_issued")
    private Boolean resultIssued;

    @Column(name = "sample_id")
    private String sampleId;

    @Column(name = "sample")
    private String sample;

    @Column(name = "status")
    private String status;

    @Column(name = "test_id")
    private String testId;

    @Column(name = "test")
    private String test;

    @Column(name = "year")
    private Integer year;

    @Column(name = "date_result_issued")
    private Date dateResultIssued;

    @Column(name = "facility_id")
    private String facilityId;

    @Column(name = "facility_name")
    private String facilityName;
}
