package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtVisitRegister;
import zw.org.mohcc.hiv.repository.ArtVisitRegisterRepository;
import zw.org.mohcc.hiv.service.ArtVisitRegisterService;

@Service
public class ArtVisitRegisterServiceImpl implements ArtVisitRegisterService {

    private final ArtVisitRegisterRepository artVisitRegisterRepository;

    @Autowired
    public ArtVisitRegisterServiceImpl(ArtVisitRegisterRepository artVisitRegisterRepository) {
        this.artVisitRegisterRepository = artVisitRegisterRepository;
    }

    @Override
    public Page<ArtVisitRegister> findAll(Pageable pageable) {
        return artVisitRegisterRepository.findAll(pageable);
    }
}
