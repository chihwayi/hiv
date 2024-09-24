package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtWhoStageRegister;
import zw.org.mohcc.hiv.model.ArtWhoStageRegisterPK;

@Repository
public interface ArtWhoStageRegisterRepository extends JpaRepository<ArtWhoStageRegister, ArtWhoStageRegisterPK> {

    @Override
    Page<ArtWhoStageRegister> findAll(Pageable pageable);
}
