package zw.org.mohcc.hiv.dto;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Data
public class ArtInitiationGroupedByAge {
    private List<ArtInitiationDemographics> ageGroup_0_14 = new ArrayList<>();
    private List<ArtInitiationDemographics> ageGroup_15_24 = new ArrayList<>();
    private List<ArtInitiationDemographics> ageGroup_25_49 = new ArrayList<>();
    private List<ArtInitiationDemographics> ageGroup_50_plus = new ArrayList<>();

    public void addRecord(ArtInitiationDemographics record) {
        switch (record.getAgeGroup()) {
            case "0-14" -> ageGroup_0_14.add(record);
            case "15-24" -> ageGroup_15_24.add(record);
            case "25-49" -> ageGroup_25_49.add(record);
            default -> ageGroup_50_plus.add(record);
        }
    }

}

