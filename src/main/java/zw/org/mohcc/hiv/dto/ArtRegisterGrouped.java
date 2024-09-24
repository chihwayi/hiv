package zw.org.mohcc.hiv.dto;

import lombok.Data;

@Data
public class ArtRegisterGrouped {

    private String siteId;
    private Integer yearEnrolled;
    private Integer yearHivTest;
    private Long count;

    public ArtRegisterGrouped(String siteId, Integer yearEnrolled, Integer yearHivTest, Long count) {
        this.siteId = siteId;
        this.yearEnrolled = yearEnrolled;
        this.yearHivTest = yearHivTest;
        this.count = count;
    }
}
