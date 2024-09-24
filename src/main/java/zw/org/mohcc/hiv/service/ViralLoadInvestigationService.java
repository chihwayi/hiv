package zw.org.mohcc.hiv.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import zw.org.mohcc.hiv.model.ViralLoadInvestigation;

public interface ViralLoadInvestigationService {

    Page<ViralLoadInvestigation> findAll(Pageable pageable);
}
