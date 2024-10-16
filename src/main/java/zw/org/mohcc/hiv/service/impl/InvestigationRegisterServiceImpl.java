package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.InvestigationRegister;
import zw.org.mohcc.hiv.model.InvestigationRegisterPK;
import zw.org.mohcc.hiv.repository.InvestigationRegisterRepository;
import zw.org.mohcc.hiv.service.InvestigationRegisterService;

import java.util.Optional;

@Service
public class InvestigationRegisterServiceImpl implements InvestigationRegisterService {

    private final InvestigationRegisterRepository investigationRegisterRepository;

    @Autowired
    public InvestigationRegisterServiceImpl(InvestigationRegisterRepository investigationRegisterRepository) {
        this.investigationRegisterRepository = investigationRegisterRepository;
    }
    @Override
    public Page<InvestigationRegister> findAll(Pageable pageable) {
        return investigationRegisterRepository.findAll(pageable);
    }

    @Override
    public Optional<InvestigationRegister> getById(String laboratoryInvestigationId, String siteId) {
        InvestigationRegisterPK id = new InvestigationRegisterPK();
        id.setLaboratoryInvestigationId(laboratoryInvestigationId);
        id.setSiteId(siteId);
        return investigationRegisterRepository.findById(id);
    }
}
