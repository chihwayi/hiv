package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtWhoStageRegister;
import zw.org.mohcc.hiv.repository.ArtWhoStageRegisterRepository;
import zw.org.mohcc.hiv.service.ArtWhoStageRegisterService;

@Service
public class ArtWhoStageRegisterServiceImpl implements ArtWhoStageRegisterService {


    private final ArtWhoStageRegisterRepository artWhoStageRegisterRepository;

    @Autowired
    public ArtWhoStageRegisterServiceImpl(ArtWhoStageRegisterRepository artWhoStageRegisterRepository) {
        this.artWhoStageRegisterRepository = artWhoStageRegisterRepository;
    }

    @Override
    public Page<ArtWhoStageRegister> findAll(Pageable pageable) {
        return artWhoStageRegisterRepository.findAll(pageable);
    }
}
