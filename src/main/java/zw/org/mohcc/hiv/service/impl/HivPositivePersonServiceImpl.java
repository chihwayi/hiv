package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.HivPositivePerson;
import zw.org.mohcc.hiv.repository.HivPositivePersonRepository;
import zw.org.mohcc.hiv.service.HivPositivePersonService;

@Service
public class HivPositivePersonServiceImpl implements HivPositivePersonService {


    private final HivPositivePersonRepository hivPositivePersonRepository;

    @Autowired
    public HivPositivePersonServiceImpl(HivPositivePersonRepository hivPositivePersonRepository){
        this.hivPositivePersonRepository = hivPositivePersonRepository;
    }
    @Override
    public Page<HivPositivePerson> findAll(Pageable pageable) {
        return hivPositivePersonRepository.findAll(pageable);
    }
}
