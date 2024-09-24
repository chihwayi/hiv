package zw.org.mohcc.hiv.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.model.ArtRegisterPK;
import zw.org.mohcc.hiv.dto.ArtRegisterGrouped;

import java.util.List;

@Repository
public interface ArtRegisterRepository extends JpaRepository<ArtRegister, ArtRegisterPK> {

    @Override
    Page<ArtRegister> findAll(Pageable pageable);

    @Query("SELECT ar.siteId, " +
            "YEAR(ar.dateEnrolled), " +
            "YEAR(ar.dateOfHivTest), COUNT(ar) " +
            "FROM ArtRegister ar " +
            "GROUP BY ar.siteId, YEAR(ar.dateEnrolled), YEAR(ar.dateOfHivTest)")
    Page<Object[]> findGroupedBySiteIdAndYear(Pageable pageable);

}
