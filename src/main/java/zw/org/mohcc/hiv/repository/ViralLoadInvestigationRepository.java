package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ViralLoadInvestigation;
import zw.org.mohcc.hiv.model.ViralLoadInvestigationPK;

@Repository
public interface ViralLoadInvestigationRepository extends JpaRepository<ViralLoadInvestigation, ViralLoadInvestigationPK> {

    @Override
    Page<ViralLoadInvestigation> findAll(Pageable pageable);
}
