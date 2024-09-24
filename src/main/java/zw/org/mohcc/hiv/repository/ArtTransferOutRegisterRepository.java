package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtTransferOutRegister;
import zw.org.mohcc.hiv.model.ArtTransferOutRegisterPK;

@Repository
public interface ArtTransferOutRegisterRepository extends JpaRepository<ArtTransferOutRegister, ArtTransferOutRegisterPK> {

    @Override
    Page<ArtTransferOutRegister> findAll(Pageable pageable);
}
