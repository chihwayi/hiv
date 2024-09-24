package zw.org.mohcc.hiv.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.AncBookedRegister;
import zw.org.mohcc.hiv.model.AncBookedRegisterPK;
import zw.org.mohcc.hiv.repository.AncBookedRegisterRepository;
import zw.org.mohcc.hiv.service.AncBookedRegisterService;

import java.util.List;
import java.util.Optional;

@Service
public class AncBookedRegisterServiceImpl implements AncBookedRegisterService {

    private static final Logger logger = LoggerFactory.getLogger(AncBookedRegisterServiceImpl.class);

    private final AncBookedRegisterRepository ancBookedRegisterRepository;

    @Autowired
    public AncBookedRegisterServiceImpl(AncBookedRegisterRepository ancBookedRegisterRepository) {
        this.ancBookedRegisterRepository = ancBookedRegisterRepository;
    }

    @Override
    @Cacheable("ancBookedRegisters")
    public Page<AncBookedRegister> findAll(Pageable pageable) {
        logger.info("Fetching all ANC booked registers");
        return ancBookedRegisterRepository.findAll(pageable);
    }

    @Override
    @Cacheable(value = "ancBookedRegister", key = "#ancId + '_' + #patientId")
    public Optional<AncBookedRegister> getById(String ancId, String patientId) {
        logger.info("Fetching ANC booked register with ANC ID: {} and Patient ID: {}", ancId, patientId);
        AncBookedRegisterPK id = new AncBookedRegisterPK();
        id.setAncId(ancId);
        id.setPatientId(patientId);
        return ancBookedRegisterRepository.findById(id);
    }
}
