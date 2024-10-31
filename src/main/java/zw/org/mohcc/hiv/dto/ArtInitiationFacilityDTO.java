package zw.org.mohcc.hiv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Data
@AllArgsConstructor
public class ArtInitiationFacilityDTO {
    private String ageGroup;
    private String sex;
    private LocalDateTime dateEnrolled;
    private String siteId;
    private String artNumber;
    private String longitude;
    private String latitude;
    private String impiloCode;
    private String dhisCode;
    private String facilityName;
    private String districtName;
    private String provinceName;
}
