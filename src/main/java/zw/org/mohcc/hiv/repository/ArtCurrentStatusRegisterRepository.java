package zw.org.mohcc.hiv.repository;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.dto.ArtStatus;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegister;
import zw.org.mohcc.hiv.model.ArtCurrentStatusRegisterPK;

import java.util.List;

@Repository
public interface ArtCurrentStatusRegisterRepository extends JpaRepository<ArtCurrentStatusRegister, ArtCurrentStatusRegisterPK> {

    @Override
    @NonNull
    Page<ArtCurrentStatusRegister> findAll(@NonNull Pageable pageable);

    @Query("SELECT new zw.org.mohcc.hiv.dto.ArtStatus(a.visitDate, a.arvStatus, a.siteId, COUNT(a)) " +
            "FROM ArtCurrentStatusRegister a " +
            "GROUP BY a.visitDate, a.arvStatus, a.siteId " +
            "ORDER BY a.visitDate ASC")
    List<ArtStatus> findArtStatusOverTime();
}
