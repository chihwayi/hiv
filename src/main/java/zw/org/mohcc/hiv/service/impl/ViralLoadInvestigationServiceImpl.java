package zw.org.mohcc.hiv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.ViralLoadInvestigation;
import zw.org.mohcc.hiv.repository.ViralLoadInvestigationRepository;
import zw.org.mohcc.hiv.service.ViralLoadInvestigationService;

@Service
public class ViralLoadInvestigationServiceImpl implements ViralLoadInvestigationService {

    private final ViralLoadInvestigationRepository viralLoadInvestigationRepository;

    @Autowired
    public ViralLoadInvestigationServiceImpl(ViralLoadInvestigationRepository viralLoadInvestigationRepository) {
        this.viralLoadInvestigationRepository = viralLoadInvestigationRepository;
    }

    @Override
    public Page<ViralLoadInvestigation> findAll(Pageable pageable) {
        return viralLoadInvestigationRepository.findAll(pageable);
    }
}
