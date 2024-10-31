package zw.org.mohcc.hiv.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ArtInitiationDemographics {

    private final String ageGroup;
    private final String sex;
    private final LocalDateTime dateEnrolled;
    private final String siteId;
    private final String artNumber;

    public ArtInitiationDemographics(String ageGroup, String sex, LocalDateTime dateEnrolled, String siteId, String artNumber) {
        this.ageGroup = ageGroup;
        this.sex = sex;
        this.dateEnrolled = dateEnrolled;
        this.siteId = siteId;
        this.artNumber = artNumber;
    }

}
