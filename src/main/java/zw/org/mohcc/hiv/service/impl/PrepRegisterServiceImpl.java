package zw.org.mohcc.hiv.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.PrepRegister;
import zw.org.mohcc.hiv.repository.PrepRegisterRepository;
import zw.org.mohcc.hiv.service.PrepRegisterService;

@Service
public class PrepRegisterServiceImpl implements PrepRegisterService {

    private static final Logger logger = LoggerFactory.getLogger(AncBookedRegisterServiceImpl.class);

    private final PrepRegisterRepository prepRegisterRepository;

    @Autowired
    public PrepRegisterServiceImpl(PrepRegisterRepository prepRegisterRepository) {
        this.prepRegisterRepository = prepRegisterRepository;
    }

    @Override
    @Cacheable("prepRegister")
    public Page<PrepRegister> findAll(Pageable pageable) {
        logger.info("Fetching all PREP booked registers");
        return prepRegisterRepository.findAll(pageable);
    }
}
