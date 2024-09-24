package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.AncBookedRegister;
import zw.org.mohcc.hiv.model.AncBookedRegisterPK;

@Repository
public interface AncBookedRegisterRepository  extends JpaRepository<AncBookedRegister, AncBookedRegisterPK> {

    @Override
    Page<AncBookedRegister> findAll(Pageable pageable);
}
