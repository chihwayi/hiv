package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.Facility;
import zw.org.mohcc.hiv.repository.FacilityRepository;
import zw.org.mohcc.hiv.service.FacilityService;

import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {

    private final FacilityRepository facilityRepository;

    @Autowired
    public FacilityServiceImpl(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }
}
