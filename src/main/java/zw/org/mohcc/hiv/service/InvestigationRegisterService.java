package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.InvestigationRegister;

import java.util.Optional;

public interface InvestigationRegisterService {

    Page<InvestigationRegister> findAll(Pageable pageable);
    Optional<InvestigationRegister> getById(String laboratoryInvestigationId, String siteId);
}
