package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.HtsRegisterTest;
import zw.org.mohcc.hiv.repository.HtsRegisterTestRepository;
import zw.org.mohcc.hiv.service.HtsRegisterTestService;

@Service
public class HtsRegisterTestServiceImpl implements HtsRegisterTestService {

    private final HtsRegisterTestRepository htsRegisterTestRepository;

    @Autowired
    public HtsRegisterTestServiceImpl(HtsRegisterTestRepository htsRegisterTestRepository) {
        this.htsRegisterTestRepository = htsRegisterTestRepository;
    }

    @Override
    public Page<HtsRegisterTest> findAll(Pageable pageable) {
        return htsRegisterTestRepository.findAll(pageable);
    }
}
