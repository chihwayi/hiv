package zw.org.mohcc.hiv.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class ArtStatus {

    private LocalDateTime visitDate;
    private String arvStatus;
    private String siteId;
    private Long count;

    public ArtStatus(LocalDateTime visitDate, String arvStatus, String siteId, Long count) {
        this.visitDate = visitDate;
        this.arvStatus = arvStatus;
        this.siteId = siteId;
        this.count = count;
    }

}
