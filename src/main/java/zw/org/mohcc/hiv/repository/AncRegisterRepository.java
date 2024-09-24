package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.AncRegister;
import zw.org.mohcc.hiv.model.AncRegisterPK;

@Repository
public interface AncRegisterRepository extends JpaRepository<AncRegister, AncRegisterPK> {

    @Override
    Page<AncRegister> findAll(Pageable pageable);
}
