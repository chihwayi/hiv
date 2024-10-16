package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.InvestigationRegister;
import zw.org.mohcc.hiv.model.InvestigationRegisterPK;

@Repository
public interface InvestigationRegisterRepository extends JpaRepository<InvestigationRegister, InvestigationRegisterPK> {
    Page<InvestigationRegister> findAll(Pageable pageable);
}
