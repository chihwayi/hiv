package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.dto.ArtInitiationDemographics;
import zw.org.mohcc.hiv.dto.ArtInitiationGroupedByAge;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.dto.ArtRegisterGrouped;

import java.util.List;

public interface ArtRegisterService {

    Page<ArtRegister> findAll(Pageable pageable);
    Page<ArtRegisterGrouped> findAllGroupedBySiteIdAndYear(Pageable pageable);
    List<ArtInitiationDemographics> getArtInitiationDemographics();
    ArtInitiationGroupedByAge getGroupedByAge();
}
