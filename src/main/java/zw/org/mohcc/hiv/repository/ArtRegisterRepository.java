package zw.org.mohcc.hiv.repository;

import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zw.org.mohcc.hiv.dto.ArtInitiationDemographics;
import zw.org.mohcc.hiv.model.ArtRegister;
import zw.org.mohcc.hiv.model.ArtRegisterPK;

import java.util.List;

@Repository
public interface ArtRegisterRepository extends JpaRepository<ArtRegister, ArtRegisterPK> {

    @Override
    @NonNull
    Page<ArtRegister> findAll(@NonNull Pageable pageable);

    @Query("SELECT ar.siteId, " +
            "YEAR(ar.dateEnrolled), " +
            "YEAR(ar.dateOfHivTest), COUNT(ar) " +
            "FROM ArtRegister ar " +
            "GROUP BY ar.siteId, YEAR(ar.dateEnrolled), YEAR(ar.dateOfHivTest)")
    Page<Object[]> findGroupedBySiteIdAndYear(Pageable pageable);

    @Query("""
    SELECT new zw.org.mohcc.hiv.dto.ArtInitiationDemographics(
        CASE
            WHEN EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM a.birthDate) < 15 THEN '0-14'
            WHEN EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM a.birthDate) BETWEEN 15 AND 24 THEN '15-24'
            WHEN EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM a.birthDate) BETWEEN 25 AND 49 THEN '25-49'
            ELSE '50+'
        END,
        a.sex,
        a.dateEnrolled,
        a.siteId,
        a.artNumber
    )
    FROM ArtRegister AS a
    WHERE a.dateEnrolled IS NOT NULL
""")
    List<ArtInitiationDemographics> getArtInitiationDemographics();






}
