package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.dto.ArtInitiationDemographics;
import zw.org.mohcc.hiv.dto.ArtInitiationFacilityDTO;
import zw.org.mohcc.hiv.dto.ArtInitiationGroupedByAge;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.dto.ArtRegisterGrouped;
import zw.org.mohcc.hiv.service.ArtInitiationFacilityDTOService;
import zw.org.mohcc.hiv.service.ArtRegisterService;

import java.util.List;

@RestController
@RequestMapping("/api/art-register")
public class ArtRegisterController {

    private final ArtRegisterService artRegisterService;
    private final ArtInitiationFacilityDTOService artInitiationFacilityDTOService;

    @Autowired
    public ArtRegisterController(ArtRegisterService artRegisterService, ArtInitiationFacilityDTOService artInitiationFacilityDTOService) {
        this.artRegisterService = artRegisterService;
        this.artInitiationFacilityDTOService = artInitiationFacilityDTOService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<Page<ArtRegister>> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<ArtRegister> artRegisterPage = artRegisterService.findAll(pageable);
        return ResponseEntity.ok(artRegisterPage);
    }

    @GetMapping("/get-all-grouped")
    public ResponseEntity<Page<ArtRegisterGrouped>> findAllGrouped(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<ArtRegisterGrouped> artRegisterPage = artRegisterService.findAllGroupedBySiteIdAndYear(pageable);
        return ResponseEntity.ok(artRegisterPage);
    }

    @GetMapping("/demographics")
    public ResponseEntity<List<ArtInitiationDemographics>> getArtInitiationDemographics() {
        List<ArtInitiationDemographics> artInitiationDemographics = artRegisterService.getArtInitiationDemographics();
        return ResponseEntity.ok(artInitiationDemographics);
    }

    @GetMapping("/group-age")
    public ResponseEntity<ArtInitiationGroupedByAge> getArtInitiationGroupedByAge() {
        ArtInitiationGroupedByAge groupedData = artRegisterService.getGroupedByAge();
        return ResponseEntity.ok(groupedData);
    }

    @GetMapping("/facility-data")
    public ResponseEntity<List<ArtInitiationFacilityDTO>> getArtInitiationFacilityData() {
        List<ArtInitiationFacilityDTO> combinedData = artInitiationFacilityDTOService.getArtInitiationFacilityData();
        return ResponseEntity.ok(combinedData);
    }

}
