package zw.org.mohcc.hiv.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "facility")
@Data
public class Facility {
    @Id
    @Column(name = "site_id", length = 255, nullable = false)
    private String site_id;

    @Column(name = "district_id", length = 255, nullable = true)
    private String districtId;

    @Column(name = "province_id", length = 255, nullable = true)
    private String provinceId;

    @Column(name = "longitude", length = 255, nullable = true)
    private String longitude;

    @Column(name = "latitude", length = 255, nullable = true)
    private String latitude;

    @Column(name = "impilo_code", length = 255, nullable = true)
    private String impiloCode;

    @Column(name = "dhis_code", length = 255, nullable = true)
    private String dhisCode;

    @Column(name = "facility_name", length = 255, nullable = true)
    private String facilityName;

    @Column(name = "district_name", length = 255, nullable = true)
    private String districtName;

    @Column(name = "province_name", length = 255, nullable = true)
    private String provinceName;

}
