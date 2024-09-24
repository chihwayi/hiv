package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.AncRegister;

public interface AncRegisterService {

    Page<AncRegister> findAll(Pageable pageable);
}
