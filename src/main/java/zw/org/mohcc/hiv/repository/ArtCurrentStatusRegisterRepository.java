package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegister;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegisterPK;

@Repository
public interface ArtCurrentStatusRegisterRepository extends JpaRepository<ArtCurrentStatusRegister, ArtCurrentStatusRegisterPK> {

    @Override
    Page<ArtCurrentStatusRegister> findAll(Pageable pageable);
}
