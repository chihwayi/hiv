package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.dto.ArtInitiationDemographics;
import zw.org.mohcc.hiv.dto.ArtInitiationGroupedByAge;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.dto.ArtRegisterGrouped;
import zw.org.mohcc.hiv.repository.ArtRegisterRepository;
import zw.org.mohcc.hiv.service.ArtRegisterService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtRegisterServiceImpl implements ArtRegisterService {

    private final ArtRegisterRepository artRegisterRepository;

    @Autowired
    public ArtRegisterServiceImpl(ArtRegisterRepository artRegisterRepository) {
        this.artRegisterRepository = artRegisterRepository;
    }

    @Override
    public Page<ArtRegister> findAll(Pageable pageable) {
        return artRegisterRepository.findAll(pageable);
    }

    @Override
    public Page<ArtRegisterGrouped> findAllGroupedBySiteIdAndYear(Pageable pageable) {
        Page<Object[]> results = artRegisterRepository.findGroupedBySiteIdAndYear(pageable);
        List<ArtRegisterGrouped> groupedData = results.stream()
                .map(record -> new ArtRegisterGrouped(
                        (String) record[0],
                        (Integer) record[1],
                        (Integer) record[2],
                        (Long) record[3]
                ))
                .collect(Collectors.toList());
        return new PageImpl<>(groupedData, pageable, results.getTotalElements());
    }

    @Override
    public List<ArtInitiationDemographics> getArtInitiationDemographics() {
        return artRegisterRepository.getArtInitiationDemographics();
    }

    @Override
    public ArtInitiationGroupedByAge getGroupedByAge() {
        List<ArtInitiationDemographics> records = artRegisterRepository.getArtInitiationDemographics();
        ArtInitiationGroupedByAge groupedDTO = new ArtInitiationGroupedByAge();

        for (ArtInitiationDemographics record : records) {
            groupedDTO.addRecord(record);
        }

        return groupedDTO;
    }

}
