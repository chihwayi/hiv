package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ArtTransferInRegister;
import zw.org.mohcc.hiv.repository.ArtTransferInRegisterRepository;
import zw.org.mohcc.hiv.service.ArtTransferInRegisterService;

@Service
public class ArtTransferInRegisterServiceImpl implements ArtTransferInRegisterService {

    private final ArtTransferInRegisterRepository artTransferInRegisterRepository;

    @Autowired
    public ArtTransferInRegisterServiceImpl(ArtTransferInRegisterRepository artTransferInRegisterRepository) {
        this.artTransferInRegisterRepository = artTransferInRegisterRepository;
    }

    @Override
    public Page<ArtTransferInRegister> findAll(Pageable pageable) {
        return artTransferInRegisterRepository.findAll(pageable);
    }
}
