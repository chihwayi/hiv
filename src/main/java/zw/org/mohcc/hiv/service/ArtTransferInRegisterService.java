package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.ArtTransferInRegister;

public interface ArtTransferInRegisterService {

    Page<ArtTransferInRegister> findAll(Pageable pageable);
}