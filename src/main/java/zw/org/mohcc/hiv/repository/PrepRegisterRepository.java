package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.PrepRegister;
import zw.org.mohcc.hiv.model.PrepRegisterPK;

@Repository
public interface PrepRegisterRepository extends JpaRepository<PrepRegister, PrepRegisterPK>{

    @Override
    Page<PrepRegister> findAll(Pageable pageable);
}
