package zw.org.mohcc.hiv.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegister;
import zw.org.mohcc.hiv.service.ArtCurrentStatusRegisterService;

@Service
public class ArtCurrentStatusRegisterServiceImpl implements ArtCurrentStatusRegisterService {
    @Override
    public Page<ArtCurrentStatusRegister> findAll(Pageable pageable) {
        return null;
    }
}
