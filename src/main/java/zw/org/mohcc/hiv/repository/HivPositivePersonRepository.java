package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.HivPositivePerson;
import zw.org.mohcc.hiv.model.HivPositivePersonPK;

@Repository
public interface HivPositivePersonRepository extends JpaRepository<HivPositivePerson, HivPositivePersonPK> {

    @Override
    Page<HivPositivePerson> findAll(Pageable pageable);
}
