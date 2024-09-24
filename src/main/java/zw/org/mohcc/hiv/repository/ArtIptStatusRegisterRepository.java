package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtIptStatusRegister;
import zw.org.mohcc.hiv.model.ArtIptStatusRegisterPK;

@Repository
public interface ArtIptStatusRegisterRepository extends JpaRepository<ArtIptStatusRegister, ArtIptStatusRegisterPK> {

    @Override
    Page<ArtIptStatusRegister> findAll(Pageable pageable);
}
