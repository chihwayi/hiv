package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.dto.ArtInitiationDemographics;
import zw.org.mohcc.hiv.dto.ArtInitiationFacilityDTO;
import zw.org.mohcc.hiv.model.Facility;
import zw.org.mohcc.hiv.service.ArtInitiationFacilityDTOService;
import zw.org.mohcc.hiv.service.ArtRegisterService;
import zw.org.mohcc.hiv.service.FacilityService;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ArtInitiationFacilityDTOServiceImpl implements ArtInitiationFacilityDTOService {

    private final FacilityService facilityService;
    private final ArtRegisterService artRegisterService;

    @Autowired
    public ArtInitiationFacilityDTOServiceImpl(FacilityService facilityService, ArtRegisterService artRegisterService) {
        this.facilityService = facilityService;
        this.artRegisterService = artRegisterService;
    }

    public List<ArtInitiationFacilityDTO> getArtInitiationFacilityData() {
        List<Facility> facilities = facilityService.findAll();
        List<ArtInitiationDemographics> demographics = artRegisterService.getArtInitiationDemographics();

        // Map facilities by siteId for quick lookup
        Map<String, Facility> facilityMap = facilities.stream()
                .collect(Collectors.toMap(Facility::getSite_id, Function.identity()));

        // Merge demographics and facilities into the DTO

        return demographics.stream()
                .map(demo -> {
                    Facility facility = facilityMap.get(demo.getSiteId());
                    if (facility != null) {
                        return new ArtInitiationFacilityDTO(
                                demo.getAgeGroup(),
                                demo.getSex(),
                                demo.getDateEnrolled(),
                                demo.getSiteId(),
                                demo.getArtNumber(),
                                facility.getLongitude(),
                                facility.getLatitude(),
                                facility.getImpiloCode(),
                                facility.getDhisCode(),
                                facility.getFacilityName(),
                                facility.getDistrictName(),
                                facility.getProvinceName()
                        );
                    } else {
                        return null; // Or handle cases where Facility data is missing
                    }
                })
                .filter(Objects::nonNull) // Remove any null results
                .collect(Collectors.toList());
    }
}
