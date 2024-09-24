package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.HtsScreeningRegister;

public interface HtsScreeningRegisterService {

    Page<HtsScreeningRegister> findAll(Pageable pageable);
}
