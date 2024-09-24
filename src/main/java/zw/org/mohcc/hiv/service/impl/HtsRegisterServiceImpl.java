package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.HtsRegister;
import zw.org.mohcc.hiv.repository.HtsRegisterRepository;
import zw.org.mohcc.hiv.service.HtsRegisterService;

@Service
public class HtsRegisterServiceImpl implements HtsRegisterService {

    private final HtsRegisterRepository htsRegisterRepository;

    @Autowired
    public HtsRegisterServiceImpl(HtsRegisterRepository htsRegisterRepository) {
        this.htsRegisterRepository = htsRegisterRepository;
    }

    @Override
    public Page<HtsRegister> findAll(Pageable pageable) {
        return htsRegisterRepository.findAll(pageable);
    }
}
