package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.dto.ArtStatus;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegister;
import zw.org.mohcc.hiv.repository.ArtCurrentStatusRegisterRepository;
import zw.org.mohcc.hiv.service.ArtCurrentStatusRegisterService;

import java.util.List;

@Service
public class ArtCurrentStatusRegisterServiceImpl implements ArtCurrentStatusRegisterService {

    private final ArtCurrentStatusRegisterRepository artCurrentStatusRegisterRepository;

    @Autowired
    public ArtCurrentStatusRegisterServiceImpl(ArtCurrentStatusRegisterRepository artCurrentStatusRegisterRepository) {
        this.artCurrentStatusRegisterRepository = artCurrentStatusRegisterRepository;
    }

    @Override
    public Page<ArtCurrentStatusRegister> findAll(Pageable pageable) {
        return artCurrentStatusRegisterRepository.findAll(pageable);
    }

    @Override
    public List<ArtStatus> getArtStatusOverTime() {
        return artCurrentStatusRegisterRepository.findArtStatusOverTime();
    }


}
