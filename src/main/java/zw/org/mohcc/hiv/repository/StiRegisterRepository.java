package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.StiRegister;
import zw.org.mohcc.hiv.model.StiRegisterPK;

@Repository
public interface StiRegisterRepository extends JpaRepository<StiRegister, StiRegisterPK> {

    @Override
    Page<StiRegister> findAll(Pageable pageable);
}
