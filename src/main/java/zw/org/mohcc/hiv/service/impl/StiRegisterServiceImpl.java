package zw.org.mohcc.hiv.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.StiRegister;
import zw.org.mohcc.hiv.repository.StiRegisterRepository;
import zw.org.mohcc.hiv.service.StiRegisterService;

@Service
public class StiRegisterServiceImpl implements StiRegisterService {

    private static final Logger logger = LoggerFactory.getLogger(AncBookedRegisterServiceImpl.class);

    private final StiRegisterRepository stiRegisterRepository;

    @Autowired
    public StiRegisterServiceImpl(StiRegisterRepository stiRegisterRepository) {
        this.stiRegisterRepository = stiRegisterRepository;
    }

    @Override
    @Cacheable("stiRegister")
    public Page<StiRegister> findAll(Pageable pageable) {
        logger.info("Fetching all STI registered");
        return stiRegisterRepository.findAll(pageable);
    }
}
