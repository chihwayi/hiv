package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.AncVisit;
import zw.org.mohcc.hiv.model.AncVisitPK;

@Repository
public interface AncVisitRepository extends JpaRepository<AncVisit, AncVisitPK> {

    @Override
    Page<AncVisit> findAll(Pageable pageable);
}
